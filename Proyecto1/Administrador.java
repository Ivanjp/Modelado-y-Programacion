
import java.util.Scanner;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Hashtable;
import java.util.Random;

public class Administrador implements Usuario {

    ColeccionProfes c = new ColeccionProfes();
    String materia1;//materia 1 del alumno
    String materia2;//materia 2 del alumno
    //Grupos que se asignan al alumno
    String grupoM1 = "A";
    String grupoM2 = "A";
    String opT;//opcion tecnica del alumno
    String grupoPr;//grupo asignado al profesor contratado
    boolean opst = false;
    Profesor profcontratados[] = new Profesor[20];//Arreglo que guarda a los profesores contratados
    int pos = 1;//Posicion del arreglo para agregar profesores

    //listo
    public void inscribirAlumno() throws NoSuchAlgorithmException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu nombre completo: \n");
        String nombre = sc.nextLine();
        System.out.print("¿Cual es el area a la que deseas estudiar?. Ingresa 1 para Físico-Matemáticas, 2 para Ciencias Biológicas y de la Salud, 3 para Ciencias Sociales o 4 para Humanidades-Artes): \n");
        int sel = sc.nextInt();
        String area = this.asignaArea(sel);
        boolean resp1 = this.verifica(materia1);
        boolean resp2 = this.verifica(materia2);
        if (resp1 == false && resp2 == false) {
            System.out.println("Aun no hay profesores impartiendo estas clases intenta despues.\n" + "Registro fallido.\n");
        } else if ((resp1 == false && resp2 == true) || (resp1 == true && resp2 == false)) {
            System.out.println("Aun no hay profesores impartiendo una de tus clases intenta despues.\n" + "Registro fallido.\n");
        } else {
            this.opTecnica();
            long id = generaIDAl();
            this.asignaMaterias(area);
            Alumno al = new Alumno(nombre, id, area, materia1, materia2, grupoM1, grupoM2, opT,opst);
            this.guardaAlumno(al, materia1);
            this.guardaAlumno(al, materia2);
            this.cambiaGrupo();
            System.out.println("Registro exitoso!!\n"
                    + "Datos registrados del alumno:\n"
                    + "Nombre del alumno: " + al.getNombre() + "\n"
                    + "ID del alumno: " + al.getId_alumno() + "\n"
                    + "Materia 1: " + al.getMateria1() + "\n"
                    + "Grupo: " + al.getGrupoM1() + "\n"
                    + "Materia 2: " + al.getMateria2() + "\n"
                    + "Grupo: " + al.getGrupoM2() + "\n"
                    + "Opcion Tecnica: " + al.getOp_tecnica() + "\n");
            Thread.sleep(5 * 1000);
        }

    }

    //Listo
    public void contratarProfesor() throws NoSuchAlgorithmException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu nombre completo: \n");
        String nombre = sc.nextLine();
        System.out.print("¿Deseas ser profesor de area o de opcion tecnica?. Ingresa 1 para area o 2 para opcion tecnica: \n");
        int n = sc.nextInt();
        if (n == 2) {
            System.out.print("¿Que opcion tecnica deseas impartir?. Ingresa 1 para Agente de viajes y hotelería, 2 para Fotógrafo Laboratorista y Prensa, 3 para Nutriólogo, o 4 para Laboratorista Químico): \n");
            int sel = sc.nextInt();
            String mt = this.asignaopTec(sel);
            if (this.verifica(mt) == true) {
                System.out.println("No se te asigno la opcion tecnica por que ya hay un profesor impartiendola. Registro fallido.");
            } else {
                String area = "Sin area";
                boolean optec = true;
                long id = this.generaIDProf();
                Profesor p = new Profesor(nombre, id, mt, "Sin especificar", area, optec);
                this.agregaProfesor(p);
                System.out.println("Registro exitoso!!\n"
                        + "Datos registrados del profesor:\n"
                        + "Nombre: " + p.getNombre() + "\n"
                        + "ID del profesor: " + p.getId_prof() + "\n"
                        + "Materia impartida: " + p.getMateria() + "\n"
                        + "Grupo: " + p.getGrupo() + "\n"
                        + "Area: " + p.getArea() + "\n");
                Thread.sleep(5 * 1000);
            }
        } else {
            System.out.print("¿En cual area quieres dar clase?. Ingresa 1 para Físico-Matemáticas, 2 para Ciencias Biológicas y de la Salud, 3 para Ciencias Sociales o 4 para Humanidades-Artes): \n");
            int sel = sc.nextInt();
            String area = this.asignaArea(sel);
            long id = this.generaIDProf();
            boolean optec = false;
            String mt = this.asignaMateriaProf(area);
            if (mt.equals("Sin Especificar")) {
                System.out.println("Registro fallido.");
            } else {
                Profesor p = new Profesor(nombre, id, mt, grupoPr, area, optec);
                this.agregaProfesor(p);
                System.out.println("Registro exitoso!!\n"
                        + "Datos registrados del profesor:\n"
                        + "Nombre: " + p.getNombre() + "\n"
                        + "ID del profesor: " + p.getId_prof() + "\n"
                        + "Materia impartida: " + p.getMateria() + "\n"
                        + "Grupo: " + p.getGrupo() + "\n"
                        + "Area: " + p.getArea() + "\n");
                Thread.sleep(5 * 1000);
            }
        }

    }

    public void consultaAlumInscritos() {
        
        Hashtable<Integer, Alumno> alumnosInscritos;
        
        if (profcontratados[0] == null) {
            System.out.println("No hay alumnos inscritos");
        } else {
            c.Arreglo(profcontratados);
            Iterador iter = c.getIterador();
            while (iter.hasNext()) {
                Profesor p = (Profesor) iter.next();
                if (p == null) {
                    
                } else  {
                    alumnosInscritos = p.getLista();
                    
                }
                 System.out.println("Nombre: " + p.getNombre() + "\n"
                            + "ID: " + p.getId_prof() + "\n"
                            + "Area: " + p.getArea() + "\n"
                            + "Materia: " + p.getMateria() + "\n"
                            + "Grupo: " + p.getGrupo() + "\n");
            }
        }
    }

    public void consultaAlumnosArea() {

    }

    public void consultaAlumnosOT() {

    }

    //Listo
    public void consultaProfesores() {
        if (profcontratados[0] == null) {
            System.out.println("Aun no hay profesores contratados");
        } else {
            c.Arreglo(profcontratados);
            Iterador iter = c.getIterador();
            while (iter.hasNext()) {
                Profesor p = (Profesor) iter.next();
                if (p == null) {

                } else {
                    System.out.println("Nombre: " + p.getNombre() + "\n"
                            + "ID: " + p.getId_prof() + "\n"
                            + "Area: " + p.getArea() + "\n"
                            + "Materia: " + p.getMateria() + "\n"
                            + "Grupo: " + p.getGrupo() + "\n");
                }
            }
        }
    }

    public void graduar(long al) {

    }

    public void darBaja(long al) {
        
    }

    public void despedir(long pr) {
        if (profcontratados[0] == null) {
            System.out.println("Aun no hay profesores contratados");
        } else {
            c.Arreglo(profcontratados);
            Iterador iter = c.getIterador();
            while (iter.hasNext()) {
                Profesor p = (Profesor) iter.next();
                if (p.getId_prof() == pr) {

                }
            }
        }
    }

//    @Override
//    public void getDatosUsuario() {
//        System.out.println("id: " + id_godinez + " nombre: " + nombre
//                + " puesto: Godinez CEO");
//
//        System.out.println("Subordinados explotables del CEO: \n");
//
//        for (Godinez godi : godinezManagerExplotables) {
//            System.out.print("   ");
//            godi.getDatosEmpleado();
//        }
//    }
    @Override
    public void getDatosUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //Listo
    public String asignaArea(int op) {

        if (op == 1) {
            return "Físico-Matemáticas";
        } else if (op == 2) {
            return "Ciencias Biológicas y de la Salud";
        } else if (op == 3) {
            return "Ciencias Sociales";
        } else {
            return "Humanidades-Artes";
        }
    }

    //Listo
    public String asignaopTec(int op) {

        if (op == 1) {
            return "Agente de viajes y hotelería";
        } else if (op == 2) {
            return "Fotógrafo Laboratorista y Prensa";
        } else if (op == 3) {
            return "Nutriólogo";
        } else {
            return "Laboratorista Químico";
        }
    }

    //Listo
    public void asignaMaterias(String ar) {
        if (ar.equals("Físico-Matemáticas")) {
            materia1 = "Fisica";
            materia2 = "Matematicas";
        } else if (ar.equals("Ciencias Biológicas y de la Salud")) {
            materia1 = "Biologia";
            materia2 = "Quimica";
        } else if (ar.equals("Ciencias Sociales")) {
            materia1 = "Historia";
            materia2 = "Ciencias Sociales";
        } else if (ar.equals("Humanidades-Artes")) {
            materia1 = "Filosofia";
            materia2 = "Artes Plasticas";
        }
    }

    //Listo
    public String asignaMateriaProf(String area) {
        Scanner esc = new Scanner(System.in);
        if (area.equals("Físico-Matemáticas")) {
            System.out.println("¿Cual materia quieres impartir? Ingresa 1 para Fisica o 2 para Matematicas.");
            int n = esc.nextInt();
            if (n == 1) {
                return this.verificaDisp("Fisica");
            } else {
                return this.verificaDisp("Matematicas");
            }

        } else if (area.equals("Ciencias Biológicas y de la Salud")) {
            System.out.println("¿Cual materia quieres impartir? Ingresa 1 para Biologia o 2 para Quimica.");
            int n = esc.nextInt();
            if (n == 1) {
                return this.verificaDisp("Biologia");
            } else {
                return this.verificaDisp("Quimica");
            }
        } else if (area.equals("Ciencias Sociales")) {
            System.out.println("¿Cual materia quieres impartir? Ingresa 1 para Historia o 2 para Ciencias Sociales.");
            int n = esc.nextInt();
            if (n == 1) {
                return this.verificaDisp("Historia");
            } else {
                return this.verificaDisp("Ciencias Sociales");
            }
        } else {
            System.out.println("¿Cual materia quieres impartir? Ingresa 1 para Filosofia o 2 para Artes Plasticas.");
            int n = esc.nextInt();
            if (n == 1) {
                return this.verificaDisp("Filosofia");
            } else {
                return this.verificaDisp("Artes Plasticas");
            }
        }

    }

    //Listo
    public long generaIDAl() throws NoSuchAlgorithmException {
        String[] symbols = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        int length = 9;
        Random random = SecureRandom.getInstanceStrong();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int indexRandom = random.nextInt(symbols.length);
            sb.append(symbols[indexRandom]);
        }
        String pass = sb.toString();
        long id = Long.parseLong(pass);
        return id;
    }

    //Listo
    public long generaIDProf() throws NoSuchAlgorithmException {
        String[] symbols = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        int length = 10;
        Random random = SecureRandom.getInstanceStrong();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int indexRandom = random.nextInt(symbols.length);
            sb.append(symbols[indexRandom]);
        }
        String pass = sb.toString();
        long id = Long.parseLong(pass);
        return id;
    }

    //Listo
    public void cambiaGrupo() {
        if (grupoM1.equals("A")) {
            grupoM1 = "B";
            grupoM2 = "B";
        } else if (grupoM1.equals("B")) {
            grupoM1 = "A";
            grupoM2 = "A";
        }
    }

    //Listo*
    public void opTecnica() {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("¿La escuela cuenta con las siguientes opciones tecnicas (Agente de viajes y hotelería, Fotógrafo Laboratorista y Prensa, Nutriólogo. y Laboratorista Químico). ¿Te gustaria cursar alguna opcion tecnica?: \n");
        String op = sc1.nextLine();
        if (op.equals("Si") || op.equals("si")) {
            System.out.println("Ingresa 1 para Agente de viajes y hotelería, 2 para Fotógrafo Laboratorista y Prensa, 3 para Nutriólogo, o 4 para Laboratorista Químico");
            int n = sc1.nextInt();
            switch (n) {
                case 1:
                    if (this.verifica("Agente de viajes y hotelería") == true) {
                        System.out.println("Listo, ya estas registrado en tu opcion tecnica ");
                        opT = "Agente de viajes y hotelería";
                        opst = true;
                    } else {
                        System.out.println("Actualmente no tenemos un profesor dando esta opcion tecnica, puedes registrate mas tarde desde tu perfil.");
                        opT = "Sin datos";
                    }
                    break;
                case 2:
                    if (this.verifica("Fotógrafo Laboratorista y Prensa") == true) {
                        System.out.println("Listo, ya estas registrado en tu opcion tecnica");
                        opT = "Fotógrafo Laboratorista y Prensa";
                         opst = true;
                    } else {
                        System.out.println("Actualmente no tenemos un profesor dando esta opcion tecnica, puedes registrate mas tarde desde tu perfil.");
                        opT = "Sin datos";
                    }
                    break;
                case 3:
                    if (this.verifica("Nutriólogo") == true) {
                        System.out.println("Listo, ya estas registrado en tu opcion tecnica ");
                        opT = "Nutriólogo";
                         opst = true;
                    } else {
                        System.out.println("Actualmente no tenemos un profesor dando esta opcion tecnica, puedes registrate mas tarde desde tu perfil.");
                        opT = "Sin datos";
                    }
                    break;
                case 4:
                    if (this.verifica("Laboratorista Químico") == true) {
                        System.out.println("Listo, ya estas registrado en tu opcion tecnica ");
                        opT = "Laboratorista Químico";
                         opst = true;
                    } else {
                        System.out.println("Actualmente no tenemos un profesor dando esta opcion tecnica, puedes registrate mas tarde desde tu perfil.");
                        opT = "Sin datos";
                    }
                    break;
                default:
                    System.out.println("Datos incorrectos.\n");
                    break;
            }
        } else {
            System.out.println("Si cambias de opinion puedes inscribirte a una opcion tecnica despues desde tu perfil.");
            opT = "Sin datos";
        }
    }

    //Listo
    public boolean verifica(String opcion) {

        if (profcontratados[0] == null) {
            return false;
        } else {
            c.Arreglo(profcontratados);
            Iterador iter = c.getIterador();
            while (iter.hasNext()) {
                Profesor p = (Profesor) iter.next();
                if (p == null) {
                    
                } else if (p.getMateria().equals(opcion)) {
                    return true;
                }
            }
        }
        return true;
    }

    //Listo
    public String verificaDisp(String n) {

        boolean gA = false;
        boolean gB = false;

        if (profcontratados[0] == null) {
            System.out.println("Materia asignada");
            grupoPr = "A";
            return n;
        } else {
            c.Arreglo(profcontratados);
            Iterador iter = c.getIterador();
            while (iter.hasNext()) {
                Profesor p = (Profesor) iter.next();
                if (p == null) {

                } else if (p.getMateria().equals(n) && p.getGrupo().equals("A")) {
                    gA = true;
                } else if (p.getMateria().equals(n) && p.getGrupo().equals("B")) {
                    gB = true;
                }
            }

            if (gA == true && gB == true) {
                System.out.println("No se pudo asignar un curso ya que estos ya cuentan con un profesor.");
                return "Sin Especificar";
            } else if (gA == true && gB == false) {
                System.out.println("Materia asignada");
                grupoPr = "B";
                return n;
            }
        }

        return n;

    }

    //listo
    public void guardaAlumno(Alumno a, String m) {
   
        
        c.Arreglo(profcontratados);
        Iterador iter = c.getIterador();
        while (iter.hasNext()) {
            Profesor p = (Profesor) iter.next();
            if(p == null){
                
            }else{
                if(p.getMateria().equals(m)){
                    p.guardaAlumno(a.getId_alumno(), a);
                  
                }
            }
        }
  
    }

    public void agregaProfesor(Profesor p) {
        if (profcontratados[0] == null) {
            profcontratados[0] = p;
        } else if (pos <= 19) {
            profcontratados[pos] = p;
            pos++;
        } else {
            System.out.println("Se a alcanzado el limite de profesores contratados.");
        }
    }

}

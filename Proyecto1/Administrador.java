
import java.util.Scanner;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Random;

public class Administrador implements Usuario {

    /**
     * Se construye un objeto ColeccionProfes para utilizar el Iterator
     */
    ColeccionProfes c = new ColeccionProfes();

    /**
     * Variables que guardan las materias de los alumnos
     */
    String materia1;
    String materia2;

    /**
     * Variables que guardan los grupos del alumno
     */
    String grupoM1 = "A";
    String grupoM2 = "A";

    /**
     * Variable que guarda la opcion tecnica del alumno
     */
    String opT;

    /**
     * Variable que guarda el grupo que se le asigna al profesor
     */
    String grupoPr;

    /**
     * Variable que es utilizada para identificar si un alumno cursa una opcion
     * tecnica
     */
    boolean opst = false;

    /**
     * Arreglo que almacena los profesores contratados
     */
    Profesor profcontratados[] = new Profesor[20];
    int pos = 1;//Posicion del arreglo para agregar profesores

    /**
     * Método que se utiliza para inscribr a un alumno al sistema
     * @exception NoSuchAlgorithmException
     * @throws java.lang.InterruptedException
     */
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
            Alumno al = new Alumno(nombre, id, area, materia1, materia2, grupoM1, grupoM2, opT, opst);
            this.guardaAlumno(al, materia1);
            this.guardaAlumno(al, materia2);
            if (opst == true) {
                this.guardaAlumno(al, opT);
            }
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

    /**
     * Método que se utiliza para contratar a los profesores
     * @exception NoSuchAlgorithmException, InterruptedException
     */
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

    /**
     * Método que se utiliza para consultar los alumnos que estudian en la
     * escuela
     */
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

                } else {
                    alumnosInscritos = p.getLista();
                    Enumeration<Alumno> valores = alumnosInscritos.elements();
                    while (valores.hasMoreElements()) {
                        Alumno a = valores.nextElement();
                        System.out.println("Nombre: " + a.getNombre() + "\n"
                                + "ID: " + a.getId_alumno() + "\n"
                                + "Area: " + a.getAreaA() + "\n"
                                + "Materia1: " + a.getMateria1() + "\n"
                                + "Grupo: " + a.getGrupoM1() + "\n"
                                + "Materia2: " + a.getMateria2() + "\n"
                                + "Grupo: " + a.getGrupoM2() + "\n"
                                + "Op Tecnica: " + a.getOp_tecnica() + "\n");
                    }
                }

            }
        }
    }

    /**
     * Método que se utiliza para consultar a los alumnos de un area en
     * especifico
     * @param ar Representa el area con la que se quiere buscar los
     * alumnos
     */
    public void consultaAlumnosArea(String ar) {
        Hashtable<Integer, Alumno> alumnosInscritos;

        if (profcontratados[0] == null) {
            System.out.println("No hay alumnos inscritos");
        } else {
            c.Arreglo(profcontratados);
            Iterador iter = c.getIterador();
            while (iter.hasNext()) {
                Profesor p = (Profesor) iter.next();
                if (p == null) {

                } else {
                    alumnosInscritos = p.getLista();
                    Enumeration<Alumno> valores = alumnosInscritos.elements();
                    while (valores.hasMoreElements()) {
                        Alumno a = valores.nextElement();
                        if (a.getAreaA().equals(ar)) {
                            System.out.println("Nombre: " + a.getNombre() + "\n"
                                    + "ID: " + a.getId_alumno() + "\n"
                                    + "Area: " + a.getAreaA() + "\n"
                                    + "Materia1: " + a.getMateria1() + "\n"
                                    + "Grupo: " + a.getGrupoM1() + "\n"
                                    + "Materia2: " + a.getMateria2() + "\n"
                                    + "Grupo: " + a.getGrupoM2() + "\n"
                                    + "Op Tecnica: " + a.getOp_tecnica() + "\n");
                        } else {
                            System.out.println("Esta area no cuenta con alumnos");
                        }
                    }

                }
            }
        }
    }

    /**
     * Método que se utiliza para consultar a los alumnos de las opciones
     * tecnica
     */
    public void consultaAlumnosOT() {
        Hashtable<Integer, Alumno> alumnosInscritos;

        if (profcontratados[0] == null) {
            System.out.println("No hay alumnos inscritos");
        } else {
            c.Arreglo(profcontratados);
            Iterador iter = c.getIterador();
            while (iter.hasNext()) {
                Profesor p = (Profesor) iter.next();
                if (p == null) {

                } else {
                    alumnosInscritos = p.getLista();
                    Enumeration<Alumno> valores = alumnosInscritos.elements();
                    while (valores.hasMoreElements()) {
                        Alumno a = valores.nextElement();
                        if (a.getOt() == true) {
                            System.out.println("Nombre: " + a.getNombre() + "\n"
                                    + "ID: " + a.getId_alumno() + "\n"
                                    + "Area: " + a.getAreaA() + "\n"
                                    + "Materia1: " + a.getMateria1() + "\n"
                                    + "Grupo: " + a.getGrupoM1() + "\n"
                                    + "Materia2: " + a.getMateria2() + "\n"
                                    + "Grupo: " + a.getGrupoM2() + "\n"
                                    + "Op Tecnica: " + a.getOp_tecnica() + "\n");
                        }
                    }
                }

            }

        }
    }

    /**
     * Método que se utiliza para consultar a los alumnos de un area en
     * especifico
     */
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

    /**
     * Método que se utiliza para graduar a un alumno
     * @param al Alumno que se quiere graduar
     */
    public void graduar(long al) {
        Hashtable<Integer, Alumno> alumnosInscritos;

        if (profcontratados[0] == null) {
            System.out.println("No hay alumnos inscritos");
        } else {
            c.Arreglo(profcontratados);
            Iterador iter = c.getIterador();
            while (iter.hasNext()) {
                Profesor p = (Profesor) iter.next();
                if (p == null) {

                } else {
                    alumnosInscritos = p.getLista();
                    Alumno a = alumnosInscritos.get((int) al);
                    if (a.getOt() == true) {
                        Certificado cer = new AlumnoconOT();
                        cer.generaCertificado(a, profcontratados);
                    } else {
                        Certificado cer = new AlumnosinOT();
                        cer.generaCertificado(a, profcontratados);
                    }
                }

            }

        }
    }

    /**
     * Método que se utiliza para dar de baja a un alumno
     * @param al Alumno que se quiere dar de baja
     */
    public void darBaja(long al) {
        Hashtable<Integer, Alumno> alumnosInscritos;

        if (profcontratados[0] == null) {
            System.out.println("No hay alumnos inscritos");
        } else {
            c.Arreglo(profcontratados);
            Iterador iter = c.getIterador();
            while (iter.hasNext()) {
                Profesor p = (Profesor) iter.next();
                if (p == null) {

                } else {
                    alumnosInscritos = p.getLista();
                    alumnosInscritos.remove((int) al);
                }

            }

        }
    }
    
    /**
     * Método que se utiliza para despedir a un profesor
     * @param pr Profesor que se quiere despedir
     */
    public void despedir(long pr) {

        Profesor[] aux = new Profesor[20];
        int auxi = 0;
        if (profcontratados[0] == null) {
            System.out.println("Aun no hay profesores contratados");
        } else {
            c.Arreglo(profcontratados);
            Iterador iter = c.getIterador();
            while (iter.hasNext()) {
                Profesor p = (Profesor) iter.next();
                if (p == null) {

                } else if (p.getId_prof() != pr) {
                    aux[auxi] = p;
                    auxi++;

                }
            }
            profcontratados = aux;
        }
    }

    /**
     * Método que se utiliza para poder cumplir con la estructura del patron Composite 
     * por lo que este metodo no es de relevancia para el programa.
     */
    @Override
    public void adorno() {
        System.out.println("Soy un adorno");
    }

    /**
     * Método que se utiliza para asignarle una area al usuario
     * @param op Opcion que escogio el usuario dependiendo del area de su interes
     * @return Area designada al usuario
     */
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

    /**
     * Método que se utiliza para asignarle una opcion tecnica al usuario
     * @param op String Opcion que escogio el usuario dependiendo de la opcion tecnica de su interes
     * @return String Opcion tecnica escogida
     */
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

    /**
     * Método que se utiliza para asignarle materias al alumno dependiendo del area que escogio
     * @param ar Area escogida y asignada al Alumno
     */
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

    /**
     * Método que se utiliza para asignarle una materia al Profesor
     * @param area Area escogida y asignada al Profesor
     * @return String Materia asignada al profesor
     */
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

    /**
     * Método que se utiliza para generarle un id al alumno
     * @return ID del alumno
     * @throws java.security.NoSuchAlgorithmException
     */
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

     /**
     * Método que se utiliza para generarle un id al profesor
     * @return ID del profesor
     * @throws java.security.NoSuchAlgorithmException
     */
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

      /**
     * Método que se utiliza para cambiar de manera aleatoria la seleccion de los grupos para que no
     * a todos los alumnos se les asigne el mismo grupo.
     */
    public void cambiaGrupo() {
        if (grupoM1.equals("A")) {
            grupoM1 = "B";
            grupoM2 = "B";
        } else if (grupoM1.equals("B")) {
            grupoM1 = "A";
            grupoM2 = "A";
        }
    }

     /**
     * Método que se utiliza para asignarle una opcion tecnica al alumno.
     */
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
  /**
     * Método que se utiliza para verificar si una materia u opcion tecnica tiene profesor.
     * @param opcion materia u opcion tecnica que se quiere saber si ya tiene profesor
     * @return true si un profesor ya esta impartiendo esa materia, false si no hay profesores asignados
     */
    public boolean verifica(String opcion) {

        if (profcontratados[0] == null) {
            return false;
        } else {
            c.Arreglo(profcontratados);
            Iterador iter = c.getIterador();
            while (iter.hasNext()) {
                Profesor p = (Profesor) iter.next();
                if (p == null) {
                    return false;
                } else if (p.getMateria().equals(opcion)) {
                    return true;
                }
            }
        }
        return true;
    }

    /**
     * Método que se utiliza para asignar materias y grupos a los profesores
     * @param n Materia que se quiere asignar
     * @return Materia que se le asigno al profesor
     */
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
            grupoPr = "A";
        }

        return n;

    }

    /**
     * Método que se utiliza para guardar un alumno en la lista de un profesor
     * @param a Alumno que se quiere guardar
     * @param m Profesor al que se le quiere guardar el alumno
     */
    public void guardaAlumno(Alumno a, String m) {

        c.Arreglo(profcontratados);
        Iterador iter = c.getIterador();
        while (iter.hasNext()) {
            Profesor p = (Profesor) iter.next();
            if (p == null) {
                System.out.println("No existen profesores");
            } else {
                if (p.getMateria().equals(m)) {
                    p.guardaAlumno(a.getId_alumno(), a);

                }
            }
        }

    }
    
    /**
     * Método que se utiliza para Agregar a un Profesor a la lista de profesores contratados
     * @param p Profesor que se quiere guardar
     */
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

    /**
     * Getter que regresa el arreglo donde se guardan los profesores contratados
     * @return Arreglo de profesores
     */
    public Profesor[] getArray() {
        return profcontratados;
    }

}

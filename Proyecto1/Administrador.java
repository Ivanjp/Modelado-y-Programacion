import java.util.Scanner;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class Administrador implements Usuario {

    Scanner sc = new Scanner(System.in);
    String materia1;
    String materia2;
    String opT;
    Profesor profcontratados[] = new Profesor[20];

    public void inscribirAlumno() throws InterruptedException, NoSuchAlgorithmException {
        System.out.print("Ingresa tu nombre completo: \n");
        String nombre = sc.nextLine();
        System.out.print("¿Cual es el area a la que deseas estudiar?. Ingresa 1 para Físico-Matemáticas, 2 para Ciencias Biológicas y de la Salud, 3 para Ciencias Sociales o 4 para Humanidades-Artes): \n");
        int sel = sc.nextInt();
        String area = this.asignaArea(sel);
        System.out.print("¿La escuela cuenta con las siguientes opciones tecnicas (Agente de viajes y hotelería, Fotógrafo Laboratorista y Prensa, Nutriólogo. y Laboratorista Químico). ¿Te gustaria cursar alguna opcion tecnica?: \n");
        String op = sc.nextLine();
        this.verificaOT(op);
        long id = generaIDAl();
        this.asignaMaterias(area);
        String grupoM1
        String grupoM2
        Alumno al = new Alumno(nombre, id, area, materia1, materia2, grupoM1, grupoM2, opT);
        //guardar alumno en el hash map del profesor
        Thread.sleep(5 * 1000);
        System.out.println("Registro exitoso!!");
    }

    public void contratarProfesor() throws NoSuchAlgorithmException{
        System.out.print("Ingresa tu nombre completo: \n");
        String nombre = sc.nextLine();
        System.out.print("¿En cual area quieres dar clase?. Ingresa 1 para Físico-Matemáticas, 2 para Ciencias Biológicas y de la Salud, 3 para Ciencias Sociales o 4 para Humanidades-Artes): \n");
        int sel = sc.nextInt();
        String area = this.asignaArea(sel);
        long id = this.generaIDProf();
        Profesor p = new Profesor();
        Thread.sleep(5 * 1000);
        System.out.println("Registro exitoso!!");
    }

    public void consultaAlumInscritos(){

    }

    public void consultaAlumnosArea(){

    }

    public void consultaAlumnosOT(){

    }

    public void consultaProfesores(){

    }

    public void graduar(long al){

    }

    public void darBaja(long al){

    }

    public void despedir(long p){

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

     public String asignaArea(int op) {
        String area = null;

        if (op == 1) {
            area = "Físico-Matemáticas";
        } else if (op == 2) {
            area = "Ciencias Biológicas y de la Salud";
        } else if (op == 3) {
            area = "Ciencias Sociales";
        } else if (op == 4) {
            area = "Humanidades-Artes";
        }
        return area;
    }

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

    public void verificaOT(String resp) {
        if (resp == "Si" || resp == "si") {
            System.out.println("Ingresa 1 para Agente de viajes y hotelería, 2 para Fotógrafo Laboratorista y Prensa, 3 para Nutriólogo, o 4 para Laboratorista Químico");

//verificar que haya profesores asignados a todas las materias
        } else if (resp == "No" || resp == "no") {
            System.out.println("Se procedera a registrarte espera un momento");
        }
    }
}

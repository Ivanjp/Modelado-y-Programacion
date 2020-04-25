
import java.util.Scanner;

public class Main {

    /**
     * Se crea un objeto DespliegaMenu
     */
    private DespliegaMenu dp;
    
    /**
     * Se crea un administrador
     */
    Administrador a = new Administrador();

    /**
     * Metodo que inicializa un objeto MenuAdmin
     */
    private void muestraMenuAdmin() {
        dp = new MenuAdmin();
    }

    /**
     * Metodo que inicializa un objeto MenuProf
     */
    private void muestraMenuProf() {
        dp = new MenuProf();
    }

    /**
     * Metodo que inicializa un objeto MenuAlumno
     */
    private void muestraMenuAlumno() {
        dp = new MenuAlumno();
    }

    /**
     * Metodo que ejecuta el objeto asignado a dp
     */
    private void ejecutarMenu() {
        dp.muestraMenu(a);
    }

    /**
     * Metodo que pobla el sistema para probarlo
     */
    public void cargaDatos() {
        
        Profesor p17 = new Profesor("Paulina Soto", 300000000, "Agente de viajes y hotelería", "Sin especificar", "Sin area", true);
        Profesor p18 = new Profesor("Francisco Perez", 300000010, "Fotógrafo Laboratorista y Prensa", "Sin especificar", "Sin area", true);
        Profesor p19 = new Profesor("Petra Maturano", 300000020, "Nutriólogo", "Sin especificar", "Sin area", true);
        Profesor p20 = new Profesor("Jose Luis Perez", 300000030, "Laboratorista Químico", "Sin especificar", "Sin area", true);
      
        Profesor p1 = new Profesor("Diana Diaz", 2000000000, "Fisica", "A", "Físico-Matemáticas", false);
        Profesor p2 = new Profesor("Fernando Sanchez", 2000000010, "Matematicas", "A", "Físico-Matemáticas", false);

        Alumno a1 = new Alumno("Yamile Villanueva", 100000000, "Físico-Matemáticas", "Fisica", "Matematicas", "A", "A", "Agente de viajes y hotelería", true);
        Alumno a2 = new Alumno("Alan Maqueda", 100000001, "Físico-Matemáticas", "Fisica", "Matematicas", "A", "A", "Sin datos", false);
        Alumno a3 = new Alumno("Diego Navarro", 100000002, "Físico-Matemáticas", "Fisica", "Matematicas", "A", "A", "Sin datos", false);
        Alumno a4 = new Alumno("Eduardo Cano", 100000003, "Físico-Matemáticas", "Fisica", "Matematicas", "A", "A", "Sin datos", false);
        Alumno a5 = new Alumno("Nancy Rodriguez", 100000004, "Físico-Matemáticas", "Fisica", "Matematicas", "A", "A", "Sin datos", false);
        Alumno a6 = new Alumno("Johally Rojas", 100000005, "Físico-Matemáticas", "Fisica", "Matematicas", "A", "A", "Sin datos", false);
        Alumno a7 = new Alumno("Ana Moreno", 100000006, "Físico-Matemáticas", "Fisica", "Matematicas", "A", "A", "Sin datos", false);
        Alumno a8 = new Alumno("Paola Reyes", 100000007, "Físico-Matemáticas", "Fisica", "Matematicas", "A", "A", "Nutriólogo", true);

        
        p1.guardaAlumno(100000000, a1);
        p17.guardaAlumno(100000000, a1);
        p1.guardaAlumno(100000001, a2);
        p1.guardaAlumno(100000002, a3);
        p1.guardaAlumno(100000003, a4);
        p1.guardaAlumno(100000004, a5);
        p1.guardaAlumno(100000005, a6);
        p1.guardaAlumno(100000006, a7);
        p1.guardaAlumno(100000007, a8);
        p19.guardaAlumno(100000007, a8);

        p2.guardaAlumno(100000000, a1);
        p2.guardaAlumno(100000000, a1);
        p2.guardaAlumno(100000000, a1);
        p2.guardaAlumno(100000000, a1);
        p2.guardaAlumno(100000000, a1);
        p2.guardaAlumno(100000000, a1);
        p2.guardaAlumno(100000000, a1);
        p2.guardaAlumno(100000000, a1);

        a.agregaProfesor(p1);
        a.agregaProfesor(p2);

        Profesor p3 = new Profesor("Juan Gomez", 2000000020, "Fisica", "B", "Físico-Matemáticas", false);
        Profesor p4 = new Profesor("Perla Montes", 2000000030, "Matematicas", "B", "Físico-Matemáticas", false);

        Alumno a9 = new Alumno("Luis Perez", 100000008, "Físico-Matemáticas", "Fisica", "Matematicas", "B", "B", "Agente de viajes y hotelería", true);
        Alumno a10 = new Alumno("Miguel Hernandez", 100000009, "Físico-Matemáticas", "Fisica", "Matematicas", "B", "B", "Sin datos", false);
        Alumno a11 = new Alumno("Vanessa Quirino", 100000010, "Físico-Matemáticas", "Fisica", "Matematicas", "B", "B", "Sin datos", false);
        Alumno a12 = new Alumno("Shantel Avila", 100000011, "Físico-Matemáticas", "Fisica", "Matematicas", "B", "B", "Sin datos", false);
        Alumno a13 = new Alumno("Leonardo Campos", 100000012, "Físico-Matemáticas", "Fisica", "Matematicas", "B", "B", "Sin datos", false);
        Alumno a14 = new Alumno("Julio Martin", 100000013, "Físico-Matemáticas", "Fisica", "Matematicas", "B", "B", "Sin datos", false);
        Alumno a15 = new Alumno("Sarah Molina", 100000014, "Físico-Matemáticas", "Fisica", "Matematicas", "B", "B", "Sin datos", false);
        Alumno a16 = new Alumno("Emily Salazar", 100000015, "Físico-Matemáticas", "Fisica", "Matematicas", "B", "B", "Nutriólogo", true);

        p3.guardaAlumno(100000008, a9);
        p3.guardaAlumno(100000008, a9);
        p3.guardaAlumno(100000009, a10);
        p3.guardaAlumno(100000010, a11);
        p3.guardaAlumno(100000011, a12);
        p3.guardaAlumno(100000012, a13);
        p3.guardaAlumno(100000013, a14);
        p3.guardaAlumno(100000014, a15);
        p3.guardaAlumno(100000015, a16);
        p19.guardaAlumno(100000015, a16);

        p4.guardaAlumno(100000008, a9);
        p4.guardaAlumno(100000009, a10);
        p4.guardaAlumno(100000010, a11);
        p4.guardaAlumno(100000011, a12);
        p4.guardaAlumno(100000012, a13);
        p4.guardaAlumno(100000013, a14);
        p4.guardaAlumno(100000014, a15);
        p4.guardaAlumno(100000015, a16);

        a.agregaProfesor(p3);
        a.agregaProfesor(p4);

        Profesor p5 = new Profesor("Susana Distancia", 2000000040, "Biologia", "A", "Ciencias Biológicas y de la Salud", false);
        Profesor p6 = new Profesor("Armando Lopez", 2000000050, "Quimica", "A", "Ciencias Biológicas y de la Salud", false);

        Alumno a17 = new Alumno("Ruben Vargas", 100000016, "Ciencias Biológicas y de la Salud", "Biologia", "Quimica", "B", "B", "Agente de viajes y hotelería", true);
        Alumno a18 = new Alumno("Daniela Cuevas", 100000017, "Ciencias Biológicas y de la Salud", "Biologia", "Quimica", "B", "B", "Sin datos", false);
        Alumno a19 = new Alumno("Gustavo Sampayo", 100000018, "Ciencias Biológicas y de la Salud", "Biologia", "Quimica", "B", "B", "Sin datos", false);
        Alumno a20 = new Alumno("Enrique Castillo", 100000019, "Ciencias Biológicas y de la Salud", "Biologia", "Quimica", "B", "B", "Sin datos", false);
        Alumno a21 = new Alumno("Jorge Aranda", 100000020, "Ciencias Biológicas y de la Salud", "Biologia", "Quimica", "B", "B", "Sin datos", false);
        Alumno a22 = new Alumno("Claudia Perez", 100000021, "Ciencias Biológicas y de la Salud", "Biologia", "Quimica", "B", "B", "Sin datos", false);
        Alumno a23 = new Alumno("Jimena Arana", 100000022, "Ciencias Biológicas y de la Salud", "Biologia", "Quimica", "B", "B", "Sin datos", false);
        Alumno a24 = new Alumno("Elizabeth Uribe", 100000023, "Ciencias Biológicas y de la Salud", "Biologia", "Quimica", "B", "B", "Nutriólogo", true);

        p5.guardaAlumno(100000016, a17);
        p17.guardaAlumno(100000016, a17);
        p5.guardaAlumno(100000017, a18);
        p5.guardaAlumno(100000018, a19);
        p5.guardaAlumno(100000019, a20);
        p5.guardaAlumno(100000020, a21);
        p5.guardaAlumno(100000021, a22);
        p5.guardaAlumno(100000022, a23);
        p5.guardaAlumno(100000023, a24);
        p19.guardaAlumno(100000023, a24);

        p6.guardaAlumno(100000016, a17);
        p6.guardaAlumno(100000017, a18);
        p6.guardaAlumno(100000018, a19);
        p6.guardaAlumno(100000019, a20);
        p6.guardaAlumno(100000020, a21);
        p6.guardaAlumno(100000021, a22);
        p6.guardaAlumno(100000022, a23);
        p6.guardaAlumno(100000023, a24);

        a.agregaProfesor(p5);
        a.agregaProfesor(p6);

        Profesor p7 = new Profesor("Dario Veron", 2000000060, "Biologia", "B", "Ciencias Biológicas y de la Salud", false);
        Profesor p8 = new Profesor("Monica Rodriguez", 2000000070, "Quimica", "B", "Ciencias Biológicas y de la Salud", false);

        Alumno a25 = new Alumno("Montserrat Mandujano", 100000024, "Ciencias Biológicas y de la Salud", "Biologia", "Quimica", "A", "A", "Agente de viajes y hotelería", true);
        Alumno a26 = new Alumno("Oliver Alamilla", 100000025, "Ciencias Biológicas y de la Salud", "Biologia", "Quimica", "A", "A", "Sin datos", false);
        Alumno a27 = new Alumno("Cristina Patiño", 100000026, "Ciencias Biológicas y de la Salud", "Biologia", "Quimica", "A", "A", "Sin datos", false);
        Alumno a28 = new Alumno("Pamela Azuara", 100000027, "Ciencias Biológicas y de la Salud", "Biologia", "Quimica", "A", "A", "Sin datos", false);
        Alumno a29 = new Alumno("Daniela Briseño", 100000028, "Ciencias Biológicas y de la Salud", "Biologia", "Quimica", "A", "A", "Sin datos", false);
        Alumno a30 = new Alumno("Emiliano Cabadas", 100000029, "Ciencias Biológicas y de la Salud", "Biologia", "Quimica", "A", "A", "Sin datos", false);
        Alumno a31 = new Alumno("Angelin Calderon", 100000030, "Ciencias Biológicas y de la Salud", "Biologia", "Quimica", "A", "A", "Sin datos", false);
        Alumno a32 = new Alumno("Jonathan Campos", 100000031, "Ciencias Biológicas y de la Salud", "Biologia", "Quimica", "A", "A", "Nutriólogo", true);

        p7.guardaAlumno(100000024, a25);
        p17.guardaAlumno(100000024, a25);
        p7.guardaAlumno(100000025, a26);
        p7.guardaAlumno(100000026, a27);
        p7.guardaAlumno(100000027, a28);
        p7.guardaAlumno(100000028, a29);
        p7.guardaAlumno(100000029, a30);
        p7.guardaAlumno(100000030, a31);
        p7.guardaAlumno(100000031, a32);
        p19.guardaAlumno(100000031, a32);

        p8.guardaAlumno(100000024, a25);
        p8.guardaAlumno(100000025, a26);
        p8.guardaAlumno(100000026, a27);
        p8.guardaAlumno(100000027, a28);
        p8.guardaAlumno(100000028, a29);
        p8.guardaAlumno(100000029, a30);
        p8.guardaAlumno(100000030, a31);
        p8.guardaAlumno(100000031, a32);

        a.agregaProfesor(p7);
        a.agregaProfesor(p8);

        Profesor p9 = new Profesor("Andrea Salas", 2000000080, "Historia", "A", "Ciencias Sociales", false);
        Profesor p10 = new Profesor("Guillermo Fernandez", 2000000090, "Ciencias Sociales", "A", "Ciencias Sociales", false);

        Alumno a49 = new Alumno("Andrea Gonzales", 100000048, "Ciencias Sociales", "Historia", "Ciencias Sociales", "A", "A", "Fotógrafo Laboratorista y Prensa", true);
        Alumno a50 = new Alumno("Alejandro Guerrero", 100000049, "Ciencias Sociales", "Historia", "Ciencias Sociales", "A", "A", "Sin datos", false);
        Alumno a51 = new Alumno("Jaime Hernadez", 100000050, "Ciencias Sociales", "Historia", "Ciencias Sociales", "A", "A", "Sin datos", false);
        Alumno a52 = new Alumno("Oscar Jaimes", 100000051, "Ciencias Sociales", "Historia", "Ciencias Sociales", "A", "A", "Sin datos", false);
        Alumno a53 = new Alumno("Gustavo Hinojosa", 100000052, "Ciencias Sociales", "Historia", "Ciencias Sociales", "A", "A", "Sin datos", false);
        Alumno a54 = new Alumno("Joel Ignacio", 100000053, "Ciencias Sociales", "Historia", "Ciencias Sociales", "A", "A", "Sin datos", false);
        Alumno a55 = new Alumno("Aketzalli Juarez", 100000054, "Ciencias Sociales", "Historia", "Ciencias Sociales", "A", "A", "Sin datos", false);
        Alumno a56 = new Alumno("Maria Lazaro", 100000055, "Ciencias Sociales", "Historia", "Ciencias Sociales", "A", "A", "Laboratorista Químico", true);

        p9.guardaAlumno(100000048, a49);
        p18.guardaAlumno(100000048, a49);
        p9.guardaAlumno(100000049, a50);
        p9.guardaAlumno(100000050, a51);
        p9.guardaAlumno(100000051, a52);
        p9.guardaAlumno(100000052, a53);
        p9.guardaAlumno(100000053, a54);
        p9.guardaAlumno(100000054, a55);
        p9.guardaAlumno(100000055, a56);
        p20.guardaAlumno(100000055, a56);

        p10.guardaAlumno(100000048, a49);
        p10.guardaAlumno(100000049, a50);
        p10.guardaAlumno(100000050, a51);
        p10.guardaAlumno(100000051, a52);
        p10.guardaAlumno(100000052, a53);
        p10.guardaAlumno(100000053, a54);
        p10.guardaAlumno(100000054, a55);
        p10.guardaAlumno(100000055, a56);

        a.agregaProfesor(p9);
        a.agregaProfesor(p10);

        Profesor p11 = new Profesor("Noe Ramirez", 2000000100, "Historia", "B", "Ciencias Sociales", false);
        Profesor p12 = new Profesor("Mariana Molina", 2000000110, "Ciencias Sociales", "B", "Ciencias Sociales", false);

        Alumno a57 = new Alumno("Eric Martinez", 100000056, "Ciencias Sociales", "Historia", "Ciencias Sociales", "B", "B", "Fotógrafo Laboratorista y Prensa", true);
        Alumno a58 = new Alumno("Alberto Montalvo", 100000057, "Ciencias Sociales", "Historia", "Ciencias Sociales", "B", "B", "Sin datos", false);
        Alumno a59 = new Alumno("Ariel Cristobal", 100000058, "Ciencias Sociales", "Historia", "Ciencias Sociales", "B", "B", "Sin datos", false);
        Alumno a60 = new Alumno("Eduardo Niño", 100000059, "Ciencias Sociales", "Historia", "Ciencias Sociales", "B", "B", "Sin datos", false);
        Alumno a61 = new Alumno("Penelope Nolasco", 100000060, "Ciencias Sociales", "Historia", "Ciencias Sociales", "B", "B", "Sin datos", false);
        Alumno a62 = new Alumno("Irais Padilla", 100000061, "Ciencias Sociales", "Historia", "Ciencias Sociales", "B", "B", "Sin datos", false);
        Alumno a63 = new Alumno("Osvaldo Pérez", 100000062, "Ciencias Sociales", "Historia", "Ciencias Sociales", "B", "B", "Sin datos", false);
        Alumno a64 = new Alumno("Jose Perez", 100000063, "Ciencias Sociales", "Historia", "Ciencias Sociales", "B", "B", "Laboratorista Químico", true);

        p11.guardaAlumno(100000056, a57);
        p18.guardaAlumno(100000056, a57);
        p11.guardaAlumno(100000057, a58);
        p11.guardaAlumno(100000058, a59);
        p11.guardaAlumno(100000059, a60);
        p11.guardaAlumno(100000060, a61);
        p11.guardaAlumno(100000061, a62);
        p11.guardaAlumno(100000062, a63);
        p11.guardaAlumno(100000063, a64);
        p20.guardaAlumno(100000063, a64);

        p12.guardaAlumno(100000056, a57);
        p12.guardaAlumno(100000057, a58);
        p12.guardaAlumno(100000058, a59);
        p12.guardaAlumno(100000059, a60);
        p12.guardaAlumno(100000060, a61);
        p12.guardaAlumno(100000061, a62);
        p12.guardaAlumno(100000062, a63);
        p12.guardaAlumno(100000063, a64);

        a.agregaProfesor(p11);
        a.agregaProfesor(p12);

        Profesor p13 = new Profesor("Gabriel Feria", 2000000120, "Filosofia", "A", "Humanidades-Artes", false);
        Profesor p14 = new Profesor("Obed Beltran", 2000000130, "Artes Plasticas", "A", "Humanidades-Artes", false);

        Alumno a65 = new Alumno("Jorge Perez", 100000064, "Humanidades-Artes", "Filosofia", "Artes Plasticas", "A", "A", "Fotógrafo Laboratorista y Prensa", true);
        Alumno a66 = new Alumno("Christian Pimentel", 100000065, "Humanidades-Artes", "Filosofia", "Artes Plasticas", "A", "A", "Sin datos", false);
        Alumno a67 = new Alumno("Angel Piña", 100000066, "Humanidades-Artes", "Filosofia", "Artes Plasticas", "A", "A", "Sin datos", false);
        Alumno a68 = new Alumno("Marcela Pulido", 100000067, "Humanidades-Artes", "Filosofia", "Artes Plasticas", "A", "A", "Sin datos", false);
        Alumno a69 = new Alumno("Vanessa Reyes", 100000068, "Humanidades-Artes", "Filosofia", "Artes Plasticas", "A", "A", "Sin datos", false);
        Alumno a70 = new Alumno("Ivan Rivera", 100000069, "Humanidades-Artes", "Filosofia", "Artes Plasticas", "A", "A", "Sin datos", false);
        Alumno a71 = new Alumno("Stephanie Rodriguez", 100000070, "Humanidades-Artes", "Filosofia", "Artes Plasticas", "A", "A", "Sin datos", false);
        Alumno a72 = new Alumno("Lany Lazo", 100000071, "Humanidades-Artes", "Filosofia", "Artes Plasticas", "A", "A", "Laboratorista Químico", true);

        p13.guardaAlumno(100000064, a65);
        p18.guardaAlumno(100000064, a65);
        p13.guardaAlumno(100000065, a66);
        p13.guardaAlumno(100000066, a67);
        p13.guardaAlumno(100000067, a68);
        p13.guardaAlumno(100000068, a69);
        p13.guardaAlumno(100000069, a70);
        p13.guardaAlumno(100000070, a71);
        p13.guardaAlumno(100000071, a72);
        p20.guardaAlumno(100000063, a64);

        p14.guardaAlumno(100000064, a65);
        p14.guardaAlumno(100000065, a66);
        p14.guardaAlumno(100000066, a67);
        p14.guardaAlumno(100000067, a68);
        p14.guardaAlumno(100000068, a69);
        p14.guardaAlumno(100000069, a70);
        p14.guardaAlumno(100000070, a71);
        p14.guardaAlumno(100000071, a72);

        a.agregaProfesor(p13);
        a.agregaProfesor(p14);

        Profesor p15 = new Profesor("Elizabeth del Arco", 2000000140, "Filosofia", "B", "Humanidades-Artes", false);
        Profesor p16 = new Profesor("Saul Linares", 2000000150, "Artes Plasticas", "B", "Humanidades-Artes", false);

        Alumno a73 = new Alumno("Regina Medina", 1000000072, "Humanidades-Artes", "Filosofia", "Artes Plasticas", "B", "B", "Fotógrafo Laboratorista y Prensa", true);
        Alumno a74 = new Alumno("Fernanda Segundo", 100000073, "Humanidades-Artes", "Filosofia", "Artes Plasticas", "B", "B", "Sin datos", false);
        Alumno a75 = new Alumno("Jacqueline Salas", 100000074, "Humanidades-Artes", "Filosofia", "Artes Plasticas", "B", "B", "Sin datos", false);
        Alumno a76 = new Alumno("Beatriz Sanchez", 100000075, "Humanidades-Artes", "Filosofia", "Artes Plasticas", "B", "B", "Sin datos", false);
        Alumno a77 = new Alumno("Dayra Herrera", 100000076, "Humanidades-Artes", "Filosofia", "Artes Plasticas", "B", "B", "Sin datos", false);
        Alumno a78 = new Alumno("Hector Solis", 100000077, "Humanidades-Artes", "Filosofia", "Artes Plasticas", "B", "B", "Sin datos", false);
        Alumno a79 = new Alumno("Tenoch Garcia", 100000078, "Humanidades-Artes", "Filosofia", "Artes Plasticas", "B", "B", "Sin datos", false);
        Alumno a80 = new Alumno("Diane Torres", 100000079, "Humanidades-Artes", "Filosofia", "Artes Plasticas", "B", "B", "Laboratorista Químico", true);

        p15.guardaAlumno(100000072, a73);
        p18.guardaAlumno(100000072, a73);
        p15.guardaAlumno(100000073, a74);
        p15.guardaAlumno(100000074, a75);
        p15.guardaAlumno(100000075, a76);
        p15.guardaAlumno(100000076, a77);
        p15.guardaAlumno(100000077, a78);
        p15.guardaAlumno(100000078, a79);
        p15.guardaAlumno(100000079, a80);
        p20.guardaAlumno(100000079, a80);

        p16.guardaAlumno(100000072, a73);
        p16.guardaAlumno(100000073, a74);
        p16.guardaAlumno(100000074, a75);
        p16.guardaAlumno(100000075, a76);
        p16.guardaAlumno(100000076, a77);
        p16.guardaAlumno(100000077, a78);
        p16.guardaAlumno(100000078, a79);
        p16.guardaAlumno(100000079, a80);

        a.agregaProfesor(p15);
        a.agregaProfesor(p16);
        
        a.agregaProfesor(p17);
        a.agregaProfesor(p18);
        a.agregaProfesor(p19);
        a.agregaProfesor(p20);
    }

    /**
     * Metodo que inicia el programa
     * @param args
     */
    public static void main(String[] args) {

        /**
     * Creacion de un objeto main
     */
        Main m = new Main();
        
        /**
     * Creacion de un objeto scanner
     */
        Scanner sc = new Scanner(System.in);
        
        /**
     * Variable que guarda la opcion del menu
     */
        int opcion;
        
        /**
     * Se manda a llamar el metodo que pobla el sistema
     */
        m.cargaDatos();

        /**
     * Menu principal
     */
        do {
            System.out.println("Hola Bienvenido en que perfil quieres acceder..\n\n"
                    + "1.- Administrador\n"
                    + "2.- Profesor\n"
                    + "3.- Alumno\n"
                    + "0.- Salir\n");

            String opcionUsuario = sc.nextLine();
            opcion = Integer.parseInt(opcionUsuario);

            switch (opcion) {
                case 1:
                    m.muestraMenuAdmin();
                    m.ejecutarMenu();
                    break;
                case 2:
                    m.muestraMenuProf();
                    m.ejecutarMenu();
                    break;
                case 3:
                    m.muestraMenuAlumno();
                    m.ejecutarMenu();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Elige una opcion valida.\n");
                    break;
            }
        } while (opcion != 0);
    }
}

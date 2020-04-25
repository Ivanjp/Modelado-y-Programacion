
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class Alumno implements Usuario {
    
    /**
     * Se construye un objeto ColeccionProfes para utilizar el Iterator
     */
    ColeccionProfes c = new ColeccionProfes();

    /**
     * Variables que guardan los atributos del alumno
     */
    public String nombre;
    public long id_alumno;
    public String areaA;
    public String materia1;
    public String materia2;
    public String grupoM1;
    public String grupoM2;
    public String op_tecnica;
    public int califOPT;
    public int califM1;
    public int califM2;
    public boolean ot;//Variable que se usa para identificar a los alumnos que cursan una opcion 

    /**
     * Constructor sin parametros del Alumno, se utiliza para
     * ocupar sus metodos en el menu sin construir un Alumno.
     */
    public Alumno() {

    }

    /**
     * Método que se utiliza para crear un Alumno
     * @param nombre Nombre del Alumno
     * @param id_alumno Id del Alumno
     * @param areaA Area que escogio el alumno
     * @param materia1 Materia de alumno
     * @param materia2 Materia del Alumno
     * @param grupoM1 Grupo de la Primer materia
     * @param grupoM2 Grupo de la segunda materia
     * @param op_tecnica Opcion tecnica escogida del alumno
     * @param ot Verificador de si un alumno curso una opcion tecnica o no
     */
    public Alumno(String nombre, long id_alumno, String areaA, String materia1, String materia2, String grupoM1, String grupoM2, String op_tecnica, boolean ot) {
        this.nombre = nombre;
        this.id_alumno = id_alumno;
        this.areaA = areaA;
        this.materia1 = materia1;
        this.materia2 = materia2;
        this.grupoM1 = grupoM1;
        this.grupoM2 = grupoM2;
        this.op_tecnica = op_tecnica;
        this.califOPT = 0;
        this.califM1 = 0;
        this.califM2 = 0;
        this.ot = ot;
    }

    /**
     * Getter que regresa el Nombre del Alumno
     * @return Nombre del Alumno
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Getter que regresa el ID del alumno
     * @return ID del Alumno
     */
    public long getId_alumno() {
        return id_alumno;
    }

    /**
     * Getter que regresa el Area del alumno
     * @return Area del alumno
     */
    public String getAreaA() {
        return areaA;
    }

    /**
     * Getter que regresa la calificacion de la materia 1
     * @return Calificacion de una materia
     */
    public int getCalifM1() {
        return califM1;
    }
    
    /**
     * Getter que regresa la calificacion de la materia 2.
     * @return Calificacion de una materia
     */
    public int getCalifM2() {
        return califM2;
    }

    /**
     * Getter que regresa la calificacion de la opcion tecnica del alumno
     * @return Calificacion de la opcion tecnica
     */
    public int getCalifOPT() {
        return califOPT;
    }

    /**
     * Setter que cambia el verificador de opcion tecnica
     * @param ot verificador
     */
    public void setOt(boolean ot) {
        this.ot = ot;
    }

    /**
     * Getter que regresa el valor del verificador de opcion tecnica
     * @return valor del verificador
     */
    public boolean getOt() {
        return ot;
    }

    /**
     * Getter que regresa la  la materia 1
     * @return Materia 1
     */
    public String getMateria1() {
        return materia1;
    }

    /**
     * Getter que regresa la materia 2
     * @return Materia 2
     */
    public String getMateria2() {
        return materia2;
    }

    /**
     * Getter que regresa el grupo de la materia 1
     * @return Grupo de la materia 1
     */
    public String getGrupoM1() {
        return grupoM1;
    }

    /**
     * Getter que regresa el grupo de la materia 2
     * @return Grupo de la materia 2
     */
    public String getGrupoM2() {
        return grupoM2;
    }

    /**
     * Getter que regresa la opcion tecnica
     * @return Opcion tecnica
     */
    public String getOp_tecnica() {
        return op_tecnica;
    }

    /**
     * Setter que asigna una opcion tecnica
     * @param op_tecnica Opcion tecnica
     */
    public void setOp_tecnica(String op_tecnica) {
        this.op_tecnica = op_tecnica;
    }

    /**
     * Setter que asigna la calificacion de la materia 1
     * @param califM1 Calificacion
     */
    public void setCalifM1(int califM1) {
        this.califM1 = califM1;
    }
    
    /**
     * Setter que asigna la calificacion de la materia 2
     * @param califM1 Calificacion
     */
    public void setCalifM2(int califM2) {
        this.califM2 = califM2;
    }

    /**
     * Setter que asigna la calificacion de la opcion tecnica
     * @param califOPT Calificacion
     */
    public void setCalifOPT(int califOPT) {
        this.califOPT = califOPT;
    }
    
    /**
     * Metodo que funciona para consultar la calificaion de alguna materia
     * @param id id del alumno
     * @param mat materia de la que se quiere consultar la calificacion
     * @param g Grupo de la materia
     * @param x Arreglo de los profesores
     */
    public void consultaCalif(long id, String mat, String g, Profesor[] x) {
        Hashtable<Integer, Alumno> alumnInscritos;

        if (x[0] == null) {
            System.out.println("No hay registros");
        } else {
            c.Arreglo(x);
            Iterador iter = c.getIterador();
            while (iter.hasNext()) {
                Profesor p = (Profesor) iter.next();
                if (p == null) {

                } else {
                    if (p.getMateria().equals(mat) && p.getGrupo().equals(g)) {
                        alumnInscritos = p.getLista();
                        if (alumnInscritos.get((int) id).getMateria1().equals(mat)) {
                            System.out.println("La calificacion de " + mat + " es: " + alumnInscritos.get((int) id).getCalifM1());
                        } else {
                            System.out.println("La calificacion de " + mat + " es: " + alumnInscritos.get((int) id).getCalifM2());
                        }
                    }

                }

            }
        }
    }

    /**
     * Metodo que funciona para consultar el promedio del alumno
     * @param id id del alumno
     * @param x Arreglo de los profesores
     */
    public void consultaProm(long id, Profesor[] x) {
        Hashtable<Integer, Alumno> alumnInscritos;

        if (x[0] == null) {
            System.out.println("No hay registros");
        } else {
            c.Arreglo(x);
            Iterador iter = c.getIterador();
            while (iter.hasNext()) {
                Profesor p = (Profesor) iter.next();
                if (p == null) {

                } else {
                    alumnInscritos = p.getLista();
                    if (alumnInscritos.containsKey((int) id)) {
                        if (alumnInscritos.get((int) id).getOt() == true) {
                            int prom = (alumnInscritos.get((int) id).getCalifM1() + alumnInscritos.get((int) id).getCalifM2() + alumnInscritos.get((int) id).getCalifOPT()) / 3;
                            System.out.println("Tu promedio es: " + prom);
                        } else {
                            int prom = (alumnInscritos.get((int) id).getCalifM1() + alumnInscritos.get((int) id).getCalifM2()) / 2;
                            System.out.println("Tu promedio es: " + prom);
                        }
                    }

                }

            }
        }
    }

    /**
     * Metodo que funciona para inscribirse a una opcion tecnica
     * @param id id del alumno
     * @param x Arreglo de profesores
     */
    public void inscribirOT(long id, Profesor[] x) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Que opcion tecnica te gustaria cursar? ");
        System.out.println("Ingresa 1 para Agente de viajes y hotelería, 2 para Fotógrafo Laboratorista y Prensa, 3 para Nutriólogo, o 4 para Laboratorista Químico");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                this.comprueba("Agente de viajes y hotelería", x, id);
                break;
            case 2:
                this.comprueba("Fotógrafo Laboratorista y Prensa", x, id);
                break;
            case 3:
                this.comprueba("Nutriólogo", x, id);
                break;
            case 4:
                this.comprueba("Laboratorista Químico", x, id);
                break;
            default:
                System.out.println("Datos incorrectos.\n");
                break;
        }
    }

    /**
     * Metodo que funciona para comprobar que un profesor este dando una opcion tecnica y asi poder inscribir al alumno
     * @param mt Opcion tecnica
     * @param x Arreglo de profesores
     * @param id id del alumno
     */
    public void comprueba(String mt, Profesor[] x, long id) {
        Hashtable<Integer, Alumno> alumnInscritos;

        if (x[0] == null) {
            System.out.println("No hay registros");
        } else {
            c.Arreglo(x);
            Iterador iter = c.getIterador();
            while (iter.hasNext()) {
                Profesor p = (Profesor) iter.next();
                if (p == null) {

                } else {
                    if (p.getTec() == true || p.getMateria().equals(mt)) {
                        alumnInscritos = p.getLista();
                        alumnInscritos.get((int) id).setOp_tecnica(mt);
                        alumnInscritos.get((int) id).setOt(true);
                        System.out.println("Registro exitoso!!");
                    } else {
                        System.out.println("No hay profesores asignados a la materia en estos momentos, prueba mas adelante o escoge otra");
                    }

                }

            }
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

}

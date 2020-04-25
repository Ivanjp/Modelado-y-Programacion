
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class Profesor implements Usuario {

    /**
     * Se construye un objeto ColeccionProfes para utilizar el Iterator
     */
    ColeccionProfes c = new ColeccionProfes();
    
    /**
     * Variables que guardan los atributos del profesor
     */
    public String nombre;
    public long id_prof;
    public String materia;
    public String grupo;
    public String area;
    public boolean optec;///Variable que se usa para identificar a los alumnos que cursan una opcion
    public Hashtable<Integer, Alumno> alumnosInscritos = new Hashtable<Integer, Alumno>();//TablaHash que guarda los alumnos inscritos con el profesor creado

    /**
     * Método que se utiliza para crear un Profesor
     * @param nombre Nombre del Profesor
     * @param id_prof Id del profesor
     * @param materia Materia del profesor
     * @param grupo Grupo de la materia del profesor
     * @param area Area del profesor
     * @param optec Variable que se usa para identificar a los alumnos que cursan una opcion
     */
    public Profesor(String nombre, long id_prof, String materia, String grupo, String area, boolean optec) {
        this.nombre = nombre;
        this.id_prof = id_prof;
        this.materia = materia;
        this.grupo = grupo;
        this.area = area;
        this.optec = optec;
    }

     /**
     * Constructor sin parametros del Profesor, se utiliza para
     * ocupar sus metodos en el menu sin construir un Profesor.
     */
    public Profesor() {

    }

    /**
     * Getter que regresa el Nombre del Profesor
     * @return Nombre del Profesor
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Getter que regresa el id del profesor
     * @return id del profesor
     */
    public long getId_prof() {
        return id_prof;
    }

    /**
     * Getter que regresa la materia que se le asigno al profesor
     * @return materia del profesor
     */
    public String getMateria() {
        return materia;
    }

    /**
     * Getter que regresa el grupo de la materia del profesor
     * @return grupo de la materia del profesor
     */
    public String getGrupo() {
        return grupo;
    }

    /**
     * Getter que regresa el area del profesor
     * @return area del profesor
     */
    public String getArea() {
        return area;
    }

    /**
     * Getter que regresa la lista con los alumnos del profesor
     * @return Hashtable de los alumnos del profesor
     */
    public Hashtable getLista() {
        return alumnosInscritos;
    }

    /**
     * Metodo que guarda a un alumno en la lista de alumnos del profesor
     * @param id del alumno
     * @param al Alumno que se quiere guardar
     */
    public void guardaAlumno(long id, Alumno al) {
        alumnosInscritos.put((int) id, al);
    }

    /**
     * Getter que regresa el verificaor para identificar a los alumnos que cursan una opcion
     * @return true si el maestro es de opcion tecnica
     */
    public boolean getTec() {
        return optec;
    }

    /**
     * GMetodo que regresa la informacion de su materia y grupo que imparte el profesor
     * @param pfl id del profesor
     * @param x Arreglo de profesores
     */
    public void infoGrupo(long pfl, Profesor[] x) {
        Hashtable<Integer, Alumno> alumnInscritos;

        if (x[0] == null) {
            System.out.println("No hay alumnos inscritos");
        } else {
            c.Arreglo(x);
            Iterador iter = c.getIterador();
            while (iter.hasNext()) {
                Profesor p = (Profesor) iter.next();
                if (p == null) {

                } else {
                    if (p.getId_prof() == pfl) {
                        alumnInscritos = p.getLista();
                        Enumeration<Alumno> valores = alumnInscritos.elements();
                        while (valores.hasMoreElements()) {
                            Alumno a = valores.nextElement();
                            if (a.getOt() == true) {
                                System.out.println("Opcion Tecnica: " + a.getOp_tecnica() + "\n"
                                        + "Nombre: " + a.getNombre() + "\n"
                                        + "ID: " + a.getId_alumno() + "\n");
                            } else {
                                System.out.println("Grupo: " + p.getGrupo() + "\n"
                                        + "Materia: " + p.getMateria() + "\n"
                                        + "Nombre: " + a.getNombre() + "\n"
                                        + "ID: " + a.getId_alumno() + "\n"
                                        + "Area: " + a.getAreaA() + "\n");
                            }
                        }
                    }

                }

            }
        }
    }

    /**
     * Metodo que fuunciona para asignarle una calificacion a un alumno del profesor
     * @param idA id del alumno
     * @param idP is del profesor
     * @param x Arreglo de profesores
     */
    public void asignaCalif(long idA, long idP, Profesor[] x) {
        Hashtable<Integer, Alumno> alumnInscritos;
        Scanner sc = new Scanner(System.in);

        c.Arreglo(x);
        Iterador iter = c.getIterador();
        while (iter.hasNext()) {
            Profesor p = (Profesor) iter.next();
            if (p == null) {

            } else {
                if (p.getId_prof() == idP) {
                    alumnInscritos = p.getLista();
                    if (p.getMateria().equals(alumnInscritos.get((int) idA).getMateria1())) {
                        System.out.println("Ingresa la calificacion para " + p.getMateria());
                        int calif = sc.nextInt();
                        alumnInscritos.get((int) idA).setCalifM1(calif);
                        System.out.println("Calificacion asignada");
                    } else if (p.getMateria().equals(alumnInscritos.get((int) idA).getMateria2())) {
                        System.out.println("Ingresa la calificacion para " + p.getMateria());
                        int calif = sc.nextInt();
                        alumnInscritos.get((int) idA).setCalifM2(calif);
                        System.out.println("Calificacion asignada");
                    }else if(alumnInscritos.get((int) idA).getOt() == true && p.getMateria().equals(alumnInscritos.get((int) idA).getOp_tecnica())){
                        System.out.println("Ingresa la calificacion para " + p.getMateria());
                        int calif = sc.nextInt();
                        alumnInscritos.get((int) idA).setCalifOPT(calif);
                        System.out.println("Calificacion asignada");
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

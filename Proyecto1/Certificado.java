public abstract class Certificado {

    /*
     * Metodo abstracto para que cada clase lo modifique a su antojo.
     */
    abstract void opTecnica(Alumno a);
    abstract void profesorOT(Alumno a,Profesor[] x);

    /**
     * Se construye un objeto ColeccionProfes para utilizar el Iterator
     */
    ColeccionProfes c = new ColeccionProfes();
    
    /**
     * Variable que guarda el promedio del alumno
     */
    double promedio;
    
    /**
     * Variables que guardan las calificaciones de las materias del alumno
     */
    int cal1;
    int cal2;
    

    /*
     * Metodo template (plantilla)
     */
    public final void generaCertificado(Alumno a,Profesor[] x) {
        agregaNombre(a);
        materiaA(a);
        profesorA(a,x);
        calificacionA(a);
        materiaB(a);
        profesorB(a,x);
        calificacionB(a);
        promedio(a);
        opTecnica(a);
        profesorOT(a,x);
    }

    /**
     * Metodo que muestra el nombre del alumno
     */
    void agregaNombre(Alumno a) {
        System.out.println("**         CERTIFICADO DE GRADUACION        **\n");
        System.out.println("\n");
        System.out.println("___________Nombre del Alumno: " + a.getNombre() + "\n");
    }

    /**
     * Metodo que muestra una de las materias del alumno
     */
    void materiaA(Alumno a) {
        System.out.println("\n");
        System.out.println("___________Materia: " + a.getMateria1() + "\n");
    }

    /**
     * Metodo que muestra un profesor de una materia del alumno
     */
    void profesorA(Alumno a,Profesor[] x) {
        
        String prof = " ";

        if (x[0] == null) {
            System.out.println("No hay alumnos inscritos");
        } else {
            c.Arreglo(x);
            Iterador iter = c.getIterador();
            while (iter.hasNext()) {
                Profesor p = (Profesor) iter.next();
                if (p == null) {

                }else{
                    if(p.getMateria().equals(a.getMateria1()) && p.getGrupo().equals(a.getGrupoM1())){
                        prof = p.getNombre();
                    }
                }
            }
        }
        
        System.out.println("___________Nombre del Profesor: " + prof + "\n");
    }

    /**
     * Metodo que muestra una calificacion de una materia del alumno
     */
    void calificacionA(Alumno a) {
        cal1 = a.getCalifM1();
        System.out.println("___________Calificacion Final: " + a.getCalifM1() + "\n");
    }

    /**
     * Metodo que muestra una de las materias del alumno
     */
    void materiaB(Alumno a) {
        System.out.println("\n");
        System.out.println("___________Materia: " + a.getMateria2() + "\n");
    }

    /**
     * Metodo que muestra un profesor de una materia del alumno
     */
    void profesorB(Alumno a,Profesor[] x) {
        
        String prof = " ";

        if (x[0] == null) {
            System.out.println("No hay alumnos inscritos");
        } else {
            c.Arreglo(x);
            Iterador iter = c.getIterador();
            while (iter.hasNext()) {
                Profesor p = (Profesor) iter.next();
                if (p == null) {

                }else{
                    if(p.getMateria().equals(a.getMateria2()) && p.getGrupo().equals(a.getGrupoM2())){
                        prof = p.getNombre();
                    }
                }
            }
        }
        System.out.println("___________Nombre del Profesor: " + prof + "\n");
    }

    /**
     * Metodo que muestra una calificacion de una materia del alumno
     */
    void calificacionB(Alumno a) {
        cal2 = a.getCalifM2();
        System.out.println("___________Calificacion Final: " + a.getCalifM2() + "\n");
    }

    /**
     * Metodo que calcula y muetra el promedio final del alumno
     */
    void promedio(Alumno a) {
        System.out.println("\n");
        promedio = (cal1 + cal2) / 2;
        System.out.println("___________Promedio Final: " + promedio + "\n");
    }
}

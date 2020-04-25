public class AlumnoconOT extends Certificado{

    /**
     * Método que se utiliza para poder mostrar la opcion tecnica del alumno.
     */
    @Override
    void opTecnica(Alumno a) {
       System.out.println("\n");
       
       System.out.println("___________Opcion Tecnica: " + a.getOp_tecnica() + " Calificacion: "+a.getCalifOPT()+"\n");
    }

    /**
     * Método que se utiliza para mostrar el profesor que le dio la opcion tecnica al alumno.
     */
    @Override
    void profesorOT(Alumno a, Profesor[] x) {
        
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
                    if(p.getMateria().equals(a.getOp_tecnica())){
                        prof = p.getNombre();
                    }
                }
            }
        }
        
        System.out.println("___________Nombre del Profesor: " + prof + "\n");
    }
}
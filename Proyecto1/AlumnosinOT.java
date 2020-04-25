
public class AlumnosinOT extends Certificado {

    /**
     * Método que se utiliza para poder mostrar la opcion tecnica del alumno.
     */
    @Override
    void opTecnica(Alumno a) {
        System.out.println("\n");
        System.out.println("___________Opcion Tecnica: Este alumno no curso una opcion tecnica");
    }

    /**
     * Método que se utiliza para mostrar el profesor que le dio la opcion tecnica al alumno.
     */
    @Override
    void profesorOT(Alumno a, Profesor[] x) {
        System.out.println(" ");
    }

}

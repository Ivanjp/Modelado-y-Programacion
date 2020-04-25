
import java.util.Scanner;

public class MenuAlumno implements DespliegaMenu {

    /**
     * Metodo que crea el menu para un Alumno
     * @param a Administrador para ocupar la lista de profesores de ese administrador
     */
    @Override
    public void muestraMenu(Administrador a) {

        Scanner sc = new Scanner(System.in);
        int opcion;
        long id;
        Alumno al = new Alumno();

        System.out.println("Hola Alumno que deseas hacer...:\n\n"
                + "1.- Consultar calificacion de una materia.\n"
                + "2.- Consultar promedio.\n"
                + "3.- Inscribirse a una opcion tecnica.\n");

        String opcionUsuario = sc.nextLine();
        opcion = Integer.parseInt(opcionUsuario);

        switch (opcion) {
            case 1:
                System.out.println("Ingresa tu id: ");
                id = sc.nextLong();
                System.out.println("¿De cual materia quisieras consultar tu calificacion?");
                String mat = sc.nextLine();
                System.out.println("¿Cual grupo es A o B?");
                String grp = sc.nextLine();
                al.consultaCalif(id, mat, grp, a.getArray());
                break;
            case 2:
                System.out.println("Ingresa tu id: ");
                id = sc.nextLong();
                al.consultaProm(id,a.getArray());
                break;
            case 3:
                System.out.println("Ingresa tu id: ");
                id = sc.nextLong();
                al.inscribirOT(id,a.getArray());
                break;
            default:
                System.out.println("Elige una opcion valida.\n");
                break;
        }
    }
}

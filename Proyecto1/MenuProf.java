
import java.util.Scanner;

public class MenuProf implements DespliegaMenu {

    /**
     * Metodo que crea el menu para un Profesor
     * @param a Administrador para ocupar la lista de profesores de ese administrador
     */
    @Override
    public void muestraMenu(Administrador a) {

        Scanner sc = new Scanner(System.in);
        int opcion;
        Profesor p = new Profesor();

        System.out.println("Hola Profesor que deseas hacer...:\n\n"
                + "1.- Consultar información de un grupo.\n"
                + "2.- Asignar calificacion a los alumnos.\n");

        String opcionUsuario = sc.nextLine();
        opcion = Integer.parseInt(opcionUsuario);

        switch (opcion) {
            case 1:
                System.out.println("Ingresa tu id : ");
                long pfl = sc.nextLong();
                p.infoGrupo(pfl,a.getArray());
                break;
            case 2:
                System.out.println("Ingresa tu id : ");
                long pf = sc.nextLong();
                System.out.println("Ingresa el id del alumno que quieres asignar calificacion: ");
                long al = sc.nextLong();
                p.asignaCalif(al,pf,a.getArray());
                break;
            default:
                System.out.println("Elige una opcion valida.\n");
                break;
        }
    }
}

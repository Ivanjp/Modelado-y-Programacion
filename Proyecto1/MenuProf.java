
import java.util.Scanner;

public class MenuProf implements DespliegaMenu {

    @Override
    public void muestraMenu(Administrador a) {

        Scanner sc = new Scanner(System.in);
        int opcion;
        long id;
        Profesor p = new Profesor();

        System.out.println("Hola Profesor que deseas hacer...:\n\n"
                + "1.- Consultar información de un grupo.\n"
                + "2.- Asignar calificacion a los alumnos.\n");

        String opcionUsuario = sc.nextLine();
        opcion = Integer.parseInt(opcionUsuario);

        switch (opcion) {
            case 1:
                p.infoGrupo();
                break;
            case 2:
                p.asignaCalif();
                break;
            default:
                System.out.println("Elige una opcion valida.\n");
                break;
        }
    }
}

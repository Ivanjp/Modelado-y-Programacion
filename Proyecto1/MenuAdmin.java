
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MenuAdmin implements DespliegaMenu {
    
    /**
     * Metodo que crea el menu para un administrador
     * @param a Administrador
     */
    @Override
    public void muestraMenu(Administrador a) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("Hola Administrador que deseas hacer...:\n\n"
                + "1.- Consultar lista de alumnos inscritos en la escuela.\n"
                + "2.- Consultar lista de alumnos de cada area.\n"
                + "3.- Consultar lista de alumnos de opciones técnicas.\n"
                + "4.- Consultar lista de profesores.\n"
                + "5.- Graduar un alumno.\n"
                + "6.- Inscribir un alumno.\n"
                + "7.- Dar de baja un alumno.\n"
                + "8.- Contratar un profesor.\n"
                + "9.- Despedir un profesor.\n");

        String opcionUsuario = sc.nextLine();
        opcion = Integer.parseInt(opcionUsuario);
        

        switch (opcion) {
            case 1:
                a.consultaAlumInscritos();
                break;
            case 2:
                System.out.println("Ingresa el area que quiersas consultar: ");
                String al = sc.nextLine();
                a.consultaAlumnosArea(al);
                break;
            case 3:
                a.consultaAlumnosOT();
                break;
            case 4:
                a.consultaProfesores();
                break;
            case 5:
                System.out.println("Ingresa el id del alumno que deseas graduar: ");
                long alum = sc.nextLong();
                a.graduar(alum);
                break;
            case 6: {
                try {
                    a.inscribirAlumno();
                } catch (NoSuchAlgorithmException ex) {
                    Logger.getLogger(MenuAdmin.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                Logger.getLogger(MenuAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            break;
            case 7:
                System.out.println("Ingresa el id del alumno que deseas dar de baja: ");
                long alu = sc.nextLong();
                a.darBaja(alu);
                System.out.println("Alumno dado de baja correctamente: ");
                break;
            case 8: {
                try {
                    a.contratarProfesor();
                } catch (NoSuchAlgorithmException ex) {
                    Logger.getLogger(MenuAdmin.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                Logger.getLogger(MenuAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            break;
            case 9:
                System.out.println("Ingresa el id del profesor que deseas despedir: ");
                long p = sc.nextLong();
                a.despedir(p);
                break;
            default:
                System.out.println("Elige una opcion valida.\n");
                break;
        }
    }
}

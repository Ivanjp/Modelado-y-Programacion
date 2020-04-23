import java.util.Scanner;

public class Main{

  private DespliegaMenu dp;
  Administrador a = new Administrador();

	private void muestraMenuAdmin(){
		dp = new MenuAdmin();
	}

	private void muestraMenuProf(){
		dp = new MenuProf();
	}

	private void muestraMenuAlumno(){
		dp = new MenuAlumno();
	}

	private void ejecutarMenu(){
		dp.muestraMenu(a);
	}

  public static void main(String[] args) {
    
      Main m = new Main();
    Scanner sc = new Scanner(System.in);
    int opcion;

    do{
      System.out.println("Hola Bienvenido en que perfil quieres acceder..\n\n" +
      "1.- Administrador\n" +
      "2.- Profesor\n" +
      "3.- Alumno\n" +
      "0.- Salir\n");

      String opcionUsuario = sc.nextLine();
      opcion = Integer.parseInt(opcionUsuario);
      

      switch(opcion){
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
    }while(opcion != 0);
  }
}

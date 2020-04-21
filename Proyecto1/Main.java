public class Main{

  public static void main(String[] args) {
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
        System.out.println("Hola Administrador que deseas hacer...:\n\n"+
        "1.- Consultar lista de alumnos inscritos en la escuela.\n"+
        "2.- Consultar lista de alumnos de cada area.\n"+
        "3.- Consultar lista de alumnos de opciones técnicas.\n"+
        "4.- Consultar lista de profesores.\n"+
        "5.- Graduar un alumno.\n"+
        "6.- Inscribir un alumno.\n"+
        "7.- Dar de baja un alumno.\n"+
        "8.- Contratar un profesor.\n"+
        "9.- Despedir un profesor.\n");
        break;
        case 2:
        System.out.println("Hola Profesor que deseas hacer...:\n\n"+
        "1.- Consultar información de un grupo.\n"+
        "2.- Asignar calificacion a los alumnos.\n");
        break;
        case 3:
        System.out.println("Hola Alumno que deseas hacer...:\n\n"+
        "1.- Consultar calificacion de una materia.\n"+
        "2.- Consultar promedio.\n"+
        "3.- Inscribirse a una opcion tecnica.\n");
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

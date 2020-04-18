public class Suspendido implements EstadoRobot{

	Robot robot;

	public Suspendido(Robot nuevoRobot){
		robot = nuevoRobot;
	}

  public void activarse(){
    	System.out.println("Robot activado.");
      robot.asignarEstadoRobot(robot.getEstadoActivo());
  }

  public void camina(){
    System.out.println("No se puede caminar. Primero activa el Robot.");
  }

  public void recibeOrden(){
    System.out.println("No se puede recibir una orden. Primero activa el Robot.");
  }

  public void reabastece(){
    System.out.println("No se puede reabastecer. Primero activa el Robot.");
  }

  public void trabaja(){
    System.out.println("No se puede trabajar. Primero activa el Robot.");
  }

  public void construye(){
    System.out.println("No se puede construir. Primero activa el Robot.");
  }

  public void suspende(){
    System.out.println("El robot ya esta suspendido.");
  }
}

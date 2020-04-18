public class Activo implements EstadoRobot{

	Robot robot;

	public Activo(Robot nuevoRobot){
		robot = nuevoRobot;
	}

  public void activarse(){
    	System.out.println("El robot ya esta activo.");
  }

  public void camina(){
    System.out.println("El Robot se puso a caminar.");
		robot.asignarEstadoRobot(robot.getEstadoCaminando());
  }

  public void recibeOrden(){
    System.out.println("El robot espera tu orden");
		robot.asignarEstadoRobot(robot.getEstadorecibirOrden());
  }

  public void reabastece(){
    System.out.println("No se puede reabastecer. Primero asignale una orden al robot");
  }

  public void trabaja(){
    System.out.println("No se puede trabajar. Primero asignale una orden al robot ");
  }

  public void construye(){
    System.out.println("No se puede construir. Primero asignale una orden al robot.");
  }

  public void suspende(){
    System.out.println("El robot no puede suspenderse. Primero haz que camine.");
  }
}

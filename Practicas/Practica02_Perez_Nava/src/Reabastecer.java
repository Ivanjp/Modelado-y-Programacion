public class Reabastecer implements EstadoRobot{

	Robot robot;

	public Reabastecer(Robot nuevoRobot){
		robot = nuevoRobot;
	}

  public void activarse(){
    	System.out.println("El robot ya esta activo.");
  }

  public void camina(){
    robot.setreabasteceListo(true);
    System.out.println("Robot reabastecido.. el robot empezo a caminar");
    robot.asignarEstadoRobot(robot.getEstadoCaminando());
  }

  public void recibeOrden(){
    System.out.println("El robot ya tiene una orden");
  }

  public void reabastece(){
    System.out.println("El robot ya se esta reabasteciendo");
  }

  public void trabaja(){
    System.out.println("No se puede trabajar en este estado");
  }

  public void construye(){
    System.out.println("No se puede construiren este estado.");
  }

  public void suspende(){
    System.out.println("El robot no se puede suspender.");
  }
}

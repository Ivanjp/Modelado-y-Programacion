public class Trabajar implements EstadoRobot{

	Robot robot;

	public Trabajar(Robot nuevoRobot){
		robot = nuevoRobot;
	}

  public void activarse(){
    	System.out.println("El robot ya esta activo.");
  }

  public void camina(){
    System.out.println("El Robot no se puede poner a caminar.");
  }

  public void recibeOrden(){
    System.out.println("El robot ya no recibe ordenes");
  }

  public void reabastece(){
    System.out.println("No se puede reabastecer.");
  }

  public void trabaja(){
    System.out.println("El robot ya se encuentra en el area de trabajo trabajando. ");
  }

  public void construye(){
    System.out.println("Robot construyendo....");
    robot.asignarEstadoRobot(robot.getEstadoConstruir());
  }

  public void suspende(){
  System.out.println("El robot no puede suspenderse hasta que termine su trabajo.");
  }
}

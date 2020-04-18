public class recibirOrden implements EstadoRobot{

	Robot robot;

	public recibirOrden(Robot nuevoRobot){
		robot = nuevoRobot;
	}


  public void activarse(){
    	System.out.println("El robot ya esta activo.");
  }

  public void camina(){
    if(robot.getordenLista() == true){
      System.out.println("El Robot se puso a caminar.");
      robot.asignarEstadoRobot(robot.getEstadoCaminando());
    }else{
      System.out.println("Primero confirma la orden.");
    }
  }

  public void recibeOrden(){
    System.out.println("El robot ya esta esperando tu orden, ingresala..");
  }

  public void reabastece(){
    System.out.println("No se puede reabastecer. Primero haga que el robot camine");
  }

  public void trabaja(){
    System.out.println("No se puede trabajar aun.");
  }

  public void construye(){
    System.out.println("No se puede construir aun.");
  }

  public void suspende(){
    System.out.println("El robot no se puede suspender.");
  }
}

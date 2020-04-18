public class Caminando implements EstadoRobot{

	Robot robot;

	public Caminando(Robot nuevoRobot){
		robot = nuevoRobot;
	}

  public void activarse(){
    	System.out.println("El robot ya se ha activado anteriormente.");
  }

  public void camina(){
    System.out.println("El Robot ya esta caminando.");
  }

  public void recibeOrden(){
    System.out.println("El robot no puede recibir una orden mientras camina");
  }

  public void reabastece(){
    if(robot.getordenLista() == false){
      System.out.println("El robot no puede reabastecerse, primero asignale una orden");
    }else{
      System.out.println("El robot se dirige a el area de materiales para reabastecerse");
      robot.asignarEstadoRobot(robot.getEstadoReabastecer());
    }
  }

  public void trabaja(){
    if(robot.getordenLista() == true && robot.getreabasteceListo() == true){
      System.out.println("El robot se dirige a el area de trabajo para trabajar");
        robot.asignarEstadoRobot(robot.getEstadoTrabajar());
    }else{
      System.out.println("No se puede trabajar. Primero asignale una orden al robot");
    }
  }

  public void construye(){
    System.out.println("No se puede construir.");
  }

  public void suspende(){
    if(robot.getordenLista() == true && robot.getreabasteceListo() == true){
      System.out.println("El robot no puede suspenderse hasta terminar su trabajo");
    }else if(robot.getfinalizado() == true && robot.getordenLista() == false && robot.getreabasteceListo() == false){
      System.out.println("El robot se dirige a el area de descanso para suspenderse.");
  		robot.asignarEstadoRobot(robot.getEstadoSuspendido());
    }else{
      System.out.println("El robot se dirige a el area de descanso para suspenderse.");
      robot.asignarEstadoRobot(robot.getEstadoSuspendido());
    }
  }
}

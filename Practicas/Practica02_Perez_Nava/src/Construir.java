public class Construir implements EstadoRobot{

	Robot robot;

	public Construir(Robot nuevoRobot){
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
    System.out.println("El robot ya tiene una orden");
  }

  public void reabastece(){
    System.out.println("No se puede reabastecer en este estado");
  }

  public void trabaja(){
    System.out.println("El robot ya se encuentra trabajando");
  }

  public void construye(){
    System.out.println("El robot ya esta construyendo");
  }

  public void suspende(){
    if(robot.getfinalizado() == false){
      System.out.println("El robot no se puede suspender. Aún no termina de construir");
    }else{
        System.out.println("Primero haz que camine");
    }
  }
}

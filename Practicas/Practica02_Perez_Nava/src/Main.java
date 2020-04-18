import java.util.Scanner;

public class Main{

public static void main(String[] args) {
  Robot robot = new Robot();
  Scanner sc = new Scanner(System.in);
  int opcion;


  do{
			System.out.println("Hola operador buen dia " +
				"el robot se encuentra "+ robot.getEstado()+ " seleccione la accion que desea que el robot realice: \n\n"+
				"1.- Activar\n" +
				"2.- Recibir Orden\n" +
				"3.- Caminar\n" +
				"4.- Reabastecerse\n" +
        "5.- Trabajar\n" +
        "6.- Construir\n" +
				"7.- Suspender\n");


				String opcionUsuario = sc.nextLine();


				opcion = Integer.parseInt(opcionUsuario);



				switch(opcion){
					case 1:
						robot.activarse();
						break;

					case 2:
						robot.recibeOrden();
            if(robot.getEstado() == robot.getEstadorecibirOrden()){
              System.out.println("Selecciona el tipo de casa que quieres que construya el robot: \n\n"+
                "1.- Esqueleto de concreto - $500,000\n" +
                "2.- Esqueleto reforzado - $1,000,000\n" +
                "3.- Aislamiento de concreto - $2,000,000\n" +
                "4.- Aislamiento de vidrio - $2,500,00\n" +
                "5.- Aislamiento de madera - $1,000,000\n" +
                "6.- Aislamiento reforzado - $3,000,000\n");
                String opc = sc.nextLine();
                int op = Integer.parseInt(opc);
                robot.setopcion(op);
                robot.setordenLista(true);
            }
						break;

					case 3:
						robot.camina();
						break;

					case 4:
						robot.reabastece();
						break;

          case 5:
              robot.trabaja();
            break;

          case 6:
              int op = robot.getopcion();
  						robot.construye();
              if (op == 1) {
                Construccion cons = new E_Concreto();
		            cons.pasosConstruccion();
                robot.setfinalizado(true);
                System.out.println("La casa fue hecha con Esqueleto de concreto y tuvo un costo de "+cons.getcosto()+"\n");
                robot.setordenLista(false);
                robot.setreabasteceListo(false);
              }else if(op == 2){
                Construccion cons = new E_reforzado();
		            cons.pasosConstruccion();
                robot.setfinalizado(true);
                System.out.println("La casa fue hecha con Esqueleto reforzado y tuvo un costo de "+cons.getcosto()+"\n");
                robot.setordenLista(false);
                robot.setreabasteceListo(false);
              }else if(op == 3){
                Construccion cons = new A_concreto();
		            cons.pasosConstruccion();
                robot.setfinalizado(true);
                System.out.println("La casa fue hecha con Aislamiento de concreto y tuvo un costo de "+cons.getcosto()+"\n");
                robot.setordenLista(false);
                robot.setreabasteceListo(false);
              }else if(op == 4){
                Construccion cons = new A_vidrio();
                cons.pasosConstruccion();
                robot.setfinalizado(true);
                System.out.println("La casa fue hecha con Aislamiento de vidrio y tuvo un costo de "+cons.getcosto()+"\n");
                robot.setordenLista(false);
                robot.setreabasteceListo(false);
              }else if(op == 5){
                Construccion cons = new A_madera();
		            cons.pasosConstruccion();
                robot.setfinalizado(true);
                System.out.println("La casa fue hecha con Aislamiento de madera y tuvo un costo de "+cons.getcosto()+"\n");
                robot.setordenLista(false);
                robot.setreabasteceListo(false);
              }else if(op == 6){
                Construccion cons = new A_reforzado();
		            cons.pasosConstruccion();
                robot.setfinalizado(true);
                System.out.println("La casa fue hecha con Aislamiento de reforzado y tuvo un costo de "+cons.getcosto()+"\n");
                robot.setordenLista(false);
                robot.setreabasteceListo(false);
              }
  					break;

					case 7:
             robot.suspende();
						break;

					default:
						System.out.println("Elige una opcion valida.\n");
						break;

				}

		}while(opcion != 0);
}
}

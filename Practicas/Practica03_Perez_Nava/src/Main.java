
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    /**
     * Método que imprime el ticket de la compra del usuario
     * @param ing Arreglo que guarda los ingredientes
     * @param total Total de la compra
     */
    public void ticket(ArrayList<String> ing, int total) {

        System.out.println("Ingredientes \n");

        for (int i = 0; i < ing.size(); i++) {
            System.out.println(ing.get(i) + "\n");
        }

        System.out.println("Total: " + total + "\n");

    }

    public static void main(String[] args) {

        ArrayList<String> ingredientes = new ArrayList<>();//arreglo donde se guardan los ingredientes que el usuario escoge para posteriormente imprimirlos en el ticket

        Scanner sc = new Scanner(System.in);
        int opcion;
        Main m = new Main();

        do {
            System.out.println("Bienvenido a WaySub que desea ordenar: \n\n"
                    + "1.- Baguette\n"
                    + "2.- Pizza\n"
                    + "0.- Salir\n");

            String opcionUsuario = sc.nextLine();

            opcion = Integer.parseInt(opcionUsuario);

            switch (opcion) {
                case 1:
                    int op;
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Elige tu tipo de pan.\n" + "1.- Pan Blanco\n" + "2.- Pan Integral\n");
                    op = sc1.nextInt();

                    if (op == 1) {
                        Baguettes b1 = new BaguetteBlanco();
                        ingredientes.add(b1.getDescripcion());

                        do {
                            System.out.println("Escoge tus ingredientes: \n"
                                    + "1.- Pollo\n"
                                    + "2.- Pepperoni\n"
                                    + "3.- Jamon\n"
                                    + "4.- Lechuga\n"
                                    + "5.- Jitomate\n"
                                    + "6.- Cebolla\n"
                                    + "7.- Mostaza\n"
                                    + "8.- Catsup\n"
                                    + "9.- Mayonesa\n"
                                    + "0.- Imprimir ticket\n");

                            op = sc1.nextInt();

                            switch (op) {
                                case 1:
                                    b1 = new Pollo(b1);
                                    ingredientes.add(b1.getDescripcion());
                                    System.out.println("\n");
                                    break;
                                case 2:
                                    b1 = new Pepperoni(b1);
                                    ingredientes.add(b1.getDescripcion());
                                    System.out.println("\n");
                                    break;
                                case 3:
                                    b1 = new Jamon(b1);
                                    ingredientes.add(b1.getDescripcion());
                                    System.out.println("\n");
                                    break;
                                case 4:
                                    b1 = new Lechuga(b1);
                                    ingredientes.add(b1.getDescripcion());
                                    System.out.println("\n");
                                    break;
                                case 5:
                                    b1 = new Jitomate(b1);
                                    ingredientes.add(b1.getDescripcion());
                                    System.out.println("\n");
                                    break;
                                case 6:
                                    b1 = new Cebolla(b1);
                                    ingredientes.add(b1.getDescripcion());
                                    System.out.println("\n");
                                    break;
                                case 7:
                                    b1 = new Mostaza(b1);
                                    ingredientes.add(b1.getDescripcion());
                                    System.out.println("\n");
                                    break;
                                case 8:
                                    b1 = new Catsup(b1);
                                    ingredientes.add(b1.getDescripcion());
                                    System.out.println("\n");
                                    break;
                                case 9:
                                    b1 = new Mayonesa(b1);
                                    ingredientes.add(b1.getDescripcion());
                                    System.out.println("\n");
                                    break;
                                case 0:
                                    break;
                                default:
                                    System.out.println("Elige una opcion valida.\n");
                                    break;
                            }
                        } while (op != 0);

                        m.ticket(ingredientes, b1.costo());
                        ingredientes.clear();
                    } else if (op == 2) {
                        Baguettes b1 = new BaguetteIntegral();
                        ingredientes.add(b1.getDescripcion());

                        do {
                            System.out.println("Escoge tus ingredientes: \n"
                                    + "1.- Pollo\n"
                                    + "2.- Pepperoni\n"
                                    + "3.- Jamon\n"
                                    + "4.- Lechuga\n"
                                    + "5.- Jitomate\n"
                                    + "6.- Cebolla\n"
                                    + "7.- Mostaza\n"
                                    + "8.- Catsup\n"
                                    + "9.- Mayonesa\n"
                                    + "0.- Imprimir ticket\n");

                            op = sc1.nextInt();

                            switch (op) {
                                case 1:
                                    b1 = new Pollo(b1);
                                    ingredientes.add(b1.getDescripcion());
                                    System.out.println("\n");
                                    break;
                                case 2:
                                    b1 = new Pepperoni(b1);
                                    ingredientes.add(b1.getDescripcion());
                                    System.out.println("\n");
                                    break;
                                case 3:
                                    b1 = new Jamon(b1);
                                    ingredientes.add(b1.getDescripcion());
                                    System.out.println("\n");
                                    break;
                                case 4:
                                    b1 = new Lechuga(b1);
                                    ingredientes.add(b1.getDescripcion());
                                    System.out.println("\n");
                                    break;
                                case 5:
                                    b1 = new Jitomate(b1);
                                    ingredientes.add(b1.getDescripcion());
                                    System.out.println("\n");
                                    break;
                                case 6:
                                    b1 = new Cebolla(b1);
                                    ingredientes.add(b1.getDescripcion());
                                    System.out.println("\n");
                                    break;
                                case 7:
                                    b1 = new Mostaza(b1);
                                    ingredientes.add(b1.getDescripcion());
                                    System.out.println("\n");
                                    break;
                                case 8:
                                    b1 = new Catsup(b1);
                                    ingredientes.add(b1.getDescripcion());
                                    System.out.println("\n");
                                    break;
                                case 9:
                                    b1 = new Mayonesa(b1);
                                    ingredientes.add(b1.getDescripcion());
                                    System.out.println("\n");
                                    break;
                                case 0:
                                    break;
                                default:
                                    System.out.println("Elige una opcion valida.\n");
                                    break;
                            }
                        } while (op != 0);

                        m.ticket(ingredientes, b1.costo());
                        ingredientes.clear();
                    } else {
                        System.out.println("Opcion incorrecta.");
                    }

                    break;

                case 2:
                    int op2;
                    Scanner sc2 = new Scanner(System.in);
                    
                    System.out.println("Elige tu pizza.\n" + "1.- Pizza Sousagddar .... Precio: $85\n" + "2.- Pizza BigJam .... Precio: $115\n"+ "3.- Pizza Salchicha .... Precio: $120\n"
                    + "4.- Pizza Pollo 1 .... Precio: $100\n"+ "5.- Pizza Pollo 2 .... Precio: $125\n");
                    
                    op2 = sc2.nextInt();
                    
                    if(op2 == 1){
                        Pizza p = new PizzaSousagddar();
                        Baguettes b2 = new PizzaAdapter(p);
                        ingredientes.add(b2.getDescripcion());
                        m.ticket(ingredientes, b2.costo());
                    }else if(op2 == 2){
                        Pizza p = new PizzaBigJam();
                        Baguettes b2 = new PizzaAdapter(p);
                        ingredientes.add(b2.getDescripcion());
                        m.ticket(ingredientes, b2.costo());
                    }else if(op2 == 3){
                        Pizza p = new PizzaSalchicha();
                        Baguettes b2 = new PizzaAdapter(p);
                        ingredientes.add(b2.getDescripcion());
                        m.ticket(ingredientes, b2.costo());
                    }else if(op2 == 4){
                        Pizza p = new PizzaPollo1();
                        Baguettes b2 = new PizzaAdapter(p);
                        ingredientes.add(b2.getDescripcion());
                        m.ticket(ingredientes, b2.costo());
                    }else if(op2 == 5){
                        Pizza p = new PizzaPollo2();
                        Baguettes b2 = new PizzaAdapter(p);
                        ingredientes.add(b2.getDescripcion());
                        m.ticket(ingredientes, b2.costo());
                    }
                    
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Elige una opcion valida.\n");
                    break;

            }

        } while (opcion != 0);

    }
}

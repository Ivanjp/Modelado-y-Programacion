
import java.util.Scanner;

public class Main {

    /**
     * Metodo que imprime el inventario de las sucursales
     * @param s1 Sucursal 1
     * @param s2 Sucursal 2
     * @param s3 Sucursal 3
     */
    private void imprimeInventario(Sucursal s1, Sucursal s2, Sucursal s3) {
        System.out.println("Inventario de " + s1.getNombre() + ": \n");
        s1.muestraInventario();
        System.out.println("\nInventario de " + s2.getNombre() + ": \n");
        s2.muestraInventario();
        System.out.println("\nInventario de " + s3.getNombre() + ": \n");
        s3.muestraInventario();
    }

    public static void main(String[] args) {

        Main m = new Main();//Creamos un objeto de tipo main

        /*
        * LISTA DE LOS NOMBRES DE LOS DULCES QUE SE PUEDEN OCUPAR PARA HACER EL PEDIDO
        * Ositos dulces
        * Gusanos Acidos
        * Frutas con chamoy
        * Chocolate con leche
        * Chocolate con almendras
        * Chocolate oscuro
        * Galletas Saladas
        * Galletas con mermelada
        * Galletas con chispas
        */

        //Se crean las sucursales
        Sucursal viaducto = new Suc_Viaducto();
        Sucursal copilco = new Suc_Copilco();
        Sucursal azc = new Suc_Azcapotzalco();

        Scanner sc = new Scanner(System.in);
        int opcion;
        JefeTecnico jt = new JefeTecnico();//Se crea al jefe tecnico

        do {
            System.out.println("Hola administrador que deseas hacer:\n\n"
                    + "1.- Ver inventarios\n"
                    + "2.- Ver produccion del dia\n"
                    + "0.- Salir\n");

            String opcionUsuario = sc.nextLine();

            opcion = Integer.parseInt(opcionUsuario);

            switch (opcion) {
                case 1:
                    m.imprimeInventario(viaducto, copilco, azc);
                    System.out.println("\n");
                    break;

                case 2:
                    copilco.hacerPedido("Galletas Saladas", false, jt);//Pedido valido de galletas pero con ingredientes no suficientes
                    azc.hacerPedido("Frutas con Chamoy",false,jt);//Pedido valido de gomitas
                    viaducto.hacerPedido("Chocolate con Almendras",false,jt);//pedido valido de chocolates
                    azc.hacerPedido("Chocolate con leche",true,jt);//pedido NO valido ya que se SI se cuenta con este producto
                    m.imprimeInventario(viaducto, copilco, azc);
                    System.out.println("\n");
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

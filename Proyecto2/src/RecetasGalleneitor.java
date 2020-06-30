
import java.util.Scanner;

public class RecetasGalleneitor {

    Scanner sc = new Scanner(System.in);

    /**
     * Metodo que crea Galletas de mermelada
     * @param w Maquina Wonka3000
     * @return Regresa la galleta producida ya adpatada para el empaquetado de Wonka3000
     */
    public Producto produceMermelada(Wonka3000 w) {

        int cantidad;
        do {
            System.out.println("Cuantas piezas quieres producir? (Maximo 25pz)\n");
            cantidad = sc.nextInt();
        } while (cantidad >= 25);
        System.out.println("\n");
        System.out.println("Empezando proceso\n");
        System.out.println("Recibiendo masa..");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ie) {
            System.out.println("Hilo de ejecución interrumpido.");
        }
        System.out.println("Preparando masa..");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException ie) {
            System.out.println("Hilo de ejecución interrumpido.");
        }
        System.out.println("Agregando Harina..");
        w.restaIngredientes("harina", 5 * cantidad);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ie) {
            System.out.println("Hilo de ejecución interrumpido.");
        }
        System.out.println("Agregando Huevo..");
        w.restaIngredientes("huevo", 3);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ie) {
            System.out.println("Hilo de ejecución interrumpido.");
        }
        System.out.println("Agregando Leche..");
        w.restaIngredientes("leche", 10 * cantidad);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ie) {
            System.out.println("Hilo de ejecución interrumpido.");
        }
        System.out.println("Agregando mermelada..");
        w.restaIngredientes("mermelada", 8 * cantidad);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ie) {
            System.out.println("Hilo de ejecución interrumpido.");
        }
        System.out.println("Dando forma a las galletas..");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ie) {
            System.out.println("Hilo de ejecución interrumpido.");
        }
        System.out.println("Cocinando masa..");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ie) {
            System.out.println("Hilo de ejecución interrumpido.");
        }
        Galletas g = new Galletas("Galleta con masa normal", "rellena de Mermelada", cantidad);
        GalletaAdapter galleta = new GalletaAdapter(g);
        System.out.println("Galletas listas\n");
        return galleta;
    }

    /**
     * Metodo que crea Galletas de chispas
     * @param w Maquina Wonka3000
     * @return Regresa la galleta producida ya adpatada para el empaquetado de Wonka3000
     */
    public Producto produceChispas(Wonka3000 w) {
        System.out.println("\n");
        int cantidad;
        do {
            System.out.println("Cuantas piezas quieres producir? (Maximo 25pz)\n");
            cantidad = sc.nextInt();
        } while (cantidad >= 25);
        System.out.println("\n");
        System.out.println("Empezando proceso\n");
        System.out.println("Recibiendo masa con chispas..");
        w.restaIngredientes("chispas", 200);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ie) {
            System.out.println("Hilo de ejecución interrumpido.");
        }
        System.out.println("Preparando masa..");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException ie) {
            System.out.println("Hilo de ejecución interrumpido.");
        }
        System.out.println("Agregando Harina..");
        w.restaIngredientes("harina", 5 * cantidad);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ie) {
            System.out.println("Hilo de ejecución interrumpido.");
        }
        System.out.println("Agregando Huevo..");
        w.restaIngredientes("huevo", 3);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ie) {
            System.out.println("Hilo de ejecución interrumpido.");
        }
        System.out.println("Agregando Leche..");
        w.restaIngredientes("leche", 10 * cantidad);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ie) {
            System.out.println("Hilo de ejecución interrumpido.");
        }
        System.out.println("Dando forma a las galletas..");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ie) {
            System.out.println("Hilo de ejecución interrumpido.");
        }
        System.out.println("Cocinando masa..");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ie) {
            System.out.println("Hilo de ejecución interrumpido.");
        }
        Galletas g = new Galletas("Galleta con masa con chispas", "", cantidad);
        GalletaAdapter galleta = new GalletaAdapter(g);
        System.out.println("Galletas listas\n");
        return galleta;
    }

    /**
     * Metodo que crea Galletas saladas
     * @param w Maquina Wonka3000
     * @return Regresa la galleta producida ya adpatada para el empaquetado de Wonka3000
     */
    public Producto produceSaladas(Wonka3000 w) {

        int cantidad;
        do {
            System.out.println("Cuantas piezas quieres producir? (Maximo 25pz)\n");
            cantidad = sc.nextInt();
        } while (cantidad >= 25);
        System.out.println("\n");
        System.out.println("Empezando proceso\n");
        System.out.println("Recibiendo masa..");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ie) {
            System.out.println("Hilo de ejecución interrumpido.");
        }
        System.out.println("Preparando masa..");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException ie) {
            System.out.println("Hilo de ejecución interrumpido.");
        }
        System.out.println("Agregando Harina..");
        w.restaIngredientes("harina", 5 * cantidad);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ie) {
            System.out.println("Hilo de ejecución interrumpido.");
        }
        System.out.println("Agregando Huevo..");
        w.restaIngredientes("huevo", 3);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ie) {
            System.out.println("Hilo de ejecución interrumpido.");
        }
        System.out.println("Agregando Leche..");
        w.restaIngredientes("leche", 10 * cantidad);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ie) {
            System.out.println("Hilo de ejecución interrumpido.");
        }
        System.out.println("Agregando sal..");
        w.restaIngredientes("sal", 2 * cantidad);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ie) {
            System.out.println("Hilo de ejecución interrumpido.");
        }
        System.out.println("Dando forma a las galletas..");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ie) {
            System.out.println("Hilo de ejecución interrumpido.");
        }
        System.out.println("Cocinando masa..");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ie) {
            System.out.println("Hilo de ejecución interrumpido.");
        }
        Galletas g = new Galletas("Galleta con masa normal", "con sal", cantidad);
        GalletaAdapter galleta = new GalletaAdapter(g);
        System.out.println("Galletas listas\n");
        return galleta;
    }
}

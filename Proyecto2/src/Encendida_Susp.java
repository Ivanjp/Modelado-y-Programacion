
import java.util.Scanner;
/*
 * Clase que simula el estado Encendido de la maquina
 */
public class Encendida_Susp implements EstadoMaquina {

    Maquina maquina;//Maquina que estamos ocupando

    /**
     * Constructor de la clase
     * @param nuevoMaquina Maquina que hemos iniciado
     */
    public Encendida_Susp(Maquina nuevoMaquina) {
        maquina = nuevoMaquina;
    }

    @Override
    public void reabastecer(String dulce) {
        Wonka3000 w = maquina.getmaqActual();
        w.verificaIngredientes(dulce);
    }

    @Override
    public void elegirDulce() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a Wonka3000 ingresa el dulce a producir:\n\n"
                + "1.- Ositos dulces\n"
                + "2.- Gusanos Acidos\n"
                + "3.- Frutas con chamoy\n"
                + "4.- Chocolate con leche\n"
                + "5.- Chocolate con almendras\n"
                + "6.- Chocolate oscuro\n"
                + "7.- Galletas Saladas\n"
                + "8.- Galletas con mermelada\n"
                + "9.- Galletas con chispas\n");

        String opcionUsuario = sc.nextLine();

        int opcion = Integer.parseInt(opcionUsuario);

        switch (opcion) {
            case 1:
                maquina.setDulce("Ositos dulces");
                break;

            case 2:
                maquina.setDulce("Gusanos Acidos");
                break;

            case 3:
                maquina.setDulce("Frutas con chamoy");
                break;

            case 4:
                maquina.setDulce("Chocolate con leche");
                break;

            case 5:
                maquina.setDulce("Chocolate con almendras");
                break;
            case 6:
                maquina.setDulce("Chocolate oscuro");
                break;
            case 7:
                maquina.setDulce("Galletas Saladas");
                break;
            case 8:
                maquina.setDulce("Galletas rellenas de mermelada");
                break;
            case 9:
                maquina.setDulce("Galletas con chispas");
                break;

            default:
                System.out.println("Elige una opcion valida.\n");
                break;

        }

        System.out.println("\nDulce seleccionado, pasando a proceso de preparacion...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ie) {
            System.out.println("Hilo de ejecución interrumpido.");
        }
        maquina.asignarEstadoMaquina(maquina.getEstadoPreparandoDulce());
    }

    @Override
    public void entregarDulce(Producto p) {
        System.out.println("No se puede realizar esta accion hasta preparar el lote");
    }

    @Override
    public void terminar() {
        System.out.println("Apagando maquina....");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ie) {
            System.out.println("Hilo de ejecución interrumpido.");
        }
        maquina.asignarEstadoMaquina(maquina.getEstadoApagada());
        System.out.println("Maquina apagada.\n");
    }

    @Override
    public void iniciar() {
        System.out.println("La maquina ya esta encendida..");
    }

    @Override
    public void preparando() {
        System.out.println("No se puede realizar esta accion");
    }

}

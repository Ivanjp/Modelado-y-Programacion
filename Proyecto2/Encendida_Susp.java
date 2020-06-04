
import java.util.Scanner;

public class Encendida_Susp implements EstadoMaquina {

    Maquina maquina;

    public Encendida_Susp(Maquina nuevoMaquina) {
        maquina = nuevoMaquina;
    }

    @Override
    public void reabastecer() {
        //metodo del jefe tecnico
    }

    @Override
    public void elegirDulce() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que dulce deseas pedir:\n\n"
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

        System.out.println("Dulce seleccionado, pasando a proceso de preparacion...");
        maquina.asignarEstadoMaquina(maquina.getEstadoPreparandoDulce());
    }

    @Override
    public void entregarDulce() {
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
        System.out.println("Maquina apagada.");
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

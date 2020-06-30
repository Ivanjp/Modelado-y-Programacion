/*
 * Clase que simula el estado Apagado de la maquina
 */
public class Apagada implements EstadoMaquina {
    
    Maquina maquina;//Maquina que estamos ocupando

    /**
     * Constructor de la clase
     * @param nuevoMaquina Maquina que hemos iniciado
     */
    public Apagada(Maquina nuevoMaquina) {
        maquina = nuevoMaquina;
    }

    @Override
    public void reabastecer(String dulce) {
        System.out.println("No se puede reabastecer hasta encender la maquina");
    }

    @Override
    public void elegirDulce() {
       System.out.println("No se puede realizar esta accion hasta encender la maquina");
    }

    @Override
    public void entregarDulce(Producto p) {
        System.out.println("No se puede realizar esta accion hasta encender la maquina");
    }

    @Override
    public void terminar() {
        System.out.println("No se puede realizar esta accion hasta encender la maquina");
    }

    @Override
    public void iniciar() {
        System.out.println("Encendiendo Maquina...");
        try {
            Thread.sleep(7000);
        } catch (InterruptedException ie) {
            System.out.println("Hilo de ejecución interrumpido.");
        }
        System.out.println("Maquina Encendida.\n");
        maquina.asignarEstadoMaquina(maquina.getEstadoEncendida_suspendida());
    }

    @Override
    public void preparando() {
        System.out.println("No se puede realizar esta accion");
    }
    
}


public class Apagada implements EstadoMaquina {
    
    Maquina maquina;

    public Apagada(Maquina nuevoMaquina) {
        maquina = nuevoMaquina;
    }

    @Override
    public void reabastecer() {
        System.out.println("No se puede realizar esta accion hasta encender la maquina");
    }

    @Override
    public void elegirDulce() {
       System.out.println("No se puede realizar esta accion hasta encender la maquina");
    }

    @Override
    public void entregarDulce() {
        System.out.println("No se puede realizar esta accion hasta encender la maquina");
    }

    @Override
    public void terminar() {
        System.out.println("No se puede realizar esta accion hasta encender la maquina");
    }

    @Override
    public void iniciar() {
        System.out.println("Encendiendo Maquina..");
        maquina.asignarEstadoMaquina(maquina.getEstadoEncendida_suspendida());
    }

    @Override
    public void preparando() {
        System.out.println("No se puede realizar esta accion");
    }
    
}

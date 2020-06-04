
public class Empacando implements EstadoMaquina {
    
    Maquina maquina;

    public Empacando(Maquina nuevoMaquina) {
        maquina = nuevoMaquina;
    }

    @Override
    public void reabastecer() {
      System.out.println("No se puede realizar esta accion hasta terminar este lote");
    }

    @Override
    public void elegirDulce() {
       System.out.println("No se puede realizar esta accion hasta terminar este lote");
    }

    @Override
    public void entregarDulce(){
        maquina.asignarEstadoMaquina(maquina.getEstadoEncendida_suspendida());
    }

    @Override
    public void terminar() {
      System.out.println("No se puede realizar esta accion hasta terminar este lote");
    }

    @Override
    public void iniciar() {
       System.out.println("No se puede realizar esta accion hasta terminar este lote");
    }

    @Override
    public void preparando() {
       System.out.println("No se puede realizar esta accion hasta terminar este lote");
    }
    
}

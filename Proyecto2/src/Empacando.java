/*
 * Clase que simula el estado de Empacado de la maquina
 */
public class Empacando implements EstadoMaquina {
    
    Maquina maquina;//Maquina que estamos ocupando

    /**
     * Constructor de la clase
     * @param nuevoMaquina Maquina que hemos iniciado
     */
    public Empacando(Maquina nuevoMaquina) {
        maquina = nuevoMaquina;
    }
    
    @Override
    public void reabastecer(String dulce) {
        System.out.println("No se puede realizar esta accion hasta terminar este lote");
    }
    
    @Override
    public void elegirDulce() {
        System.out.println("No se puede realizar esta accion hasta terminar este lote");
    }
    
    @Override
    public void entregarDulce(Producto p) {
        Wonka3000 w = maquina.getmaqActual();
        
        w.empaqueta(p);
        
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

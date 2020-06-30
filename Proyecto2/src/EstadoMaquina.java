
public interface EstadoMaquina {

     /**
     * Accion reabastecer que puede realizar la maquina
     * @param dulce Recibe el dulce para saber sus ingredientes para poder reabastecer la maquina
     */
    void reabastecer(String dulce);

    /**
     * Accion para elegir el dulce a producir que realiza la maquina
     */
    void elegirDulce();

    /**
     * Accion para empaquetar el producto y entregarlo
     * @param p Producto a entregar y empaquetar
     */
    void entregarDulce(Producto p);
    
    /**
     * Accion de apagar la maquina
     */
    void terminar();
    
    /**
     * Accion para encender la maquina
     */
    void iniciar();
    
    /**
     * Accion de preparar el dulce que realiza la maquina
     */
    void preparando();

}



public abstract class Sucursal {

    int id;//Id de la sucursal
    String direccion;//Direccion de la sucursal
    Repostero rep;//Repostero asignado a la sucursal
    String nombre;//Nombre de la sucursal

    /**
     * Getter del nombre de la sucursal
     * @return Regresa el nombre de la sucursal
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Getter del id de la sucursal
     * @return Regresa el id de la sucursal
     */
    public int getId() {
        return this.id;
    }

    /**
     * Getter de la direccion de la sucursal
     * @return Regresa la direccion de la sucursal
     */
    public String getDireccion() {
        return this.direccion;
    }

    /**
     * Getter del repostero asignado de la sucursal
     * @return Regresa el repostero de la sucursal
     */
    public Repostero getRepostero() {
        return this.rep;
    }

    /**
     * Metodo de la sucursal para realizar un pedido
     * @param pedido Pedido que la sucursal va a realizar
     * @param b bandera para saber si es el ultimo pedido del dia
     * @param jt Jefe tecnico global para todos los pedidos de las 3 sucursales
     */
    public void hacerPedido(String pedido,boolean b,JefeTecnico jt) {
        this.rep.realizaPedido(pedido, this,b,jt);
    }

    /**
     * Metodo abstracto que utilizan las sucursales para mostrar su inventario
     */
    public abstract void muestraInventario();

    /**
     * Metodo abstracto que utilizan las sucursales para actualizar su inventario
     * @param l Lote que se actualizara del inventario de la sucursal
     */
    public abstract void actualizaInventario(Lote l);

    /**
     * Metodo abstracto que utilizan las sucursales para agregar lotes a su inventario
     * @param lote Lote que se agregara al inventario de la sucursal
     */
    public abstract void agregaInventario(Lote lote);

    /**
     * Metodo abstracto que utilizan las sucursales para buscar un lote en su inventario
     * @param lote Lote que se buscara en el inventario de la sucursal
     */
    public abstract Lote buscaLote(String lote);
}

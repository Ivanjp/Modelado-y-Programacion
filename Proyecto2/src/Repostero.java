
public class Repostero {

    private String nombre;//Nombre del repostero

    /**
     * Constructor del repostero
     * @param nombre Nombre del repostero
     */
    public Repostero(String nombre) {
        this.nombre = nombre;
    }

    /**
     *Metodo que utiliza el repartidor de cada sucursal para pedirle al jefe tecnico el pedido de la sucursal
     * @param pedido Pedido que realiza la sucursal
     * @param sucursal Sucursal que realiza el pedido
     * @param b Bandera para saber si es el ultimo pedido del dia
     * @param jt Jefe tecnico global para todos los pedidos
     */
    public void realizaPedido(String pedido, Sucursal sucursal,boolean b,JefeTecnico jt) {
        jt.agregaSuc(sucursal);
        Proxy suc = new Proxy(sucursal);//Se hace la copia de la sucursal
        jt.procesaPedido(pedido,suc,b);
    }
}


public class Repostero {

    private String nombre;

    public Repostero(String nombre) {
        this.nombre = nombre;
    }

    public void realizaPedido(String pedido, Sucursal sucursal) {
        JefeTecnico jt = new JefeTecnico();
        Proxy suc = new Proxy(sucursal);
        jt.procesaPedido(pedido,suc);
    }
}

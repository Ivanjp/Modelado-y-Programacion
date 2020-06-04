
public class Lote {

    Producto producto;

    public Lote(Producto producto) {
        this.producto = producto;
    }

    public String getNombre() {
        return producto.getTipo();
    }

    public int getCantidad() {
        return producto.getCantidad();
    }
}

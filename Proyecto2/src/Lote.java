
public class Lote {

    Producto producto;//Variable de tipo Producto del que se va a crear el lote
    
    /**
     * Constructor del Lote
     * @param producto Producto del que se hara el lote
     */
    public Lote(Producto producto) {
        this.producto = producto;
    }

    /**
     * Getter del nombre del lote
     * @return Nombre del producto del que es el lote
     */
    public String getNombre() {
        return producto.getTipo();
    }

    /**
     * Getter de la cantidad del lote
     * @return Cantidad de productos del lote
     */
    public int getCantidad() {
        return producto.getCantidad();
    }
    
    /**
     * Setter de la cantidad del lote
     * @param cantidad cantidad nuevo de productos del lote
     */
    public void setCantidad(int cantidad) {
        producto.setCantidad(cantidad);
    }
    
    
}

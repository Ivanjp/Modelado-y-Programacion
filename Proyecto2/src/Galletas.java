
public class Galletas {

    String producto;//Tipo de galleta
    String ingrediente_extra;//ingrediente extra de la galleta
    int cantidad;// cantidad a producir

    /**
     * Constructor de Galletas
     * @param producto Tipo de galleta o masa ya que la de chispas no requiere ingredientes extra
     * @param ingrediente_extra Ingrediente extra que se pone en la preparacion
     * @param cantidad Cantidad que se quiere producir
     */
    public Galletas(String producto, String ingrediente_extra, int cantidad) {
        this.producto = producto;
        this.ingrediente_extra = ingrediente_extra;
        this.cantidad = cantidad;
    }

    /**
     * Getter del producto
     * @return Tipo de galleta/masa
     */
    public String getProducto() {
        return producto;
    }

    /**
     * Getter del ingrediente extra
     * @return Ingrediente extra que se va a poner en la masa
     */
    public String getIngrediente_extra() {
        return ingrediente_extra;
    }

    /**
     * Getter de la cantidad
     * @return Cantidad de galletas producidas
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Setter de la cantidad producida
     * @param cantidad Cantidad nueva de galletas producidas
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}

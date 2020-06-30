
public interface Producto {
    
    /**
     * Getter del nombre del producto
     * @return Nombre del producto
     */
    public String getTipo();
    
    /**
     * Getter de la cantidad del lote
     * @return Cantidad de productos 
     */
    public int getCantidad();
    
    /**
     * Setter de la cantidad del producto
     * @param cantidad Cantidad de productos 
     */
    public void setCantidad(int cantidad);
    
}

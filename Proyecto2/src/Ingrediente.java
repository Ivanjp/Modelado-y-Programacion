public class Ingrediente {
    
    String nombre;//Nombre del ingrediente
    int cantidad;//Cantidad que hay del ingrediente

    /**
     * Constructor del Ingrediente
     * @param nombre Nombre del ingrediente
     * @param cantidad Cantidad de ingredientes
     */
    public Ingrediente(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    /**
     * Getter del nombre del ingrediente
     * @return Nombre del ingrediente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter del nombre del ingrediente
     * @param nombre Nombre del ingrediente
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter de la cantidad de ingredientes
     * @return cantidad de ingredientes
     */
    public int getCantidad() {
        return cantidad;
    }

     /**
     * Setter dede la cantidad de ingredientes
     * @param cantidad cantidad de ingredientes
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}

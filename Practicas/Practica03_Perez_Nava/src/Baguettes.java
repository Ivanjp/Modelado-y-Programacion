
public abstract class Baguettes {

    String descripcion;//Descripcion del baguette
    int costo = 0;//costo total del baguette(incluyendo ingredientes)

    /**
     * Método que regresa la descripcion del baguette
     * @return String descripcion del baguette
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Método que toma el costo de los panes y los ingredientes
     * @return int costo de los ingredientes y del pan
     */
    public abstract int costo();

    
}

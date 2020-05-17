
public class Pepperoni extends Baguettes {

    Baguettes baguette;//Variable que guarda la baguette seleccionada

    /**
     * Constructor del ingrediente Pepperoni
     * @param baguette Baguette del usuario
     */
    public Pepperoni(Baguettes baguette) {
        this.baguette = baguette;
    }

    @Override
    public int costo() {
        return baguette.costo() + 13;
    }

    @Override
    public String getDescripcion() {
        return "Pepperoni";
    }
    

}

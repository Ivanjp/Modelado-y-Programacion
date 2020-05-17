
public class Mostaza extends Baguettes {

    Baguettes baguette;//Variable que guarda la baguette seleccionada

    /**
     * Constructor del ingrediente Mostaza
     * @param baguette Baguette del usuario
     */
    public Mostaza(Baguettes baguette) {
        this.baguette = baguette;
    }

    @Override
    public int costo() {
        return baguette.costo() + 7;
    }

    @Override
    public String getDescripcion() {
        return "Mostaza";
    }
    

}

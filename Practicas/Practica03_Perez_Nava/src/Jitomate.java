
public class Jitomate extends Baguettes {

    Baguettes baguette;//Variable que guarda la baguette seleccionada

    /**
     * Constructor del ingrediente Jitomate
     * @param baguette Baguette del usuario
     */
    public Jitomate(Baguettes baguette) {
        this.baguette = baguette;
    }

    @Override
    public int costo() {
        return baguette.costo() + 6;
    }

    @Override
    public String getDescripcion() {
        return "Jitomate";
    }
    
}

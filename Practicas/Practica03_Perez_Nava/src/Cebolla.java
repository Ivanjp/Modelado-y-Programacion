
public class Cebolla extends Baguettes {

    Baguettes baguette;//Variable que guarda la baguette seleccionada

    /**
     * Constructor del ingrediente Cebolla
     * @param baguette Baguette del usuario
     */
    public Cebolla(Baguettes baguette) {
        this.baguette = baguette;
    }

    @Override
    public int costo() {
        return baguette.costo() + 6;
    }

    @Override
    public String getDescripcion() {
        return "Cebolla";
    }
    

}

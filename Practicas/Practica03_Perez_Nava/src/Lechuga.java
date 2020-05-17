
public class Lechuga extends Baguettes {

    Baguettes baguette;//Variable que guarda la baguette seleccionada

    /**
     * Constructor del ingrediente Lechuga
     * @param baguette Baguette del usuario
     */
    public Lechuga(Baguettes baguette) {
        this.baguette = baguette;
    }

    @Override
    public int costo() {
        return baguette.costo() + 5;
    }

    @Override
    public String getDescripcion() {
        return "Lechuga";
    }
   

}

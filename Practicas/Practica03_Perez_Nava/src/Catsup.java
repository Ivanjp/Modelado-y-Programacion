
public class Catsup extends Baguettes {

    Baguettes baguette;//Variable que guarda la baguette seleccionada

    /**
     * Constructor del ingrediente Catsup
     * @param baguette Baguette del usuario
     */
    public Catsup(Baguettes baguette) {
        this.baguette = baguette;
    }

    @Override
    public int costo() {
        return baguette.costo() + 8;
    }

    @Override
    public String getDescripcion() {
        return "Catsup";
    }

}

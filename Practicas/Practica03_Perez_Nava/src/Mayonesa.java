
public class Mayonesa extends Baguettes {

    Baguettes baguette;//Variable que guarda la baguette seleccionada

    /**
     * Constructor del ingrediente Mayonesa
     * @param baguette Baguette del usuario
     */
    public Mayonesa(Baguettes baguette) {
        this.baguette = baguette;
    }

    @Override
    public int costo() {
        return baguette.costo() + 7;
    }

    @Override
    public String getDescripcion() {
        return "Mayonesa";
    }
    

}

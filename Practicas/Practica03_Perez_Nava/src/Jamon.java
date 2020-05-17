
public class Jamon extends Baguettes {

    Baguettes baguette;//Variable que guarda la baguette seleccionada

    /**
     * Constructor del ingrediente Jamon
     * @param baguette Baguette del usuario
     */
    public Jamon(Baguettes baguette) {
        this.baguette = baguette;
    }

    @Override
    public int costo() {
        return baguette.costo() + 11;
    }

    @Override
    public String getDescripcion() {
        return "Jamon";
    }
  

}

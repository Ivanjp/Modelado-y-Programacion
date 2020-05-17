
public class BaguetteBlanco extends Baguettes {

    /**
     * Constructor del Baguette con pan blanco
     */
    public BaguetteBlanco() {
        descripcion = "Baguette Blanco";
        costo = 8;
    }

    @Override
    public int costo() {
        return costo;
    }


}


public class GalletaAdapter implements Producto{

    public Galletas galleta;//Objeto de tipo Galletas
    
    /**
     * Constructor del GalletaAdapetr
     * @param galleta Galleta que se quiere adaptar como dulce de Wonka3000
     */
    public GalletaAdapter(Galletas galleta) {
        this.galleta = galleta;
    }

    @Override
    public String getTipo() {
        return galleta.getProducto() + " " + galleta.getIngrediente_extra();
    }

    @Override
    public int getCantidad() {
        return galleta.getCantidad();
    }

    @Override
    public void setCantidad(int cantidad) {
        galleta.setCantidad(cantidad);
    }
    
}

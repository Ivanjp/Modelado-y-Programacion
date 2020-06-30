
public class Proxy extends Sucursal {

    private Sucursal sucursal;//Copia de la sucursal

    /**
     * Constructor del Proxy
     * @param sucursal Sucursal de la cual queremos hacer copia
     */
    public Proxy(Sucursal sucursal) {
        this.sucursal = sucursal;
        this.id = sucursal.getId();
        this.direccion = sucursal.getDireccion();
        this.rep = sucursal.getRepostero();
        this.nombre = sucursal.getNombre();
    }

    @Override
    public void agregaInventario(Lote lote) {
        this.sucursal.agregaInventario(lote);
    }

    @Override
    public void muestraInventario() {
        this.sucursal.muestraInventario();
    }

    @Override
    public Lote buscaLote(String lote) {
       return this.sucursal.buscaLote(lote);
    }

    @Override
    public void actualizaInventario(Lote l) {
     this.sucursal.actualizaInventario(l);
    }
}

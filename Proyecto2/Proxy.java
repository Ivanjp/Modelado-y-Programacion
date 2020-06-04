
public class Proxy extends Sucursal {

    private Sucursal sucursal;

    public Proxy(Sucursal sucursal) {
        this.sucursal = sucursal;
        this.id = sucursal.getId();
        this.direccion = sucursal.getDireccion();
        this.rep = sucursal.getRepostero();
    }

    @Override
    public void agregaInventario(Lote lote) {
        this.sucursal.agregaInventario(lote);
    }

    @Override
    public void muestraInventario() {
        this.sucursal.muestraInventario();
    }
}

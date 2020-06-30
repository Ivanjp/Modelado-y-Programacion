
import java.util.ArrayList;
import java.util.Iterator;

public class Suc_Copilco extends Sucursal {

    ArrayList<Lote> inventario;//ArrayList donde se guardan los lotes

    /**
     * Constructor de la sucursal
     */
    public Suc_Copilco() {
        this.id = 2;
        this.direccion = "Calle Miguel Angel Asturias";
        this.nombre = "Sucursal Copilco";
        this.rep = new Repostero("Luis Perez");
        this.inventario = new ArrayList<Lote>();
        //Se crean algunos lotes para que al iniciar la simulacion el inventario no este vacio
        Gomitas g = new Gomitas("Gusanos Acidos", 100);
        Chocolate ch = new Chocolate("Chocolate oscuro", 42);
        Galletas gall = new Galletas("Galleta con masa normal", "con sal", 0);
        GalletaAdapter galleta = new GalletaAdapter(gall);
        Lote lc1 = new Lote(g);
        Lote lc2 = new Lote(ch);
        Lote lc3 = new Lote(galleta);
        this.agregaInventario(lc1);
        this.agregaInventario(lc2);
        this.agregaInventario(lc3);
    }

    @Override
    public void muestraInventario() {
        Iterator<Lote> it = inventario.iterator();
        while (it.hasNext()) {
            Lote lt = it.next();
            System.out.println("Tipo: " + lt.getNombre() + " Cantidad en Stock: " + lt.getCantidad());
        }
    }

    @Override
    public void agregaInventario(Lote lote) {
        this.inventario.add(lote);
    }

    @Override
    public Lote buscaLote(String lote) {
        Iterator<Lote> iterator = inventario.iterator();
        Lote b = null;
        while (iterator.hasNext()) {
            Lote lt = iterator.next();

            if (lt.getNombre().equals(lote)) {
                b = lt;
            }
        }
        return b;
    }

    @Override
    public void actualizaInventario(Lote l) {
        Iterator<Lote> iterator = inventario.iterator();
        boolean b = false;
        Lote lote = null;
        while (iterator.hasNext()) {
            Lote lt = iterator.next();
            if (lt.getNombre().equalsIgnoreCase(l.getNombre())) {
                b = true;
                lote = lt;
            }
        }
        if (b == true) {
            lote.setCantidad(l.getCantidad());
        } else {
            this.agregaInventario(l);
        }
    }
}

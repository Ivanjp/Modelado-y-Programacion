
import java.util.ArrayList;
import java.util.Iterator;

public class Suc_Copilco extends Sucursal {

    ArrayList<Lote> inventario;

    public Suc_Copilco() {
        this.id = 2;
        this.direccion = "Calle Miguel Angel Asturias";
        this.rep = new Repostero("Luis Perez");
        this.inventario = new ArrayList<Lote>();
    }

    @Override
    public void muestraInventario() {
        Iterator<Lote> it = inventario.iterator();
        while (it.hasNext()) {
            Lote lt = it.next();
            System.out.println("Tipo: "+ lt.getNombre() +" Cantidad en Stock: " +lt.getCantidad());
        }
    }

    @Override
    public void agregaInventario(Lote lote) {
        this.inventario.add(lote);
    }
}

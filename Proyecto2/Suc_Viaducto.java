
import java.util.Iterator;
import java.util.LinkedList;

public class Suc_Viaducto extends Sucursal {

    LinkedList<Lote> inventario;

    public Suc_Viaducto() {
        this.id = 1;
        this.direccion = "Rio de la Piedad";
        this.rep = new Repostero("Aurora Aksnes");
        this.inventario = new LinkedList<Lote>();
    }

    @Override
    public void muestraInventario() {
        Iterator<Lote> iterator = inventario.iterator();
        while (iterator.hasNext()) {
            Lote lt = iterator.next();
            System.out.println("Tipo: "+ lt.getNombre() +" Cantidad en Stock: " +lt.getCantidad());
        }
    }

    public void agregaInventario(Lote lote) {
        this.inventario.add(lote);
    }
}

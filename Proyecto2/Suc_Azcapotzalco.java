
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class Suc_Azcapotzalco extends Sucursal {

    Hashtable<Integer, Lote> inventario;

    public Suc_Azcapotzalco() {
        this.id = 3;
        this.direccion = "Avenida Aquiles Serdan";
        this.rep = new Repostero("Paisley Archer");
        this.inventario = new Hashtable<Integer, Lote>();
    }

    @Override
    public void muestraInventario() {
        Enumeration<Lote> enumeration = inventario.elements();
        while (enumeration.hasMoreElements()) {
            Lote lt = enumeration.nextElement();
            System.out.println("Tipo: " + lt.getNombre() + " Cantidad en Stock: " + lt.getCantidad());
        }
    }

    @Override
    public void agregaInventario(Lote lote) {
        int i = inventario.size();
        inventario.put(i, lote);
    }
}

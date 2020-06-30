
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class Suc_Azcapotzalco extends Sucursal {

    Hashtable<Integer, Lote> inventario;//Hashtable donde se guardan los lotes

    /**
     * Constructor de la sucursal
     */
    public Suc_Azcapotzalco() {
        this.id = 3;
        this.direccion = "Avenida Aquiles Serdan";
        this.nombre = "Sucursal Azcapotzalco";
        this.rep = new Repostero("Lily Torres");
        this.nombre = "Sucursal Azcapotzalco";
        this.inventario = new Hashtable<Integer, Lote>();
        //Se crean algunos lotes para que al iniciar la simulacion el inventario no este vacio
        Gomitas g = new Gomitas("Frutas con Chamoy", 0);
        Chocolate ch = new Chocolate("Chocolate con leche", 130);
        Galletas gall = new Galletas("Galleta con masa con chispas", "", 31);
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

    @Override
    public Lote buscaLote(String lote) {
        Enumeration<Lote> enumeration = inventario.elements();
        Lote l = null;
        while (enumeration.hasMoreElements()) {
            Lote lt = enumeration.nextElement();
            if (lt.getNombre().equalsIgnoreCase(lote)) {
                l = lt;
            }
        }
        return l;
    }

    @Override
    public void actualizaInventario(Lote l) {
        Enumeration<Lote> enumeration = inventario.elements();
        boolean b = false;
        Lote lote = null;

        while (enumeration.hasMoreElements()) {
            Lote lt = enumeration.nextElement();
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

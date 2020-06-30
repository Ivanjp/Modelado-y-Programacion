
import java.util.Iterator;
import java.util.LinkedList;

public class Suc_Viaducto extends Sucursal {
    
    LinkedList<Lote> inventario;//Lista ligada donde se guardan los lotes
    
    /**
     * Constructor de la sucursal
     */
    public Suc_Viaducto() {
        this.id = 1;
        this.direccion = "Rio de la Piedad";
        this.rep = new Repostero("Aurora Aksnes");
        this.nombre = "Sucursal Viaducto";
        this.inventario = new LinkedList<Lote>();
        //Se crean algunos lotes para que al iniciar la simulacion el inventario no este vacio
        Gomitas g = new Gomitas("Ositos dulces", 21);
        Chocolate ch = new Chocolate("Chocolate con Almendras", 0);
        Galletas gall = new Galletas("Galleta con masa normal", "con sal", 21);
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
        Iterator<Lote> iterator = inventario.iterator();
        while (iterator.hasNext()) {
            Lote lt = iterator.next();
            System.out.println("Tipo: " + lt.getNombre() + " Cantidad en Stock: " + lt.getCantidad());
        }
    }
    
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

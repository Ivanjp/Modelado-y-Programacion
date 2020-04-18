
import java.util.ArrayList;
import java.util.List;

public class Spotify implements Cobros {
    
    ArrayList<String> rec = new ArrayList<>();
    ArrayList<Cliente> desusc = new ArrayList<>();

    @Override
    public void cobrar(List<Cliente> arr, Servicio s) {
        
        List<Cliente> copia = new ArrayList<Cliente>(arr);
        
        for (Cliente c : arr) {

            int dias = c.getDias_servS();
            String tipo = c.getTipo_suscripcion();
            int dinero = c.getDinero();
            String nombre = c.getNombre();
            int pos = copia.indexOf(c);

            if (dias == 1) {
                System.out.println(nombre + " Por ser tu primer dia el servicio de Spotify es gratis.");
            } else if (tipo == "gratis") {
                System.out.println(nombre + " paga $0 por el servicio normal de Spotify");
            } else if (tipo == "premium") {
                if (dinero >= 4) {
                    System.out.println(nombre + " paga $4 por el servicio premium de Spotify");
                    int cobro = dinero - 4;
                    arr.get(pos).setDinero(cobro);
                } else {
                    desusc.add(c);
                    
                }
            }
            
                int n_dias = dias + 1;
                arr.get(pos).setDias_servS(n_dias);
            
        }
        for(Cliente c : desusc){
            c.desuscribirse(s);
        }
    }
    
    public ArrayList getRecS(){
        rec.add("Blinding Lights - The Weeknd");
        rec.add("The Box - Roddy Ricch");
        rec.add("Dance Monkey - Tones and I");
        rec.add("Don't Start Now - Dua Lipa");
        rec.add("Falling - Trevor Daniel");
        rec.add("Stupid Love - Lady Gaga");
        rec.add("Circles - Post Malone");
        rec.add("Memories - Maroon 5");
        rec.add("After Hours - The Weeknd");
        rec.add("Physical - Dua Lipa");
        
        return rec;
    }
}

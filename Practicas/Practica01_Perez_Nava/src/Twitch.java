
import java.util.ArrayList;
import java.util.List;

public class Twitch implements Cobros {
    
    ArrayList<String> rec = new ArrayList<>();
    ArrayList<Cliente> desusc = new ArrayList<>();

    @Override
    public void cobrar(List<Cliente> arr, Servicio s) {
        
        List<Cliente> copia = new ArrayList<Cliente>(arr);
        
        for (Cliente c : arr) {

            int dias = c.getDias_servT();
            String tipo = c.getTipo_suscripcion();
            int dinero = c.getDinero();
            String nombre = c.getNombre();
            int pos = copia.indexOf(c);
           

            if (dias == 1) {
                System.out.println(nombre + " Por ser tu primer dia el servicio de Twitch es gratis.");
            } else if (tipo == "normal") {
                if (dinero >= 6) {
                    System.out.println(nombre + " paga $6 por el servicio normal de Twitch");
                    int cobro = dinero - 6;
                    arr.get(pos).setDinero(cobro);
                } else {
                    desusc.add(c); 
                    
                }
            }else if(tipo == "desc"){
                if (dinero >= 3) {
                    System.out.println(nombre + " paga $3 por el servicio con descuento de Twitch por ser suscriptor de Amazon Prime Video");
                    int cobro = dinero - 3;
                    arr.get(pos).setDinero(cobro);
                } else {
                   desusc.add(c); 
                   
            }
            }
            
                int n_dias = dias + 1;
                arr.get(pos).setDias_servT(n_dias);
            
        }
        for(Cliente c : desusc){
            c.desuscribirse(s);
        }
    }
    
    public ArrayList getRecT(){
        rec.add("elded - Fortnite");
        rec.add("DarkarCompany - Arte");
        rec.add("Bugha - Fortnite");
        rec.add("SkyshockTV - Charlando");
        rec.add("iaaras2 - Charlando");
        rec.add("loltyler1 -  League of Legends");
        rec.add("MYMTUMTUM69 - Subnautica");
        rec.add("GoddessAlfa - Mafia II");
        rec.add("Amouranth - ASMR");
        rec.add("Caprimint - League of Legends");
        
        return rec;
    }
}

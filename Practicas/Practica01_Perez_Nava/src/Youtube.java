
import java.util.ArrayList;
import java.util.List;

public class Youtube implements Cobros {
    
     ArrayList<String> rec = new ArrayList<>();
     ArrayList<Cliente> desusc = new ArrayList<>();
     

    @Override
    public void cobrar(List<Cliente> arr, Servicio s) {
        
        List<Cliente> copia = new ArrayList<Cliente>(arr);
        
        for (Cliente c : arr) {

            int dias = c.getDias_servY();
            String tipo = c.getTipo_suscripcion();
            int dinero = c.getDinero();
            String nombre = c.getNombre();
            int pos = copia.indexOf(c);
            

            if (dias == 1) {
                System.out.println(nombre + " Por ser tu primer dia el servicio de Youtube es gratis.");

            } else if (tipo == "gratis") {
                System.out.println(nombre + " paga $0 por el servicio normal de Youtube");

            } else if (tipo == "premium") {
                if (dinero >= 6) {
                    System.out.println(nombre + " paga $6 por el servicio premium de Youtube");
                    int cobro = dinero - 6;
                    arr.get(pos).setDinero(cobro);
                } else {
                    desusc.add(c);
                }
            }
            
                int n_dias = dias + 1;
                arr.get(pos).setDias_servY(n_dias);
            
        }
        for(Cliente c : desusc){
            c.desuscribirse(s);
        }
    }
    
    public ArrayList getRecY(){
        rec.add("Marvel Studios' Black Widow | Big Game Spot");
        rec.add("Nos quedamos en un hotel MUY LUJOSO | Soy Fredy");
        rec.add("ME VOY DE CASA A VIVIR SOLO MIENTRAS MI HERMANO NO ESTA - SKabeche");
        rec.add("DE YOUTUBE A HOLLYWOOD, ESTUVIMOS EN UN PROGRAMA EN VIVO | LOS POLINESIOS VLOGS");
        rec.add("¿Como es el hotel MAS BARATO de todo Nueva York? - Luisito Comunica");
        rec.add("Chelsea vs Liverpool | Key Moments | Fifth Round | Emirates FA Cup 19/20");
        rec.add("VISTO EN WALLAPOP #8 - AuronPlay");
        rec.add("Coronavirus: Revelan las 3 fases del virus que ataca a cada persona de manera diferente | Telemundo");
        rec.add("The Weeknd - After Hours (Short Film)");
        rec.add("¡BOMBAZO! filtran al nuevo Cap en accion, BATMAN y el batimovil, Loki y Enchantress - Pelicomic");
        
        return rec;
    }
}

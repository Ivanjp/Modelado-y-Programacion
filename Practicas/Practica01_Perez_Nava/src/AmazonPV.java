
import java.util.ArrayList;
import java.util.List;

public class AmazonPV implements Cobros {

    ArrayList<String> rec = new ArrayList<>();
    ArrayList<Cliente> desusc = new ArrayList<>();

    @Override
    public void cobrar(List<Cliente> arr, Servicio s) {

        List<Cliente> copia = new ArrayList<Cliente>(arr);

        for (Cliente c : arr) {

            int dias = c.getDias_servA();
            String tipo = c.getTipo_suscripcion();
            int dinero = c.getDinero();
            String nombre = c.getNombre();
            int pos = copia.indexOf(c);
           

            if (dias == 1) {
                System.out.println(nombre + " por ser tu primer dia el servicio de Amazon Prime Video es gratis.");

            } else if (tipo == "normal") {
                if (dinero >= 7) {
                    System.out.println(nombre +" paga $7 por el servicio normal de Amazon Prime Video");
                    int cobro = dinero - 7;
                    arr.get(pos).setDinero(cobro);
                } else {
                    desusc.add(c); 
                    
                }
            } else if (tipo == "premium") {

                if (dinero >= 13) {
                    System.out.println(nombre + " paga $13 por el servicio premium de Amazon Prime Video");
                    int cobro = dinero - 13;
                    arr.get(pos).setDinero(cobro);
                } else {
                   desusc.add(c); 
                    
                }
            }
            
                int n_dias = dias + 1;
                arr.get(pos).setDias_servA(n_dias);
            
        }
        for(Cliente c : desusc){
            c.desuscribirse(s);
        }
    }

    public ArrayList getRecA() {
        rec.add("Friends");
        rec.add("Avengers Endgame");
        rec.add("Logan");
        rec.add("Love Actually");
        rec.add("El Conjuro");
        rec.add("The Boys");
        rec.add("Modern Love");
        rec.add("Iron Man 2");
        rec.add("Toy Story 3");
        rec.add("Game of Thrones");

        return rec;
    }
}

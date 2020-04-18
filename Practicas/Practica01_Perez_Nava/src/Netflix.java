
import java.util.ArrayList;
import java.util.List;

public class Netflix implements Cobros {

    ArrayList<String> rec = new ArrayList<>();
    ArrayList<Cliente> desusc = new ArrayList<>();

    @Override
    public void cobrar(List<Cliente> arr, Servicio s) {

        List<Cliente> copia = new ArrayList<Cliente>(arr);

        for (Cliente c : copia) {

            int dias = c.getDias_servN();
            String tipo = c.getTipo_suscripcion();
            int dinero = c.getDinero();
            String nombre = c.getNombre();
            int pos = copia.indexOf(c);

            if (dias == 1) {
                System.out.println(nombre + " por ser tu primer dia el servicio de Netflix es gratis.");
            } else if (tipo == "1D") {
                if (dinero >= 7) {
                    System.out.println(nombre + " paga $7 por el servicio de Netflix para 1 dispositivo");
                    int cobro = dinero - 7;
                    arr.get(pos).setDinero(cobro);
                } else {
                    desusc.add(c); 
                }
            } else if (tipo == "2D") {
                if (dinero >= 10) {
                    System.out.println(nombre + " paga $10 por el servicio de Netflix para 2 dispositivos");
                    int cobro = dinero - 10;
                    arr.get(pos).setDinero(cobro);
                } else {
                    desusc.add(c);
                }
            } else if (tipo == "4D") {
                if (dinero >= 15) {
                    System.out.println(nombre + " paga $15 por el servicio de Netflix para 4 dispositivos");
                    int cobro = dinero - 15;
                    arr.get(pos).setDinero(cobro);
                } else {
                    desusc.add(c); 
                }
            }
                int n_dias = dias + 1;
                arr.get(pos).setDias_servN(n_dias); 
        }
        
        for(Cliente c : desusc){
            c.desuscribirse(s);
        }
    }

    public ArrayList getRecN() {
        rec.add("Legion");
        rec.add("Sex Education");
        rec.add("Stranger Things");
        rec.add("Daredevil");
        rec.add("Historia de un matrimonio");
        rec.add("La casa de papel");
        rec.add("Club de Cuervos");
        rec.add("The Witcher");
        rec.add("Elite");
        rec.add("Breaking Bad");

        return rec;
    }
}

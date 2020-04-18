
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Servicio implements Sujeto {

    Random rnd = new Random();
    String nombre;
    String recomendacion;
    List<Cliente> clientes = new ArrayList<Cliente>();
    List<Cliente> old_clientes = new ArrayList<Cliente>();
    ArrayList<String> recomendaciones = new ArrayList<String>();

    public void agrega(ArrayList<String> rec) {
        recomendaciones = (ArrayList) rec.clone();
    }

    public String getRec() {
        int x = rnd.nextInt(recomendaciones.size());
        return recomendaciones.get(x);
    }

    public Servicio(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    @Override
    public void registrar(Cliente c) {
        if (old_clientes.contains(c)) {
            System.out.println("Bienvenido de vuelta a " + nombre + " " + c.getNombre());
            clientes.add(c);
            
        } else {
            System.out.println("Bienvenido a " + nombre + " " + c.getNombre());
            clientes.add(c);
            old_clientes.add(c);
        }
    }

    public void remover(Cliente c) {
        System.out.println("Lamentamos que dejes " + this.nombre + " " + c.getNombre());
        if(this.nombre == "Netflix"){
            c.setDias_servN(1);
            clientes.remove(c);
        }else if(this.nombre == "Amazon Prime Video"){
            c.setDias_servA(1);
            clientes.remove(c);
        }else if(this.nombre == "Twitch"){
            c.setDias_servT(1);
            clientes.remove(c);
        }else if(this.nombre == "Spotify"){
            c.setDias_servS(1);
            clientes.remove(c);
        }else if(this.nombre == "Youtube"){
            c.setDias_servY(1);
            clientes.remove(c);
        }
    }
    
    public void removerC(Cliente c){
        clientes.remove(c);
    }

    public void cambiar(Cliente c) {
        clientes.add(c);
        old_clientes.add(c);
    }

    public boolean verificaCliente(Cliente c) {
        if (clientes.contains(c)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void notificar() {
        for (Cliente c : clientes) {
            c.update();
        }
    }
}

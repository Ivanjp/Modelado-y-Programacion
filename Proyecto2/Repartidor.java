
public class Repartidor {
    
    String rfc;
    int id;
    String nombre;

    public Repartidor(String rfc, int id, String nombre) {
        this.rfc = rfc;
        this.id = id;
        this.nombre = nombre;
    }   

    public String getRfc() {
        return rfc;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
    
    
}

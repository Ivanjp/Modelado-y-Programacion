
public class Gomitas implements Producto{

    String tipo;
    int cantidad;

    public Gomitas(String tipo, int cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }
    
    @Override
    public String tipo() {
       return tipo;
    }

    @Override
    public int cantidad() {
        return cantidad;
    }
    
}

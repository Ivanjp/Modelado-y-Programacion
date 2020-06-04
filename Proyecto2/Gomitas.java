
public class Gomitas implements Producto{

    String tipo;
    int cantidad;

    public Gomitas(String tipo, int cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }
    
    @Override
    public String getTipo() {
       return tipo;
    }

    @Override
    public int getCantidad() {
        return cantidad;
    }
    
}

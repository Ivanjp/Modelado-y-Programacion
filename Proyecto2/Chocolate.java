
public class Chocolate implements Producto{

    String tipo;
    int cantidad;

    public Chocolate(String tipo, int cantidad) {
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

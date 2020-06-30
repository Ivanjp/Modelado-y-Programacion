
public class Chocolate implements Producto{

    String tipo;//tipo de chocolate
    int cantidad;// cantidad de chocolates

    /**
     * Constructor de chocolates
     * @param tipo Tipo de chocolate
     * @param cantidad Cantidad de chocolates
     */
    public Chocolate(String tipo, int cantidad) {
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

    @Override
    public void setCantidad(int cantidad) {
         this.cantidad = cantidad;
    }
    
}


public class Gomitas implements Producto {

    String tipo;//tipo de gomita
    int cantidad;// cantidad de gomitas

    /**
     * Constructor de las gomitas
     * @param tipo Tipo de gomita
     * @param cantidad Cantidad de gomitas
     */
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

    @Override
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}

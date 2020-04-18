
public class Cliente implements Observador {

    private String nombre;
    private String tipo_suscripcion;
    private Servicio servicio;
    private int dinero;
    int dias_servN = 1;
    int dias_servA = 1;
    int dias_servT = 1;
    int dias_servS = 1;
    int dias_servY = 1;
    private String recServ;

    public Cliente(String nombre, int dinero) {
        this.nombre = nombre;
        this.dinero = dinero;
    }

    @Override
    public void update() {
        recServ = servicio.getRec();
        mostrarRec();
    }

    public String getNombre() {
        return nombre;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public int getDias_servN() {
        return dias_servN;
    }

    public int getDias_servA() {
        return dias_servA;
    }

    public int getDias_servT() {
        return dias_servT;
    }

    public int getDias_servS() {
        return dias_servS;
    }

    public int getDias_servY() {
        return dias_servY;
    }

    public void setDias_servN(int dias) {
        dias_servN = dias;
    }

    public void setDias_servA(int dias) {
        dias_servA = dias;
    }

    public void setDias_servT(int dias) {
        dias_servT = dias;
    }

    public void setDias_servS(int dias) {
        dias_servS = dias;
    }

    public void setDias_servY(int dias) {
        dias_servY = dias;
    }

    public void setDinero(int n_dinero) {
        dinero = n_dinero;
    }

    public String getTipo_suscripcion() {
        return tipo_suscripcion;
    }

    public int getDinero() {
        return dinero;
    }

    public void suscribirse(Servicio servicio, String tipo_suscripcion) {
        this.servicio = servicio;
        this.tipo_suscripcion = tipo_suscripcion;
        servicio.registrar(this);
    }

    public void desuscribirse(Servicio servicio) {
        servicio.remover(this);
    }

    public void cambiarServicio(Servicio servicio, String new_tipo) {
        servicio.removerC(this);
        this.servicio = servicio;
        this.tipo_suscripcion = new_tipo;
        servicio.cambiar(this);
    }

    private void mostrarRec() {
        System.out.println(nombre + ", " + servicio.getNombre()+ " te recomienda "+recServ+" que se encuentra en las tendencias de esta semana");
    }
}


public class Repartidor implements Observador {

    String rfc;//RFC del repartidor
    int id;//id del repartidor
    String nombre;//nombre del repartidor
    String notificacion;//mensaje de notificacion del jefe tecnico
    String camion;//camion asignado al repartidor
    Sucursal s;//Sucursal asiganda para el envio del lote

    /**
     * Constructor del repartidor
     * @param rfc RFC del repartidor
     * @param id Id del repartidor
     * @param nombre Nombre del repartidor
     */
    public Repartidor(String rfc, int id, String nombre) {
        this.rfc = rfc;
        this.id = id;
        this.nombre = nombre;
    }

    /**
     * Getter del camion
     * @return camion asignado al repartidor
     */
    public String getCamion() {
        return camion;
    }

    /**
     * Setter del camion
     * @param camion Asigna un nuevo camion
     */
    public void setCamion(String camion) {
        this.camion = camion;
    }

    /**
     * Getter de la sucursal
     * @return Sucursal asignado al repartidor
     */
    public Sucursal getSucursal() {
        return s;
    }

    /**
     * Setter de la sucursal
     * @param s Asigna una nuevoa sucursal
     */
    public void setSucursal(Sucursal s) {
        this.s = s;
    }

    /**
     * Getter de rfc
     * @return RFC del repartidor
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * Getter del ID
     * @return ID asignado al repartidor
     */
    public int getId() {
        return id;
    }

    /**
     * Getter del nombre
     * @return Nombre del repartidor
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que muestra la notificacion del Jefe tecnico
     */
    public void mostrarEstado() {
        System.out.println(nombre + ", tienes una notificacion: " + notificacion);
    }

    @Override
    public void update(JefeTecnico jf) {
        notificacion = jf.getNotificacion();
        mostrarEstado();
    }

    /**
     * Metodo que simula la entrega del lote
     * @param l Lote a entregar
     */
    public void entregaFinal(Lote l) {
        System.out.println("Llevando lote a " + s.getDireccion());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ie) {
            System.out.println("Hilo de ejecución interrumpido.");
        }
        System.out.println("Llegando a destino...");
        System.out.println("Entregando paquete...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ie) {
            System.out.println("Hilo de ejecución interrumpido.");
        }
        System.out.println("Paquete recibido en las instalaciones\n");
        s.actualizaInventario(l);
    }

}

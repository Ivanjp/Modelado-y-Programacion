
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JefeTecnico implements Sujeto {

    Wonka3000 w = new Wonka3000();//Maquina Wonka3000 que se utiliza actualmente
    Maquina mq = new Maquina(w);//Maquina de estados que se esta utilizando
    String notificacion = "Lote listo para entregar, presentense al area de recepcion";//Mensaje de notificacion para los repartidores
    List<Repartidor> repartidores = new ArrayList<>();//Lista de repartidores
    List<Sucursal> sucursales = new ArrayList<>();//Lista de sucursales
    boolean encendido = false;//bandera para saber si ya se habia realizado un pedido o no para poder manipular la maquina de estados

    /**
     * Constructor del Jefe Tecnico
     */
    public JefeTecnico() {

    }

    /**
     * Metodo que agrega una sucursal a la lista de sucursales para poder asignarla a un repartidor despues
     * @param s Sucursal para asignar
     */
    public void agregaSuc(Sucursal s) {
        sucursales.add(s);
    }

    /**
     * Getter para el mensaje de notificacion
     * @return Mensaje de notificacion
     */
    public String getNotificacion() {
        return notificacion;
    }

    /**
     * Metodo que genera el pedido de la sucursal
     * @param pedido Pedido que realizo el repostero
     * @param sucursal copia de la sucursal para acceder a su inventario
     * @param pedido_final bandera para saber si el pedido es el ultimo y poder apagar la maquina
     */
    public void procesaPedido(String pedido, Sucursal sucursal, boolean pedido_final) {
        if (encendido == false) {
            encendido = true;
            if (this.valida(pedido, sucursal) == false) {
                System.out.println("No se puede llevar a cabo la producción del dulce ya que la sucursal aún cuenta con este en su inventario\n\n");
            } else {
                System.out.println("Pedido aceptado..\n");
                w.llenadoInicial();
                mq.iniciarMaquina();
                System.out.println("Dulce: " + pedido);
                System.out.println("Sucursal que realiza el pedido: " + sucursal.getNombre() + ". \n");
                mq.reabastecer(pedido);
                mq.elegirDulce();
                mq.preparando();
                Producto p = w.getTerminado();
                mq.entregarDulce(p);
                Lote porEntregar = w.getLote();
                this.asignaPedido(porEntregar, sucursal);
            }
        } else {
            if (pedido_final == false) {
                if (this.valida(pedido, sucursal) == false) {
                    System.out.println("No se puede llevar a cabo la producción del dulce ya que la sucursal aún cuenta con este en su inventario\n\n");
                } else {
                    System.out.println("Pedido aceptado..\n");
                    System.out.println("Dulce: " + pedido);
                    System.out.println("Sucursal que realiza el pedido: " + sucursal.getNombre() + ". \n");
                    mq.reabastecer(pedido);
                    mq.elegirDulce();
                    mq.preparando();
                    Producto p = w.getTerminado();
                    mq.entregarDulce(p);
                    Lote porEntregar = w.getLote();
                    this.asignaPedido(porEntregar, sucursal);
                }
            } else {
                if (this.valida(pedido, sucursal) == false) {
                    System.out.println("No se puede llevar a cabo la producción del dulce ya que la sucursal aún cuenta con este en su inventario\n\n");
                } else {
                    System.out.println("Pedido aceptado..\n");
                    System.out.println("Dulce: " + pedido);
                    System.out.println("Sucursal que realiza el pedido: " + sucursal.getNombre() + ". \n");
                    mq.reabastecer(pedido);
                    mq.elegirDulce();
                    mq.preparando();
                    Producto p = w.getTerminado();
                    mq.entregarDulce(p);
                    mq.terminar();
                    Lote porEntregar = w.getLote();
                    this.asignaPedido(porEntregar, sucursal);
                }
            }
        }
    }

    /**
     * Metodo que valida un pedido
     * @param pedido Pedido a validar
     * @param suc Sucursal para ver la copia de su inventario
     * @return boolean que representa si el pedido ya estaba en la sucursal o ya no
     */
    public boolean valida(String pedido, Sucursal suc) {
        System.out.println("Validando Pedido..\n");
        Lote l = suc.buscaLote(pedido);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException ie) {
            System.out.println("Hilo de ejecución interrumpido.");
        }
        if (l == null || l.getCantidad() == 0) {
            return true;
        }
        return false;

    }

    @Override
    public void notificar() {
        repartidores = w.getRepartidores();
        for (Repartidor s : repartidores) {
            s.update(this);
        }
    }

    /**
     * Metodo que asigna un pedido a un repartidor
     * @param l Lote que se va a asignar
     * @param sucursal Sucursal que se va a asiganr al repartidor
     */
    public void asignaPedido(Lote l, Sucursal sucursal) {
        this.notificar();
        System.out.println("\n");
        Random r = new Random();
        int azar = r.nextInt(repartidores.size());
        int camion = r.nextInt(15) + 1;
        Repartidor asignado = repartidores.get(azar);
        asignado.setCamion("Camion " + camion);
        for (int i = 0; i < sucursales.size(); i++) {
            if (sucursales.get(i).getId() == sucursal.getId()) {
                Sucursal destino = sucursales.get(i);
                asignado.setSucursal(destino);
                System.out.println("Reporte de salida: \n");
                System.out.println("Repartidor: " + asignado.getNombre());
                System.out.println("Camion: " + asignado.getCamion());
                System.out.println("Pedido: " + l.getNombre());
                System.out.println("Direccion: " + asignado.getSucursal().getDireccion());
                System.out.println("Sucursal del pedido: " + asignado.getSucursal().getNombre() + "\n");
                asignado.entregaFinal(l);
            }
        }

    }
}

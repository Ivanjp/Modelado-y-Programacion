
import java.util.List;

public class JefeTecnico implements Sujeto {

    Wonka3000 w = new Wonka3000();

    public JefeTecnico() {
    }

    public void procesaPedido(String pedido, Sucursal sucursal) {
        if (this.valida(pedido,sucursal) == false) {
            System.out.println("No se puede llevar a cabo la producción del dulce ya que la sucursal aún cuenta con este en su inventario");
        } else {
            w.llenadoInicial();
            Maquina mq = new Maquina(w);
            mq.iniciarMaquina();
            mq.elegirDulce();
            mq.preparando();
        }
    }

    public boolean valida(String pedido,Sucursal suc) {
        
        /*if(){
           return false; 
        }else{
            return false;
        }*/
        return false;
    }

    @Override
    public void notificar() {
        List repartidores = w.getRepartidores();

        /*for (Repartidor s : repartidores) {
            s.update();
        }*/
    }
}

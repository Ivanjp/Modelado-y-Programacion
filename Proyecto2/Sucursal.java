
import java.util.ArrayList;

public abstract class Sucursal{

  int id;
  String direccion;
  Repostero rep;

  public int getId(){
    return this.id;
  }

  public String getDireccion(){
    return this.direccion;
  }

  public Repostero getRepostero(){
    return this.rep;
  }
  
  public void hacerPedido(String pedido){
    this.rep.realizaPedido(pedido, this);
  }

  public abstract void muestraInventario();

  public abstract void agregaInventario(Lote lote);
}


    
public class PreparandoDulce implements EstadoMaquina {

    Maquina maquina;

    public PreparandoDulce(Maquina nuevoMaquina) {
        maquina = nuevoMaquina;
    }

    @Override
    public void reabastecer() {
        System.out.println("No se puede realizar esta accion hasta terminar este lote");
    }

    @Override
    public void elegirDulce() {
         System.out.println("No se puede realizar esta accion");
    }

    @Override
    public void entregarDulce() {
       System.out.println("No se puede realizar esta accion");
    }

    @Override
    public void terminar() {
        System.out.println("No se puede realizar esta accion");
    }

    @Override
    public void iniciar() {
        System.out.println("La maquina ya esta encendida");
    }

    @Override
    public void preparando() {
        Wonka3000 w = maquina.getmaqActual();
        String dulce = maquina.getDulce();
        
        System.out.println("Empezando el proceso de preparacion para "+dulce);
        
        if(dulce.equalsIgnoreCase("Ositos dulces")){
            w.preparaDulce("dulces");
        }else if(dulce.equalsIgnoreCase("Gusanos Acidos")){
            w.preparaDulce("acidos");
        }else if(dulce.equalsIgnoreCase("Frutas con Chamoy")){
            w.preparaDulce("chamoy");
        }else if(dulce.equalsIgnoreCase("Chocolate con leche")){
            w.preparaDulce("leche");
        }else if(dulce.equalsIgnoreCase("Chocolate oscuro")){
            w.preparaDulce("oscuro");
        }else if(dulce.equalsIgnoreCase("Chocolate con Almendras")){
            w.preparaDulce("almendras");
        }else if(dulce.equalsIgnoreCase("Galletas rellenas de mermelada")){
            w.preparaDulce("dulces");
        }else if(dulce.equalsIgnoreCase("Galletas con chispas")){
            w.preparaDulce("dulces");
        }else if(dulce.equalsIgnoreCase("Galletas saladas")){
            w.preparaDulce("dulces");
        }
        
         System.out.println("Proceso terminado");
         maquina.asignarEstadoMaquina(maquina.getEstadoEmpacando());
         
         maquina.setP(w.getTerminado());
    }

}

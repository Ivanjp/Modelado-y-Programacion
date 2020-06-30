/*
 * Clase que simula el estado Preparando dulce de la maquina
 */  
public class PreparandoDulce implements EstadoMaquina {

    Maquina maquina;//Maquina que estamos ocupando

    /**
     * Constructor de la clase
     * @param nuevoMaquina Maquina que hemos iniciado
     */
    public PreparandoDulce(Maquina nuevoMaquina) {
        maquina = nuevoMaquina;
    }

    @Override
    public void reabastecer(String dulce) {
        System.out.println("No se puede realizar esta accion hasta terminar este lote");
    }

    @Override
    public void elegirDulce() {
         System.out.println("No se puede realizar esta accion");
    }

    @Override
    public void entregarDulce(Producto p) {
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
        Galleneitor5000 g = new Galleneitor5000();
        String dulce = maquina.getDulce();
        
        System.out.println("Empezando el proceso de preparacion para "+dulce+"\n");
        
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
            g.hacerGalletas("mermelada",w);
        }else if(dulce.equalsIgnoreCase("Galletas con chispas")){
            g.hacerGalletas("chispas",w);
        }else if(dulce.equalsIgnoreCase("Galletas saladas")){
            g.hacerGalletas("saladas",w);
        }
        
         System.out.println("Proceso terminado \n");
         maquina.asignarEstadoMaquina(maquina.getEstadoEmpacando());
         
         
    }

}

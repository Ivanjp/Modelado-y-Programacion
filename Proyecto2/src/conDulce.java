
public class conDulce extends RecetasWonka {

    Wonka3000 w;//Mquina Wonka3000 que se esta usando

    /**
     * Constructor de este tipo de dulce
     * @param w Maquina Wonka3000 que se esta utilizando
     */
    public conDulce(Wonka3000 w) {
        this.w = w;
    }
    
    
    @Override
    void ingreExtra() {
        System.out.println("Agregando azucar");
        w.restaIngredientes("azucar", 2000);
    }

    @Override
    void agregaIngredientes() {
        w.restaIngredientes("grenetina", 640);
        w.restaIngredientes("agua", 2000);
        w.restaIngredientes("miel", 500);
    }
    
    @Override
    void finalizando() {
        System.out.println("Finalizando proceso de preparación \n");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ie) {
            System.out.println("Hilo de ejecución interrumpido.");
        }
        Gomitas g = new Gomitas("Ositos dulces",100);
        w.Prod_term(g);
    }

}

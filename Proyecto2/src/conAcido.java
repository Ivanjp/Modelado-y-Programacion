
public class conAcido extends RecetasWonka {

    Wonka3000 w;//Mquina Wonka3000 que se esta usando

    /**
     * Constructor de este tipo de dulce
     * @param w Maquina Wonka3000 que se esta utilizando
     */
    public conAcido(Wonka3000 w) {
        this.w = w;
    }

    @Override
    void ingreExtra() {
        System.out.println("Agregando saborizante acido");
        w.restaIngredientes("saborizante", 200);
    }

    @Override
    void agregaIngredientes() {
        w.restaIngredientes("grenetina", 640);
        w.restaIngredientes("agua", 2000);
        w.restaIngredientes("miel", 500);
        w.restaIngredientes("azucar", 1000);
    }

    @Override
    void finalizando() {
        System.out.println("Finalizando proceso de preparación \n");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ie) {
            System.out.println("Hilo de ejecución interrumpido.");
        }
        Gomitas g = new Gomitas("Gusanos acidos", 100);
        w.Prod_term(g);
    }

}

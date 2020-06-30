
public class conLeche extends RecetasWonka {

    Wonka3000 w;//Mquina Wonka3000 que se esta usando

    /**
     * Constructor de este tipo de dulce
     * @param w Maquina Wonka3000 que se esta utilizando
     */
    public conLeche(Wonka3000 w) {
        this.w = w;
    }

    @Override
    void ingreExtra() {
        System.out.println("Agregando Leche");
        w.restaIngredientes("leche", 200);
    }

    @Override
    void agregaIngredientes() {
        w.restaIngredientes("manteca", 300);
        w.restaIngredientes("cacao", 400);
        w.restaIngredientes("azucar", 500);
    }

    @Override
    void finalizando() {
       System.out.println("Finalizando proceso de preparación \n");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ie) {
            System.out.println("Hilo de ejecución interrumpido.");
        }
        Chocolate ch = new Chocolate("Chocolate con leche", 50);
        w.Prod_term(ch);
    }
}

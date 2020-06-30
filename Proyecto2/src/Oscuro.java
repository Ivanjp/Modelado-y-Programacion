
public class Oscuro extends RecetasWonka {

    Wonka3000 w; //Mquina Wonka3000 que se esta usando

    /**
     * Constructor de este tipo de dulce
     * @param w Maquina Wonka3000 que se esta utilizando
     */
    public Oscuro(Wonka3000 w) {
        this.w = w;
    }

    @Override
    void ingreExtra() {
        System.out.println("Agregando cacao extra");
        w.restaIngredientes("cacao", 750);
    }

    @Override
    void agregaIngredientes() {
        w.restaIngredientes("manteca", 250);
        w.restaIngredientes("azucar", 200);
    }

    @Override
    void finalizando() {
        System.out.println("Finalizando proceso de preparación \n");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ie) {
            System.out.println("Hilo de ejecución interrumpido.");
        }
        Chocolate ch = new Chocolate("Chocolate oscuro", 50);
        w.Prod_term(ch);
    }
}

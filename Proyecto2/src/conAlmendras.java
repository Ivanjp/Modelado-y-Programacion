
public class conAlmendras extends RecetasWonka {

    Wonka3000 w;//Mquina Wonka3000 que se esta usando

    /**
     * Constructor de este tipo de dulce
     * @param w Maquina Wonka3000 que se esta utilizando
     */
    public conAlmendras(Wonka3000 w) {
        this.w = w;
    }

    @Override
    void ingreExtra() {
        System.out.println("Agregando Almendras");
        w.restaIngredientes("almendras", 150);
    }

    @Override
    void agregaIngredientes() {
        w.restaIngredientes("manteca", 300);
        w.restaIngredientes("cacao", 400);
        w.restaIngredientes("azucar", 500);
        w.restaIngredientes("leche", 100);
    }
    
    @Override
    void finalizando() {
        System.out.println("Finalizando proceso de preparación \n");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ie) {
            System.out.println("Hilo de ejecución interrumpido.");
        }
        Chocolate ch = new Chocolate("Chocolate con almendras",50);
        w.Prod_term(ch);
    }
}


public class Oscuro extends RecetasWonka {

    Wonka3000 w;

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
        System.out.println("Finalizando proceso de preparación");
        Chocolate ch = new Chocolate("Chocolate oscuro", 50);
        w.Prod_term(ch);
    }
}


public class conLeche extends RecetasWonka {

    Wonka3000 w;

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
        System.out.println("Finalizando proceso de preparación");
        Chocolate ch = new Chocolate("Chocolate con leche", 50);
        w.empaqueta(ch);
    }
}

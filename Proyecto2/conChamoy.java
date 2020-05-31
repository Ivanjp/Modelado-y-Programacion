
public class conChamoy extends RecetasWonka {

    Wonka3000 w;

    public conChamoy(Wonka3000 w) {
        this.w = w;
    }

    @Override
    void ingreExtra() {
        System.out.println("Agregando chamoy");
        w.restaIngredientes("chamoy", 300);
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
        System.out.println("Finalizando proceso de preparación");
        Gomitas g = new Gomitas("Frutas con chamoy", 100);
        w.empaqueta(g);
    }
}


public class conAlmendras extends RecetasWonka {

    Wonka3000 w;

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
        System.out.println("Finalizando proceso de preparación");
        Chocolate ch = new Chocolate("Chocolate con almendras",50);
        w.Prod_term(ch);
    }
}


public class PizzaPollo1 extends Pizza{
    
     @Override
    public String getQueso() {
        return "Queso Cheddar";
    }

    @Override
    public String getMasa() {
        return "Masa Delgada";
    }

    @Override
    public String getCarne() {
        return "Pollo";
    }

    @Override
    public int getCosto() {
        return 100;
    }
}

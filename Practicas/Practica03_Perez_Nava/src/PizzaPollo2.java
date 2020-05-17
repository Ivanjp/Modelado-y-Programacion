
public class PizzaPollo2 extends Pizza{
    
     @Override
    public String getQueso() {
        return "Queso Manchego";
    }

    @Override
    public String getMasa() {
        return "Masa Gruesa";
    }

    @Override
    public String getCarne() {
        return "Pollo";
    }

    @Override
    public int getCosto() {
        return 125;
    }
}

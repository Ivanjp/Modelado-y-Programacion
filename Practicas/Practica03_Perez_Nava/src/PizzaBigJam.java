
public class PizzaBigJam extends Pizza {
    
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
        return "Jamon";
    }

    @Override
    public int getCosto() {
        return 115;
    }
}

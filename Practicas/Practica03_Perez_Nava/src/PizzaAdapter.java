public class PizzaAdapter extends Baguettes {

    Pizza pizza;//Variable que guarda la pizza seleccionada

    /**
     * Constructor de la pizza
     * @param pizza
     */
    public PizzaAdapter(Pizza pizza) {
        descripcion = pizza.getMasa()+", "+pizza.getCarne()+", "+pizza.getQueso();
        costo = pizza.getCosto();
    }

    @Override
    public int costo() {
        return costo;
    }

}
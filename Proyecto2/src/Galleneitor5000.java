
public class Galleneitor5000 {

    RecetasGalleneitor rg = new RecetasGalleneitor();// Se crea un objeto de tipo RecetasGalleneitor

    /**
     * Constructor de la maquina Galleneitor5000
     */
    public Galleneitor5000() {
    }

    /**
     * Metodo para producir las galletas
     * @param pedido Pedido que quiere producir
     * @param w Maquina Wonka3000 para poder disminuir los ingredientes
     */
    public void hacerGalletas(String pedido, Wonka3000 w) {

        Producto galleta = null;
        if (pedido.equalsIgnoreCase("mermelada")) {
            galleta = rg.produceMermelada(w);
        } else if (pedido.equalsIgnoreCase("chispas")) {
            galleta = rg.produceChispas(w);
        } else if (pedido.equalsIgnoreCase("saladas")) {
            galleta = rg.produceSaladas(w);
        }

        w.Prod_term(galleta);
    }
}

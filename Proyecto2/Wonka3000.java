
import java.util.ArrayList;
import java.util.List;

public class Wonka3000 {

    ArrayList<Ingrediente> inv = new ArrayList<>();
    List<Repartidor> repartidores = new ArrayList<>();
    List<Sucursal> sucursales = new ArrayList<>();
    Producto terminado;//Producto terminado

    Ingrediente a1 = new Ingrediente("almendra", 1000);
    Ingrediente a2 = new Ingrediente("cacao", 3000);
    Ingrediente a3 = new Ingrediente("leche", 2000);
    Ingrediente a4 = new Ingrediente("manteca", 2000);
    Ingrediente a5 = new Ingrediente("grenetina", 4000);
    Ingrediente a6 = new Ingrediente("agua", 4000);
    Ingrediente a7 = new Ingrediente("miel", 4000);
    Ingrediente a8 = new Ingrediente("azucar", 3000);
    Ingrediente a9 = new Ingrediente("saborizante", 1500);
    Ingrediente a10 = new Ingrediente("chamoy", 1500);
    Ingrediente a11 = new Ingrediente("harina", 1000);
    Ingrediente a12 = new Ingrediente("huevo", 1000);
    Ingrediente a14 = new Ingrediente("sal", 1000);
    Ingrediente a15 = new Ingrediente("chispas", 1000);
    Ingrediente a16 = new Ingrediente("mermelada", 1000);
    Sucursal viaducto = new Suc_Viaducto();
    Sucursal copilco = new Suc_Copilco();
    Sucursal azc = new Suc_Azcapotzalco();
    Repartidor r1 = new Repartidor("AHJ1910",1,"Miguel Torres");
    Repartidor r2 = new Repartidor("MRZ2208",2,"Monica Rodriguez");
    Repartidor r3 = new Repartidor("MPT0310",3,"Tere Maturano");
    Repartidor r4 = new Repartidor("FMC2672",4,"Francisco Contreras");
    Repartidor r5 = new Repartidor("EOQ2412",5,"Elizabeth Rojas");
    Repartidor r6 = new Repartidor("JPP1078",6,"Jorge Perez");
    Repartidor r7 = new Repartidor("RPF7621",7,"Raul Franco");

    public Wonka3000() {
    }

    public void llenadoInicial() {
        inv.add(a1);
        inv.add(a2);
        inv.add(a3);
        inv.add(a4);
        inv.add(a5);
        inv.add(a6);
        inv.add(a7);
        inv.add(a8);
        inv.add(a9);
        inv.add(a10);
        inv.add(a11);
        inv.add(a12);
        inv.add(a14);
        inv.add(a15);
        inv.add(a16);
        sucursales.add(azc);
        sucursales.add(viaducto);
        sucursales.add(copilco);
        repartidores.add(r1);
        repartidores.add(r2);
        repartidores.add(r3);
        repartidores.add(r4);
        repartidores.add(r5);
        repartidores.add(r6);
        repartidores.add(r7);
    }

    public void preparaDulce(String tipo) {

        if (tipo.equalsIgnoreCase("dulces")) {

            RecetasWonka cd = new conDulce(this);

            cd.rutinaDiaria();

        } else if (tipo.equalsIgnoreCase("acidos")) {

            RecetasWonka ac = new conAcido(this);

            ac.rutinaDiaria();

        } else if (tipo.equalsIgnoreCase("chamoy")) {

            RecetasWonka ch = new conChamoy(this);

            ch.rutinaDiaria();

        } else if (tipo.equalsIgnoreCase("leche")) {

            RecetasWonka lh = new conLeche(this);
            lh.rutinaDiaria();

        } else if (tipo.equalsIgnoreCase("oscuro")) {

            RecetasWonka os = new Oscuro(this);

            os.rutinaDiaria();

        } else if (tipo.equalsIgnoreCase("almendras")) {

            RecetasWonka al = new conAlmendras(this);

            al.rutinaDiaria();

        }
    }

    public void Prod_term(Producto p) {
        terminado = p;
    }

    public Producto getTerminado() {
        return terminado;
    }

    public List<Repartidor> getRepartidores() {
        return repartidores;
    }

    public void empaqueta(Producto p) {
        for (int i = 0; i < inv.size(); i++) {

        }
    }

    public void restaIngredientes(String ing, int cant) {
        for (int i = 0; i < inv.size(); i++) {
            if (inv.get(i).getNombre().equalsIgnoreCase(ing)) {
                int total = inv.get(i).getCantidad() - cant;
                inv.get(i).setCantidad(total);
            }
        }
    }

    public void verificaIngredientes(String tipo) {
        if (tipo.equalsIgnoreCase("almendra")) {

        }
    }
}

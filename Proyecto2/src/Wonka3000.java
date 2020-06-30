
import java.util.ArrayList;
import java.util.List;

public class Wonka3000 {

    ArrayList<Ingrediente> inv = new ArrayList<>();//Ingredientes que tiene la maquina
    List<Repartidor> repartidores = new ArrayList<>();//Lista que guarda los repartidores
    Producto terminado;//Producto terminado
    Lote l; //Lote a empaquetar

    //Ingredientes y repartidores 
    Ingrediente a1 = new Ingrediente("almendra", 1000);
    Ingrediente a2 = new Ingrediente("cacao", 3000);
    Ingrediente a3 = new Ingrediente("leche", 50);
    Ingrediente a4 = new Ingrediente("manteca", 2000);
    Ingrediente a5 = new Ingrediente("grenetina", 4000);
    Ingrediente a6 = new Ingrediente("agua", 4000);
    Ingrediente a7 = new Ingrediente("miel", 4000);
    Ingrediente a8 = new Ingrediente("azucar", 3000);
    Ingrediente a9 = new Ingrediente("saborizante", 1500);
    Ingrediente a10 = new Ingrediente("chamoy", 800);
    Ingrediente a11 = new Ingrediente("harina", 1000);
    Ingrediente a12 = new Ingrediente("huevo", 200);
    Ingrediente a14 = new Ingrediente("sal", 400);
    Ingrediente a15 = new Ingrediente("chispas", 1000);
    Ingrediente a16 = new Ingrediente("mermelada", 1000);
    Repartidor r1 = new Repartidor("AHJ1910", 1, "Miguel Torres");
    Repartidor r2 = new Repartidor("MRZ2208", 2, "Monica Rodriguez");
    Repartidor r3 = new Repartidor("MPT0310", 3, "Tere Maturano");
    Repartidor r4 = new Repartidor("FMC2672", 4, "Francisco Contreras");
    Repartidor r5 = new Repartidor("EOQ2412", 5, "Elizabeth Rojas");
    Repartidor r6 = new Repartidor("JPP1078", 6, "Jorge Perez");
    Repartidor r7 = new Repartidor("RPF7621", 7, "Raul Franco");

    /**
     *Constructor de Wonka3000
     */
    public Wonka3000() {
    }

    /**
     * Metodo que llena los arreglos de los ingrediente y de los repartidores
     */
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
        repartidores.add(r1);
        repartidores.add(r2);
        repartidores.add(r3);
        repartidores.add(r4);
        repartidores.add(r5);
        repartidores.add(r6);
        repartidores.add(r7);
    }

    /**
     * Metodo que prepara los dulces
     * @param tipo Tipo de dulce a producir
     */
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

    /**
     * Metodo que guarda el producto terminado
     * @param p Producto terminado
     */
    public void Prod_term(Producto p) {
        terminado = p;
    }

    /**
     * Getter del producto terminado
     * @return regresa el producto terminado
     */
    public Producto getTerminado() {
        return terminado;
    }

    /**
     * Getter de la lista de repartidores
     * @return regresa la lista de repartidores
     */
    public List<Repartidor> getRepartidores() {
        return repartidores;
    }

    /**
     * Getter del lote terminado
     * @return Regresa el lote
     */
    public Lote getLote() {
        return l;
    }

    /**
     * Metodo que hace el empaquetado del producto
     * @param p Producto a empacar
     */
    public void empaqueta(Producto p) {
        System.out.println("Recogiendo el producto terminado..");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ie) {
            System.out.println("Hilo de ejecución interrumpido.");
        }
        System.out.println("Metiendo " + p.getTipo() + " a la caja");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ie) {
            System.out.println("Hilo de ejecución interrumpido.");
        }
        System.out.println("Sellando. " + p.getTipo() + " Dulces Rosa SA de CV.");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ie) {
            System.out.println("Hilo de ejecución interrumpido.");
        }
        System.out.println("Producto empaquetado, el lote esta listo para su entrega.\n");
        Lote nuevo = new Lote(p);
        l = nuevo;
    }

    /**
     * Metodo que resta los ingredientes despues de fabricar el dulce
     * @param ing Ingrediente a reducir su numero
     * @param cant cantidad a reducir
     */
    public void restaIngredientes(String ing, int cant) {
        for (int i = 0; i < inv.size(); i++) {
            if (inv.get(i).getNombre().equalsIgnoreCase(ing)) {
                int total = inv.get(i).getCantidad() - cant;
                inv.get(i).setCantidad(total);
            }
        }
    }

    /**
     * Metodo que verifica si hay ingredientes para la produccion
     * @param tipo tipo de dulce
     */
    public void verificaIngredientes(String tipo) {

        if (tipo.equalsIgnoreCase("Ositos dulces")) {
            if (inv.get(7).getCantidad() < 2000 || inv.get(4).getCantidad() < 640 || inv.get(5).getCantidad() < 2000 || inv.get(6).getCantidad() < 500) {
                System.out.println("No cuento con ingredientes suficientes para " + tipo + " procedere a recargarme..");
                if (inv.get(7).getCantidad() < 2000) {
                    int cn = inv.get(7).getCantidad();
                    inv.get(7).setCantidad(cn + 2000);
                }
                if (inv.get(4).getCantidad() < 640) {
                    int cn = inv.get(4).getCantidad();
                    inv.get(4).setCantidad(cn + 1500);
                }
                if (inv.get(5).getCantidad() < 2000) {
                    int cn = inv.get(5).getCantidad();
                    inv.get(5).setCantidad(cn + 2000);
                }
                if (inv.get(6).getCantidad() < 500) {
                    int cn = inv.get(6).getCantidad();
                    inv.get(6).setCantidad(cn + 2000);
                }
                System.out.println("Reabasteciendo....");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ie) {
                    System.out.println("Hilo de ejecución interrumpido.");
                }
                System.out.println("Maquina Reabastecida.\n");
            }
        } else if (tipo.equalsIgnoreCase("Gusanos Acidos")) {
            if (inv.get(8).getCantidad() < 200 || inv.get(4).getCantidad() < 640 || inv.get(5).getCantidad() < 2000 || inv.get(6).getCantidad() < 500 || inv.get(7).getCantidad() < 1000) {
                System.out.println("No cuento con ingredientes suficientes para " + tipo + " procedere a recargarme..");
                if (inv.get(8).getCantidad() < 200) {
                    int cn = inv.get(8).getCantidad();
                    inv.get(8).setCantidad(cn + 500);
                }
                if (inv.get(4).getCantidad() < 640) {
                    int cn = inv.get(4).getCantidad();
                    inv.get(4).setCantidad(cn + 1500);
                }
                if (inv.get(5).getCantidad() < 2000) {
                    int cn = inv.get(5).getCantidad();
                    inv.get(5).setCantidad(cn + 2000);
                }
                if (inv.get(6).getCantidad() < 500) {
                    int cn = inv.get(6).getCantidad();
                    inv.get(6).setCantidad(cn + 2000);
                }
                if (inv.get(7).getCantidad() < 1000) {
                    int cn = inv.get(7).getCantidad();
                    inv.get(7).setCantidad(cn + 2000);
                }
                System.out.println("Reabasteciendo....");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ie) {
                    System.out.println("Hilo de ejecución interrumpido.");
                }
                System.out.println("Maquina Reabastecida.\n");
            }
        } else if (tipo.equalsIgnoreCase("Frutas con chamoy")) {
            if (inv.get(9).getCantidad() < 300 || inv.get(4).getCantidad() < 640 || inv.get(5).getCantidad() < 2000 || inv.get(6).getCantidad() < 500 || inv.get(7).getCantidad() < 1000) {
                System.out.println("No cuento con ingredientes suficientes para " + tipo + " procedere a recargarme..");
                if (inv.get(9).getCantidad() < 300) {
                    int cn = inv.get(9).getCantidad();
                    inv.get(9).setCantidad(cn + 1000);
                }
                if (inv.get(4).getCantidad() < 640) {
                    int cn = inv.get(4).getCantidad();
                    inv.get(4).setCantidad(cn + 1500);
                }
                if (inv.get(5).getCantidad() < 2000) {
                    int cn = inv.get(5).getCantidad();
                    inv.get(5).setCantidad(cn + 2000);
                }
                if (inv.get(6).getCantidad() < 500) {
                    int cn = inv.get(6).getCantidad();
                    inv.get(6).setCantidad(cn + 2000);
                }
                if (inv.get(7).getCantidad() < 1000) {
                    int cn = inv.get(7).getCantidad();
                    inv.get(7).setCantidad(cn + 2000);
                }
                System.out.println("Reabasteciendo....");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ie) {
                    System.out.println("Hilo de ejecución interrumpido.");
                }
                System.out.println("Maquina Reabastecida.\n");
            }
        } else if (tipo.equalsIgnoreCase("Chocolate con almendras")) {
            if (inv.get(0).getCantidad() < 150 || inv.get(3).getCantidad() < 400 || inv.get(7).getCantidad() < 500 || inv.get(2).getCantidad() < 100) {
                System.out.println("No cuento con ingredientes suficientes para " + tipo + " procedere a recargarme..");
                if (inv.get(0).getCantidad() < 150) {
                    int cn = inv.get(0).getCantidad();
                    inv.get(0).setCantidad(cn + 800);
                }
                if (inv.get(3).getCantidad() < 400) {
                    int cn = inv.get(3).getCantidad();
                    inv.get(3).setCantidad(cn + 1000);
                }
                if (inv.get(7).getCantidad() < 500) {
                    int cn = inv.get(7).getCantidad();
                    inv.get(7).setCantidad(cn + 1500);
                }
                if (inv.get(2).getCantidad() < 100) {
                    int cn = inv.get(2).getCantidad();
                    inv.get(2).setCantidad(cn + 600);
                }
                System.out.println("Reabasteciendo....");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ie) {
                    System.out.println("Hilo de ejecución interrumpido.");
                }
                System.out.println("Maquina Reabastecida.\n");
            }
        } else if (tipo.equalsIgnoreCase("Chocolate Oscuro")) {
            if (inv.get(1).getCantidad() < 750 || inv.get(3).getCantidad() < 250 || inv.get(7).getCantidad() < 200) {
                System.out.println("No cuento con ingredientes suficientes para " + tipo + " procedere a recargarme..");
                if (inv.get(1).getCantidad() < 750) {
                    int cn = inv.get(1).getCantidad();
                    inv.get(1).setCantidad(cn + 1500);
                }
                if (inv.get(3).getCantidad() < 250) {
                    int cn = inv.get(3).getCantidad();
                    inv.get(3).setCantidad(cn + 1000);
                }
                if (inv.get(7).getCantidad() < 200) {
                    int cn = inv.get(7).getCantidad();
                    inv.get(7).setCantidad(cn + 1000);
                }
                System.out.println("Reabasteciendo....");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ie) {
                    System.out.println("Hilo de ejecución interrumpido.");
                }
                System.out.println("Maquina Reabastecida.\n");
            }
        } else if (tipo.equalsIgnoreCase("Chocolate con leche")) {
            if (inv.get(2).getCantidad() < 200 || inv.get(3).getCantidad() < 300 || inv.get(7).getCantidad() < 500 || inv.get(1).getCantidad() < 400) {
                System.out.println("No cuento con ingredientes suficientes para " + tipo + " procedere a recargarme..");
                if (inv.get(2).getCantidad() < 200) {
                    int cn = inv.get(2).getCantidad();
                    inv.get(2).setCantidad(cn + 1000);
                }
                if (inv.get(3).getCantidad() < 300) {
                    int cn = inv.get(3).getCantidad();
                    inv.get(3).setCantidad(cn + 1000);
                }
                if (inv.get(7).getCantidad() < 500) {
                    int cn = inv.get(7).getCantidad();
                    inv.get(7).setCantidad(cn + 1500);
                }
                if (inv.get(1).getCantidad() < 400) {
                    int cn = inv.get(1).getCantidad();
                    inv.get(1).setCantidad(cn + 1000);
                }
                System.out.println("Reabasteciendo....");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ie) {
                    System.out.println("Hilo de ejecución interrumpido.");
                }
                System.out.println("Maquina Reabastecida.\n");
            }
        } else if (tipo.equalsIgnoreCase("Galletas con mermelada")) {
            if (inv.get(10).getCantidad() < 125 || inv.get(11).getCantidad() < 75 || inv.get(2).getCantidad() < 250 || inv.get(14).getCantidad() < 200) {
                System.out.println("No cuento con ingredientes suficientes para " + tipo + " procedere a recargarme..");
                if (inv.get(10).getCantidad() < 125) {
                    int cn = inv.get(10).getCantidad();
                    inv.get(10).setCantidad(cn + 1000);
                }
                if (inv.get(11).getCantidad() < 75) {
                    int cn = inv.get(11).getCantidad();
                    inv.get(11).setCantidad(cn + 400);
                }
                if (inv.get(2).getCantidad() < 250) {
                    int cn = inv.get(2).getCantidad();
                    inv.get(2).setCantidad(cn + 1500);
                }
                if (inv.get(14).getCantidad() < 200) {
                    int cn = inv.get(14).getCantidad();
                    inv.get(14).setCantidad(cn + 1000);
                }
                System.out.println("Reabasteciendo....");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ie) {
                    System.out.println("Hilo de ejecución interrumpido.");
                }
                System.out.println("Maquina Reabastecida.\n");
            }

        } else if (tipo.equalsIgnoreCase("Galletas saladas")) {
            if (inv.get(10).getCantidad() < 125 || inv.get(11).getCantidad() < 75 || inv.get(2).getCantidad() < 250 || inv.get(12).getCantidad() < 50) {
                System.out.println("No cuento con ingredientes suficientes para " + tipo + " procedere a recargarme..");
                if (inv.get(10).getCantidad() < 125) {
                    int cn = inv.get(10).getCantidad();
                    inv.get(10).setCantidad(cn + 1000);
                }
                if (inv.get(11).getCantidad() < 75) {
                    int cn = inv.get(11).getCantidad();
                    inv.get(11).setCantidad(cn + 400);
                }
                if (inv.get(2).getCantidad() < 250) {
                    int cn = inv.get(2).getCantidad();
                    inv.get(2).setCantidad(cn + 1500);
                }
                if (inv.get(12).getCantidad() < 50) {
                    int cn = inv.get(14).getCantidad();
                    inv.get(12).setCantidad(cn + 400);
                }
                System.out.println("Reabasteciendo....");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ie) {
                    System.out.println("Hilo de ejecución interrumpido.");
                }
                System.out.println("Maquina Reabastecida.\n");
            }
        } else if (tipo.equalsIgnoreCase("Galletas con chispas")) {
            if (inv.get(10).getCantidad() < 125 || inv.get(11).getCantidad() < 75 || inv.get(2).getCantidad() < 250 || inv.get(13).getCantidad() < 200) {
                System.out.println("No cuento con ingredientes suficientes para " + tipo + " procedere a recargarme..");
                if (inv.get(10).getCantidad() < 125) {
                    int cn = inv.get(10).getCantidad();
                    inv.get(10).setCantidad(cn + 1000);
                }
                if (inv.get(11).getCantidad() < 75) {
                    int cn = inv.get(11).getCantidad();
                    inv.get(11).setCantidad(cn + 400);
                }
                if (inv.get(2).getCantidad() < 250) {
                    int cn = inv.get(2).getCantidad();
                    inv.get(2).setCantidad(cn + 1500);
                }
                if (inv.get(13).getCantidad() < 200) {
                    int cn = inv.get(14).getCantidad();
                    inv.get(14).setCantidad(cn + 1000);
                }
                System.out.println("Reabasteciendo....");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ie) {
                    System.out.println("Hilo de ejecución interrumpido.");
                }
                System.out.println("Maquina Reabastecida.\n");
            }
        }

    }
}

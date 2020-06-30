
public abstract class RecetasWonka {

    /**
     * Metodo que realiza la accion de agregar un ingrediente extra al dulce
     */
    abstract void ingreExtra();

    /**
     * Metodo que realiza la accion de agregar los ingredientes a la preparacion del dulce
     */
    abstract void agregaIngredientes();
    
    /**
     * Metodo que termina la produccion del dulce
     */
    abstract void finalizando();

    /**
     * Metodo que ejecuta todos los metodos
     */
    public final void rutinaDiaria() {
        elegirMolde();
        agregaIngredientes();
        ingreExtra();
        ponerMezcla();
        finalizando();
	}

    /**
     * Metodo que elige un molde para cada dulce
     */
    void elegirMolde() {
        System.out.println("Eligiendo Molde");
    }

   /**
     * Metodo que realiza la mezcla
     */
    void ponerMezcla() {
        System.out.println("Haciendo la Mezcla");
    }
}

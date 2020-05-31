
public abstract class RecetasWonka {

    abstract void ingreExtra();

    abstract void agregaIngredientes();
    
    abstract void finalizando();

    
    public final void rutinaDiaria() {
        elegirMolde();
        agregaIngredientes();
        ingreExtra();
        ponerMezcla();
        finalizando();
	}

    void elegirMolde() {
        System.out.println("Eligiendo Molde");
    }

    void ponerMezcla() {
        System.out.println("Haciendo la Mezcla");
    }
}


public abstract class RecetasGalleneitor {
    
    abstract void ingreExtra();
    abstract void crearMasa();

	/*
	* Metodo template (plantilla)
	*/
	public final void rutinaDiaria(){
                crearMasa();
		masa();
                molde();
		ingreExtra();
                terminandoPreparacion();
	}

	void masa(){
	    System.out.println("Cociendo masa\n");
	}
        
        void molde(){
            System.out.println("Redondeando galleta \n");
        }
        
        void terminandoPreparacion(){
            System.out.println("Redondeando galleta \n");
        }

}

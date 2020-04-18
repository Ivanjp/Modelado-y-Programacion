public abstract class Construccion{

  public int costo = 1000000;// variable del costo de la construccion

	/*
	* Metodo abstracto para que cada clase lo modifique a su antojo.
	*/
	abstract void construccionEsqueleto();

	abstract void aislamiento();

	/*
	* Metodo template (plantilla)
	*/
	public final void pasosConstruccion(){
		preparacionTerreno();
		colocacionCimientos();
		construccionEsqueleto();
		instalacionElectricaPlomeria();
		aislamiento();
		acabado();
	}

  public int getcosto(){
		return costo;
	}

	void preparacionTerreno(){
		System.out.println("El terreno esta en preparacion.....");
	}

	void colocacionCimientos(){
		System.out.println("Los cimientos se estan colocando.....");
	}

	void instalacionElectricaPlomeria(){
		System.out.println("La instalacion electrica y los trabajos de plomeria se estan llevando a cabo...");
	}

	void acabado(){
		System.out.println("Todos los trabajos de la construccion de la casa han finalizado.");
	}
}

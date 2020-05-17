
public class Pollo extends Baguettes{
    
    Baguettes baguette;//Variable que guarda la baguette seleccionada

    /**
     * Constructor del ingrediente pollo
     * @param baguette Baguette del usuario
     */
	public Pollo(Baguettes baguette){
		this.baguette = baguette;
	}

    @Override
    public int costo() {
        return baguette.costo() + 9;
    }
    
    @Override
    public String getDescripcion() {
        return "Pollo";
    }
    
	
}

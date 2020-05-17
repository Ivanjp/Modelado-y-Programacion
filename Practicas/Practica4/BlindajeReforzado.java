public class BlindajeReforzado implements Blindaje{
	
	String tipo = "";
	int precio = 3000;

	@Override
	public void crearBlindaje(){
		tipo = "Blindaje reforzado";
	}

	@Override
	public void getTipo(){
		System.out.println(tipo);
	}
	@Override
	public int getPrecio(){
		return  precio;
	}
}
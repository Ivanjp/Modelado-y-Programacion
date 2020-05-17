public class BlindajeTanque implements Blindaje{
	
	String tipo = "";
	int precio = 5000;

	@Override
	public void crearBlindaje(){
		tipo = "Blindaje tanque";
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
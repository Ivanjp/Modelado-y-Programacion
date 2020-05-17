public class BlindajeSimple implements Blindaje{
	
	String tipo = "";
	int precio = 2000;

	@Override
	public void crearBlindaje(){
		tipo = "Blindaje simple";
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
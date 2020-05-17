public class ArmaMetralleta implements Arma{
	
	String tipo = "";
	int precio = 400;

	@Override
	public void crearArma(){
		tipo = "Arma metralleta";
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
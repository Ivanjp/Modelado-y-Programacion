public class ArmaLanzas implements Arma{
	
	String tipo = "";
	int precio = 600;

	@Override
	public void crearArma(){
		tipo = "Arma lanzas";
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
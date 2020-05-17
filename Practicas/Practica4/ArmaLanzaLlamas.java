public class ArmaLanzaLlamas implements Arma{
	
	String tipo = "";
	int precio = 900;

	@Override
	public void crearArma(){
		tipo = "Arma lanza llamas";
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
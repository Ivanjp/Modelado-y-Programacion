public class ArmaArpones implements Arma{
	
	String tipo = "";
	int precio = 1500;

	@Override
	public void crearArma(){
		tipo = "Arma arpones";
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
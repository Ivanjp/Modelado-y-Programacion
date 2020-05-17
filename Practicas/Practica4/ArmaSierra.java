public class ArmaSierra implements Arma{
	
	String tipo = "";
	int precio = 500;

	@Override
	public void crearArma(){
		tipo = "Arma sierra";
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
public class CarroceriaCamion implements Carroceria{
	
	String tipo = "";
	int precio = 2500;

	@Override
	public void crearCarroceria(){
		tipo = "Carroceria camion";
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
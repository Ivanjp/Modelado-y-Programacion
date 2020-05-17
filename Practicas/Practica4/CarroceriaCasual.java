public class CarroceriaCasual implements Carroceria{
	
	String tipo = "";
	int precio = 2000;

	@Override
	public void crearCarroceria(){
		tipo = "Carroceria casual";
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
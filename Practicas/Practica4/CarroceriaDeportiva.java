public class CarroceriaDeportiva implements Carroceria{
	
	String tipo = "";
	int precio = 1500;

	@Override
	public void crearCarroceria(){
		tipo = "Carroceria deportiva";
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
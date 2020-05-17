public class LlantaOffRoad implements Llanta{
	
	String tipo = "";
	int precio = 1500;

	@Override
	public void crearLlanta(){
		tipo = "Llanta off-road";
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
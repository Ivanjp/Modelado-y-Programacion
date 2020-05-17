public class LlantaSimple implements Llanta{
	
	String tipo = "";
	int precio = 600;

	@Override
	public void crearLlanta(){
		tipo = "Llanta simple";
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
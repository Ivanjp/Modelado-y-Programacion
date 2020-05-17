public class LlantaDeportiva implements Llanta{
	
	String tipo = "";
	int precio = 1000;

	@Override
	public void crearLlanta(){
		tipo = "Llanta deportiva";
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
public class LlantaOrugaDeTanque implements Llanta{
	
	String tipo = "";
	int precio = 1500;

	@Override
	public void crearLlanta(){
		tipo = "Llanta oruga de tanque";
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
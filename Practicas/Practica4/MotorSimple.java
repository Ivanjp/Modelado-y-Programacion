public class MotorSimple implements Motor{
	
	String tipo = "";
	int precio = 500;

	@Override
	public void crearMotor(){
		tipo = "Motor Simple";
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
public class MotorDiesel implements Motor{
	
	String tipo = "";
	int precio = 1000;

	@Override
	public void crearMotor(){
		tipo = "Motor Diesel";
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
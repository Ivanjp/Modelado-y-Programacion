public class MotorDeportivo implements Motor{
	
	String tipo = "";
	int precio = 800;

	@Override
	public void crearMotor(){
		tipo = "Motor deportivo";
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
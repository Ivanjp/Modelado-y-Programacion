public class Administrador implements Usuario{

  Profesor profcontratados[]=new Profesor[20];

	@Override
	public void getDatosUsuario(){
		System.out.println("id: " + id_godinez + " nombre: " + nombre
			+ " puesto: Godinez CEO");

		System.out.println("Subordinados explotables del CEO: \n");

		for(Godinez godi:godinezManagerExplotables){
			System.out.print("   ");
        	godi.getDatosEmpleado();
		}
	}


}

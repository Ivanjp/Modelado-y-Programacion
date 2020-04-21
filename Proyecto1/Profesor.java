import java.util.Hashtable;

public class Profesor implements Usuario{
	public String nombre;
  public long id_prof;
  public String materia;
  public String grupo;
  public String area;
  public Hashtable<Integer, Alumno>  alumnosInscritos= new Hashtable<Integer, String>();//TablaHash que guarda los alumnos inscritos con el profesor creado

	public Profesor(String nombre, long id_prof, String materia, String grupo,String area){
		this.nombre = nombre;
    this.id_prof = id_prof;
    this.materia = materia;
    this.grupo = grupo;
    this.area = area;
	}

  public String getNombre() {
    return nombre;
  }

  public long getId_prof() {
    return id_prof;
  }

  public String getMateria() {
    return materia;
  }

  public String getGrupo() {
    return grupo;
  }

  public String getArea() {
    return area;
  }

  

	@Override
	public void getDatosEmpleado(){
		System.out.println("id: " + id_godinez + " nombre: " + nombre
			+ " puesto: Godinez CEO");

		System.out.println("Subordinados explotables del CEO: \n");

		for(Godinez godi:godinezManagerExplotables){
			System.out.print("   ");
        	godi.getDatosEmpleado();
		}
	}


}

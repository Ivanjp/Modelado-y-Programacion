public class Alumno implements Usuario{

  public String nombre;
  public String app;
  public long id_alumno;
  public String areaA;
  public String materia1;
  public String materia2;
  public String grupoM1;
  public String grupoM2;
  public String op_tecnica;
  public int califM1;
  public int califM2;
  public double prom;

  public Alumno(String nombre, String app, long id_alumno, String areaA, String materia1, String materia2, String grupoM1, String grupoM2, String op_tecnica) {
        this.nombre = nombre;
        this.app = app;
        this.id_alumno = id_alumno;
        this.areaA = areaA;
        this.materia1 = materia1;
        this.materia2 = materia2;
        this.grupoM1 = grupoM1;
        this.grupoM2 = grupoM2;
        this.op_tecnica = op_tecnica;
        this.califM1 = 0;
        this.califM2 = 0;
        this.prom = 0.0;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApp() {
        return app;
    }

    public long getId_alumno() {
        return id_alumno;
    }

    public String getAreaA() {
        return areaA;
    }

    public String getMateria1() {
        return materia1;
    }

    public String getMateria2() {
        return materia2;
    }

    public String getGrupoM1() {
        return grupoM1;
    }

    public String getGrupoM2() {
        return grupoM2;
    }

    public String getOp_tecnica() {
        return op_tecnica;
    }

    public void setOp_tecnica(String op_tecnica) {
        this.op_tecnica = op_tecnica;
    }

    public void setCalifM1(int califM1) {
        this.califM1 = califM1;
    }

    public void setCalifM2(int califM2) {
        this.califM2 = califM2;
    }

    public void setProm(double prom) {
        this.prom = prom;
      }


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

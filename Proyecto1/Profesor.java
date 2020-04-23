
import java.util.Hashtable;

public class Profesor implements Usuario {

    public String nombre;
    public long id_prof;
    public String materia;
    public String grupo;
    public String area;
    public boolean optec;
    public Hashtable<Integer, Alumno> alumnosInscritos = new Hashtable<Integer, Alumno>();//TablaHash que guarda los alumnos inscritos con el profesor creado

    public Profesor(String nombre, long id_prof, String materia, String grupo, String area, boolean optec) {
        this.nombre = nombre;
        this.id_prof = id_prof;
        this.materia = materia;
        this.grupo = grupo;
        this.area = area;
        this.optec = optec; 
    }

    public Profesor() {
         
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
    
    public Hashtable getLista(){
        return alumnosInscritos;
    }
    
    public void guardaAlumno(long id, Alumno al){
        alumnosInscritos.put((int)id,al);
    }
    
    public void infoGrupo(){
        
        //Recorre lista de sus alumnos
    }
    
    public void asignaCalif(){
        
    }

//    @Override
//    public void getDatosEmpleado() {
//        System.out.println("id: " + id_godinez + " nombre: " + nombre
//                + " puesto: Godinez CEO");
//
//        System.out.println("Subordinados explotables del CEO: \n");
//
//        for (Godinez godi : godinezManagerExplotables) {
//            System.out.print("   ");
//            godi.getDatosEmpleado();
//        }
//    }

    @Override
    public void getDatosUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

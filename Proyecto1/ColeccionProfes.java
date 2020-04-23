
public class ColeccionProfes {
    
    Profesor[] profes;
    public void Arreglo(Profesor[] p){
        profes = p;
    }
    public Iterador getIterador() {
        return new IteradorProfes(profes);
    }
}

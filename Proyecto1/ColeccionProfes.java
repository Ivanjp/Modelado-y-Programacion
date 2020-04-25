public class ColeccionProfes {
    
    /**
     * Creacion del  arreglo de profesores
     */
    Profesor[] profes;
    
    /**
     * Metodo que guarda un arreglo de profesores
     * @param p Arreglo de profesores
     */
    public void Arreglo(Profesor[] p){
        profes = p;
    }
    
    /**
     * Metodo que le pasa al Iterador el arreglo
     * @return Iterador
     */
    public Iterador getIterador() {
        return new IteradorProfes(profes);
    }
}

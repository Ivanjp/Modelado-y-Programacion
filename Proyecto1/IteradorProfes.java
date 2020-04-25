public class IteradorProfes implements Iterador {

    /**
     * Variable que representa la posicion del iterador en el arreglo
     */
    int indice;
    
    /**
     * Arreglo de los profesores
     */
    Profesor[] profContratados;

    /**
     * Metodo que le asigna al arreglo creado el arreglo que se le pasa para poder iterarlo
     * @param profContratados Arreglo que quiere ser iterado
     */
    public IteradorProfes(Profesor[] profContratados) {
        this.profContratados = profContratados;
    }

    /**
     * Metodo que comprueba si hay un elemento en el arreglo
     * @return true si si hay un elemento, false si no
     */
    @Override
    public boolean hasNext() {
        if (indice < profContratados.length) {
            return true;
        }
        return false;
    }

    /**
     * Metodo que regres el objeto del arreglo
     * @return Objeto del arreglo
     */
    @Override
    public Object next() {
        if (this.hasNext()) {
            return profContratados[indice++];
        }
        return null;
    }

}

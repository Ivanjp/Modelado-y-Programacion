public class IteradorProfes implements Iterador {

    int indice;
    Profesor[] profContratados;

    public IteradorProfes(Profesor[] profContratados) {
        this.profContratados = profContratados;
    }

    @Override
    public boolean hasNext() {
        if (indice < profContratados.length) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            return profContratados[indice++];
        }
        return null;
    }

}

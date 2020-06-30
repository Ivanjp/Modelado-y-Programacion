
public class Maquina {

    EstadoMaquina apagada;//Guarda el estado apagado de la maquina
    EstadoMaquina encendida_suspendida;//Guarda el estado encendido de la maquina
    EstadoMaquina preparandoDulce;//Guarda el estado preparando de la maquina
    EstadoMaquina Empacando;//Guarda el estado empacando de la maquina
    Wonka3000 wn;//Guarda la maquina Wonka3000 que se esta utilizando
    String dulce;//Guarda el dulce seleccionado para producir

    EstadoMaquina estadoActual;//Guarda el estado actual de la maquina

    /**
     * Constructor de la maquina de estados
     * @param w Maquina Wonka3000 que se esta ocupando
     */
    public Maquina(Wonka3000 w) {
        apagada = new Apagada(this);
        encendida_suspendida = new Encendida_Susp(this);
        preparandoDulce = new PreparandoDulce(this);
        Empacando = new Empacando(this);
        wn = w;//Se guarga la maquina Wonka3000 que se pasa como parametro en la variable de Maquina

        estadoActual = apagada;

    }
    
    /**
     * Getter de la variable wn
     * @return Regresa la maquina Wonka3000 que se utiliza
     */
    public Wonka3000 getmaqActual(){
        return wn;
    }

    /**
     * Getter de la variable dulce
     * @return Regresa el dulce que se selecciono para producir
     */
    public String getDulce() {
        return dulce;
    }

    /**
     * Setter de la variable dulce
     * @param dulce Se guarda un nuevo valor al dulce a producir
     */
    public void setDulce(String dulce) {
        this.dulce = dulce;
    }

    /**
     * Metodo que asigna un nuevo estado a la maquina
     * @param nuevoEstado Nuevo estado de la maquina
     */
    public void asignarEstadoMaquina(EstadoMaquina nuevoEstado) {
        estadoActual = nuevoEstado;
    }

    /**
     * Metodo que ejecuta la accion reabastecer de la maquina
     * @param dulce Dulce para poder conocer sus ingredientes y poder reabastecer la maquina
     */
    public void reabastecer(String dulce) {
        estadoActual.reabastecer(dulce);
    }

    /**
     * Metodo que ejecuta la accion elegir un Dulce para producirlo
     */
    public void elegirDulce() {
        estadoActual.elegirDulce();
    }

    /**
     * Metodo que ejecuta la accion de empacar un Producto
     * @param p Producto que se va a entregar y empacar
     */
    public void entregarDulce(Producto p) {
        estadoActual.entregarDulce(p);
    }

    /**
     * Metodo que ejecuta la accion apagar de la maquina
     */
    public void terminar() {
        estadoActual.terminar();
    }
    
    /**
     * Metodo que ejecuta la accion de encender de la maquina
     */
    public void iniciarMaquina(){
        estadoActual.iniciar();
    }
    
    /**
     * Metodo que ejecuta la accion de preparar un dulce de la maquina
     */
    public void preparando(){
        estadoActual.preparando();
    }

    /**
     * Getter del estado apagado de la maquina
     * @return Regresa el estado apagado
     */
    public EstadoMaquina getEstadoApagada() {
        return apagada;
    }

    /**
     * Getter del estado encendido de la maquina
     * @return Regresa el estado encendido
     */
    public EstadoMaquina getEstadoEncendida_suspendida() {
        return encendida_suspendida;
    }

    /**
     * Getter del estado preparando dulce de la maquina
     * @return Regresa el estado preparando
     */
    public EstadoMaquina getEstadoPreparandoDulce() {
        return preparandoDulce;
    }
    
    /**
     * Getter del estado empacando de la maquina
     * @return Regresa el estado empacando
     */
    public EstadoMaquina getEstadoEmpacando() {
        return Empacando;
    }
    
}

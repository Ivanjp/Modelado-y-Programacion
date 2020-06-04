
public class Maquina {

    EstadoMaquina apagada;
    EstadoMaquina encendida_suspendida;
    EstadoMaquina preparandoDulce;
    EstadoMaquina Empacando;
    Wonka3000 wn;
    String dulce;
    Producto p;

    EstadoMaquina estadoActual;

    public Maquina(Wonka3000 w) {
        apagada = new Apagada(this);
        encendida_suspendida = new Encendida_Susp(this);
        preparandoDulce = new PreparandoDulce(this);
        Empacando = new Empacando(this);
        wn = w;

        estadoActual = apagada;

    }
    
    public Wonka3000 getmaqActual(){
        return wn;
    }

    public String getDulce() {
        return dulce;
    }

    public void setDulce(String dulce) {
        this.dulce = dulce;
    }

    public Producto getP() {
        return p;
    }

    public void setP(Producto p) {
        this.p = p;
    }
    
    public void asignarEstadoMaquina(EstadoMaquina nuevoEstado) {
        estadoActual = nuevoEstado;
    }

    public void reabastecer() {
        estadoActual.reabastecer();
    }

    public void elegirDulce() {
        estadoActual.elegirDulce();
    }

    public void entregarDulce() {
        estadoActual.entregarDulce();
    }

    public void terminar() {
        estadoActual.terminar();
    }
    
    public void iniciarMaquina(){
        estadoActual.iniciar();
    }
    
    public void preparando(){
        estadoActual.preparando();
    }

    public EstadoMaquina getEstadoApagada() {
        return apagada;
    }

    public EstadoMaquina getEstadoEncendida_suspendida() {
        return encendida_suspendida;
    }

    public EstadoMaquina getEstadoPreparandoDulce() {
        return preparandoDulce;
    }
    
    public EstadoMaquina getEstadoEmpacando() {
        return Empacando;
    }
    
}


public class Maquina {

    EstadoMaquina apagada;
    EstadoMaquina encendida_suspendida;
    EstadoMaquina preparandoDulce;
    EstadoMaquina Empacando;

    EstadoMaquina estadoActual;

    public Maquina() {
        apagada = new Apagada(this);
        encendida_suspendida = new Encendida_Susp(this);
        preparandoDulce = new PreparandoDulce(this);
        Empacando = new Empacando(this);

        estadoActual = apagada;

    }

    
    public void asignarEstadoCajero(EstadoCajero nuevoEstado) {
        estadoActual = nuevoEstado;
    }

    public void insertarTarjeta() {
        estadoActual.insertarTarjeta();
    }

    public void expulsarTarjeta() {
        estadoActual.expulsarTarjeta();
    }

    public void ingresarPIN(int pinIngresado) {
        estadoActual.ingresarPIN(pinIngresado);
    }

    public void hacerRetiro(int efectivoARetirar) {
        estadoActual.hacerRetiro(efectivoARetirar);
    }

    public EstadoCajero getEstadoConTarjeta() {
        return conTarjeta;
    }

    public EstadoCajero getEstadoSinTarjeta() {
        return sinTarjeta;
    }

    public EstadoCajero getEstadoPinCorrecto() {
        return pinCorrecto;
    }

    public EstadoCajero getEstadoCajeroSinDinero() {
        return cajeroSinDinero;
    }
}

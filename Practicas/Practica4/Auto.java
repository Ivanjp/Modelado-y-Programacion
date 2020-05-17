
public class Auto {

    Llanta llanta;
    Motor motor;
    Carroceria carroceria;
    Blindaje blindaje;
    Arma arma;

    public Auto(Llanta llanta, Carroceria carroceria, Motor motor, Blindaje blindaje, Arma arma) {
        this.llanta = llanta;
        this.carroceria = carroceria;
        this.motor = motor;
        this.blindaje = blindaje;
        this.arma = arma;
    }

    public void muestraAuto() {
        System.out.println("El auto construido es el siguiente: ");
        if (llanta != null) {
            llanta.getTipo();
        } else {
            System.out.println("Este coche no tiene llantas");
        }

        if (carroceria != null) {
            carroceria.getTipo();
        } else {
            System.out.println("Este coche no tiene carroceria");
        }

        if (motor != null) {
            motor.getTipo();
        } else {
            System.out.println("Este coche no tiene motor");
        }

        if (blindaje != null) {
            blindaje.getTipo();
        } else {
            System.out.println("Este coche no tiene blindaje");
        }

        if (arma != null) {
            arma.getTipo();
        } else {
            System.out.println("Este coche no tiene armas");
        }

    }

    public int costo() {
        int costo = 0;
        int cllanta = 0;
        int ccarroceria = 0;
        int cmotor = 0;
        int cblind = 0;
        int carma = 0;
        
        if (llanta != null) {
           cllanta = llanta.getPrecio();
        }
        if (carroceria != null) {
           ccarroceria = carroceria.getPrecio();
        } 
        
        if (motor != null) {
           cmotor = motor.getPrecio();
        } 
        
        if (blindaje != null) {
           cblind = blindaje.getPrecio();
        } 
        
        if (arma != null) {
           carma = arma.getPrecio();
        } 
        costo = cllanta + ccarroceria + cmotor + cblind + carma;
        return costo;
    }
}

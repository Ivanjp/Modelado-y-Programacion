public class Robot{

    //Estados disponibles del Robot
	  EstadoRobot suspendido;
		EstadoRobot activo;
		EstadoRobot caminando;
		EstadoRobot construir;
		EstadoRobot recibirOrden;
		EstadoRobot trabajar;
		EstadoRobot reabastecer;

		//Variable para guardar el estado en el que se encuentra el robot
		EstadoRobot estadoActual;

    //Banderas para saber cuando cambiar de cierto estado a otro
  	boolean ordenLista = false;
		boolean reabasteceListo = false;
		boolean estatus = false;
		public int opcion;

    //Constructor inicializando todos los estados
		public Robot(){
			suspendido = new Suspendido(this);
			activo = new Activo(this);
			caminando = new Caminando(this);
			construir = new Construir(this);
			recibirOrden = new recibirOrden(this);
			trabajar = new Trabajar(this);
			reabastecer = new Reabastecer(this);

			estadoActual = suspendido;

		}

 //Getters y Setters de los atributos
	public boolean getordenLista(){
		return ordenLista;
	}

	public boolean getreabasteceListo(){
		return reabasteceListo;
	}

	public boolean getfinalizado(){
		return estatus;
	}

// Este sirve para guardar la opcion de tipo de casa que se quiere construir
	public int getopcion(){
		return opcion;
	}

	public void setopcion(int op){
		opcion = op;
	}

	public void setfinalizado(boolean status){
		estatus = status;
	}

public void setordenLista(boolean nueva_orden){
	ordenLista = nueva_orden;
}

public void setreabasteceListo(boolean reabastece){
	reabasteceListo = reabastece;
}

		public void asignarEstadoRobot(EstadoRobot nuevoEstado){
			estadoActual = nuevoEstado;
		}

//Metodos de los estados
		public void camina(){
			estadoActual.camina();
		}

		public void recibeOrden(){
			estadoActual.recibeOrden();
		}

		public void reabastece(){
			estadoActual.reabastece();
		}

		public void trabaja(){
			estadoActual.trabaja();
		}

		public void construye(){
			estadoActual.construye();
		}

		public void activarse(){
			estadoActual.activarse();
		}

		public void suspende(){
			estadoActual.suspende();
		}

		public EstadoRobot getEstado(){
			return estadoActual;
		}

		public EstadoRobot getEstadoSuspendido(){
			return suspendido;
		}

		public EstadoRobot getEstadoActivo(){
			return activo;
		}

		public EstadoRobot getEstadoCaminando(){
			return caminando;
		}

		public EstadoRobot getEstadoConstruir(){
			return construir;
		}

		public EstadoRobot getEstadorecibirOrden(){
			return recibirOrden;
		}

		public EstadoRobot getEstadoTrabajar(){
			return trabajar;
		}

		public EstadoRobot getEstadoReabastecer(){
			return reabastecer;
		}
}

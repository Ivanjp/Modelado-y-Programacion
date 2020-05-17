public class FabricaArmas extends AbstractFactory{
	
	@Override
	public Object getComponente(String tipoComponente){
		return getArma(tipoComponente);
	}


	public Arma getArma(String tipoArma){
		if(tipoArma == null){
			return null;
		} else if(tipoArma.equalsIgnoreCase("arpones")){
			return new ArmaArpones();
		} else if(tipoArma.equalsIgnoreCase("lanzallamas")){
			return new ArmaLanzaLlamas();
		}else if(tipoArma.equalsIgnoreCase("lanzas")){
			return new ArmaLanzas();
		}else if(tipoArma.equalsIgnoreCase("sierra")){
			return new ArmaSierra();
		}else if(tipoArma.equalsIgnoreCase("metralleta")){
			return new ArmaMetralleta();
		}
		return null;
	}

}



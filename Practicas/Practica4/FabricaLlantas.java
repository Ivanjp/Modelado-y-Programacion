public class FabricaLlantas extends AbstractFactory{
	 
	@Override
	public Object getComponente(String tipoComponente){
		return getLlanta(tipoComponente);
	}


	public Llanta getLlanta(String tipoLlanta){
		if(tipoLlanta == null){
			return null;
		} else if(tipoLlanta.equalsIgnoreCase("simple")){
			return new LlantaSimple();
		} else if(tipoLlanta.equalsIgnoreCase("deportiva")){
			return new LlantaDeportiva();
		} else if (tipoLlanta.equalsIgnoreCase("off-road")){
			return new  LlantaOffRoad();
		} else if (tipoLlanta.equalsIgnoreCase("oruga de tanque")){
			return new LlantaOrugaDeTanque();
		}
		return null;
	}
}

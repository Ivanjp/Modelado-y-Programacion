public class FactoryProducer{
	
	public static AbstractFactory getFactory(String opcion){
		if(opcion.equalsIgnoreCase("llanta")){
			return new FabricaLlantas();
		} else if(opcion.equalsIgnoreCase("carroceria")){
			return new FabricaCarrocerias();
		} else if(opcion.equalsIgnoreCase("motor")){
			return new FabricaMotores();
		}else if(opcion.equalsIgnoreCase("blindaje")){
			return new FabricaBlindajes();
		}else if(opcion.equalsIgnoreCase("arma")){
			return new FabricaArmas();
		}
		return null;
	}
}
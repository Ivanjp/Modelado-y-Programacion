public class E_Concreto extends Construccion{
	@Override
	void construccionEsqueleto(){
		System.out.println("Se esta poniendo Esqueleto de concreto..");
		costo = costo+500000;
	}

	@Override
	void aislamiento(){
		System.out.println("Se esta poniendo el Aislamiento");
	}
}

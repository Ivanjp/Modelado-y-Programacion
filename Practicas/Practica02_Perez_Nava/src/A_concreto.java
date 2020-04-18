public class A_concreto extends Construccion{
	@Override
	void aislamiento(){
		System.out.println("Se esta poniendo Aislamiento de concreto..");
		costo = costo+2000000;
	}

	@Override
	void construccionEsqueleto(){
		System.out.println("Se esta realizando la construccion del esqueleto..");
	}
}

public class A_vidrio extends Construccion{
	@Override
	void aislamiento(){
		System.out.println("Se esta poniendo Aislamiento de vidrio..");
		costo = costo+250000;
	}

	@Override
	void construccionEsqueleto(){
		System.out.println("Se esta realizando la construccion del esqueleto..");
	}
}

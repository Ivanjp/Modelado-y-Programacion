public class A_madera extends Construccion{
	@Override
	void aislamiento(){
		System.out.println("Se esta poniendo Aislamiento de madera..");
		costo = costo+1000000;
	}

	@Override
	void construccionEsqueleto(){
		System.out.println("Se esta realizando la construccion del esqueleto..");
	}
}

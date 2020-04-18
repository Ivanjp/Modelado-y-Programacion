public class A_reforzado extends Construccion{
	@Override
	void aislamiento(){
		System.out.println("Se esta poniendo Aislamiento reforzado..");
		costo = costo+3000000;
	}

	@Override
	void construccionEsqueleto(){
		System.out.println("Se esta realizando la construccion del esqueleto..");
	}
}

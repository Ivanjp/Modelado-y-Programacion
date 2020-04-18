public class E_reforzado extends Construccion{
	@Override
	void construccionEsqueleto(){
		System.out.println("Se esta poniendo Esqueleto reforzado..");
		costo = costo+1000000;
	}

	@Override
	void aislamiento(){
		System.out.println("Se esta poniendo el Aislamiento");
	}
}

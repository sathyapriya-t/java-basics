package interfaces.algo;

//With Abstract class we don't have to necessary implement all the  methods in the interface 
public abstract class AbstractClassDontImplementAllMethodsFromInterface implements ComplexAlgo {

	@Override
	public void someComplexMethod() {
		System.out.println("same complex thing");
	}

}

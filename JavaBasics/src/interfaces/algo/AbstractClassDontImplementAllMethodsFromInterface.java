package interfaces.algo;


//With Abstract class we dont have to neccesary implement all the  methods in the interface 
public abstract class AbstractClassDontImplementAllMethodsFromInterface implements  ComplexAlgo{
	
	@Override
	public void someComplexMethod() {
	  System.out.println("same complex thing");
	}

}

package interfaces.algo;

public class InterfaceRunner {

	public static void main(String[] args) {
		ComplexAlgo algo = new AlogoImpl();
		algo.someComplexMethod();
		algo.someComplexMethod1();

		ComplexAlgo algo1 = new ClassWhichExtendsAbstractClassImplementedFromInterface();
		algo1.someComplexMethod1();
		algo1.someComplexMethod();

		algo.print();

	}

}

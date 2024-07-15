package java8.functionalinterface;

public class FunctionalInterfaceClassImpl {

	public static void main(String[] args) {
		// Funtion interface abstract method must be implemented every time its
		// instantiated
		FunctionInrefaceClass fInrefaceClass = new FunctionInrefaceClass() {

			@Override
			public void test() {
				System.out.println("Implemented Function Interface! ");
			}
		};
		fInrefaceClass.test();
	}

}

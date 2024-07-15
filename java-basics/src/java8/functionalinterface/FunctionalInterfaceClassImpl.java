package java8.functionalinterface;

public class FunctionalInterfaceClassImpl {

	public static void main(String[] args) {
		// Funtion interface abstract method must be implemented every time its
		// instantiated
		// But this is little bit messy and complicated - for that Lambda fuction are
		// introduced
		// lamda - quick and easy way to implement Funtional Interface

		//old way
		FunctionInrefaceClass fInrefaceClass = new FunctionInrefaceClass() {

			@Override
			public void test() {
				System.out.println("Implemented Function Interface! ");
			}
		};
		fInrefaceClass.test();
		
		//Using lamda expression - implemeted Function Interface
		//simple and easy
		FunctionInrefaceClass functionalInterf = () -> {
			System.out.println("Implemented Function Interface! ");
		};
		functionalInterf.test();
		
		//Another funtional interface taking paramerter
		LambdaWithParameterInterface lParameterInterface = (name) -> {
			System.out.println("hello "+ name + " !!");
		};
		
		lParameterInterface.printName("sathya");
		
	
		Square s = new Square(4);
		SquareFunctionalInterface squareInterface = (Square square) -> {
			return  s.calculateArea();
		};
		
		System.out.println(squareInterface.area(s));
		
		//method reference - we can replace lamda experession
		Square s1 = new Square(4);
		SquareFunctionalInterface squareInterface1 = Square::calculateArea;
		
		System.out.println(squareInterface1.area(s1));
	}

}

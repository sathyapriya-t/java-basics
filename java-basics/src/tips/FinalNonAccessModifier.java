package tips;

final class FinalClass {

	final void write(String name) {
		System.out.println("Hello world");
	}
}

//Final classes can't be inherited
//class Extending class{
//	
//}

class FinalMethodClass {

	final void write(String name) {
		System.out.println("Hello world " + name);
	}

	final void writeFinalArg(final int name) {
		// here we can't change the argument
		// int = 12
		System.out.println("Hello world " + name);
	}
}

class ExtendingClass extends FinalMethodClass {

//  can't extend the final method from parent class	
//	void write(String name) {
//		
//	}
}

public class FinalNonAccessModifier {

	public static void main(String[] args) {
		// final classes and methods can ne instanciated , called but can not be
		// inherited
		FinalClass cl = new FinalClass();
		cl.write("sathya");

		// Final variable
		final int i = 10;
		// Not allowed because varible is final
		// i = 22;
	}
}
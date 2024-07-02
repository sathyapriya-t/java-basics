package interfaces.algo;

public interface ComplexAlgo {

	// only constants allowed not variables
	public static final int value = 0;

	// Only this default implementation allowed from java8 and we can override this
	// method from its implementation
	// Interface everything is public. PRIVATE is not allowed
	default void print() {
		System.out.println(value);
	}

	public void someComplexMethod();

	public void someComplexMethod1();

}

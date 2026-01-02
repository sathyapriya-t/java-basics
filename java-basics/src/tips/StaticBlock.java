package tips;

class Example {
	static int i;

	// Static block - used to initialize the static variable
	// this will be always excuted first when JVM loads the classes
	static {
		System.out.println("Exceuting static block!!");
		i = 10;
	}

	// Constructor will be called as soon as object is created
	public Example() {
		super();
		System.out.println("Exceuting the constructor");
	}

	public static void run() {
		System.out.println("Running static method");
	}

}

public class StaticBlock {

	public static void main(String[] args) {

		Example example1 = new Example();
		Example.run();
		System.out.println(Example.i);
		Example example = new Example();
	}

}

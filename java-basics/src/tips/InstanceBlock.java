package tips;

class New {

	// Intstance variable
	private int i;
	private int j;

	// Instance Block - mainly used for initializing instance variables
	// This will be exceuted as soon as object is created and before executing the
	// constructor
	{
		System.out.println("Instance block for i ");
		i = 10;
	}

	{
		System.out.println("Instance block for j ");
		j = 20;
	}

	// Constructor
	public New() {
		super();
		System.out.println("Exceuting Constructor !! ");

	}

	public int getI() {
		return i;
	}

	public int getJ() {
		return j;
	}

}

public class InstanceBlock {

	public static void main(String[] args) {

		// Order
		// Instance blocks
		// Constructor
		// Others
		New new1 = new New();
		System.out.println(new1.getI());
		System.out.println(new1.getJ());

	}

}

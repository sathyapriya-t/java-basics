package solid.l;

public class Bicycle implements Vehicle {

	// Constant
	private static final int COUNT = 2;

	// Here this Bicycle doesn't have engine - this voilates the Liskov principle
	// The Common interface Vechicle should have a method which is acceptle by all
	// the child classes

	@Override
	public void engineOn() throws Exception {
		throw new Exception("Bicycle doesn't have engine");
	}

	@Override
	public int getWheelCount() {
		return COUNT;
	}

}

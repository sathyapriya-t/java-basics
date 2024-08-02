package solid.l;

public class Car implements Vehicle {

	// Constant
	private static final int COUNT = 4;

	@Override
	public void engineOn() {
		System.out.println("Engine is on !!");

	}

	@Override
	public int getWheelCount() {
		return COUNT;

	}

}

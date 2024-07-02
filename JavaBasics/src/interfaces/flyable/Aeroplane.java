package interfaces.flyable;

public class Aeroplane implements Flyable {

	@Override
	public void fly() {
		System.out.println("With fuel");
	}

}

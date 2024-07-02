package interfaces.flyable;

public class FlyRunner {
	public static void main(String[] args) {
		Flyable[] flyList = {new Bird(), new Aeroplane()};
		for(Flyable i : flyList) {
			i.fly();
		}
	}

}

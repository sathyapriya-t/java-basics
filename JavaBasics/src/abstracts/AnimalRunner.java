package abstracts;

public class AnimalRunner {
	public static void main(String[] args) {
		Animal[] animal = { new Dog(), new Cat() };
		for (Animal i : animal) {
			i.bark();
		}
	}

}

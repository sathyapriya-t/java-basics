package solid.i.solution;

public class InterfaceSegregation {
	// SOLID- used to write maintainable, flexible and understandable code
	// S - SingleResponsibility
	// O - Open/Closed
	// L - Liskov Substitution
	// I - Interface Seggregation
	// D - Dependancy Inversion

	public static void main(String[] args) {

		// I - Interface Seggregation - spliting the larger interface into smaller
		// interface
		// so that uneccessary methods will not be inherited

		ZooWorker zooWorker = new ZooWorker();
		zooWorker.cleanBear();
		zooWorker.feedBear();

		Visitor visitor = new Visitor();
		visitor.petBear();

	}

}

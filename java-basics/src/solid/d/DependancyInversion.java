package solid.d;

public class DependancyInversion {

	// SOLID- used to write maintainable, flexible and understandable code
	// S - SingleResponsibility
	// O - Open/Closed
	// L - Liskov Substitution
	// I - Interface Seggregation
	// D - Dependancy Inversion

	public static void main(String[] args) {
		// D - Dependancy Inversion - The principle of dependency inversion refers to
		// the decoupling of software modules. This way, instead of high-level modules
		// depending on low-level modules, both will depend on abstractions.

		// basically not make it depending upon specific one
		// Here we set the brand
		KeyBoard standardKeyBoard = new StandardKeyBoard();
		standardKeyBoard.setBrand("Apple");
		
		Mouse standardMouse = new StandardMouse();
		standardMouse.setBrand("Apple");
		
		Computer computer = new Computer(standardKeyBoard, standardMouse);
		System.out.println(computer.toString());

	}

}

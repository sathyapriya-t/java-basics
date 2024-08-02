package solid.l;

import java.util.ArrayList;
import java.util.List;

public class LiskovSubstitution {

	// SOLID- used to write maintainable, flexible and understandable code
	// S - SingleResponsibility
	// O - Open/Closed
	// L - Liskov Substitution
	// I - Interface Seggregation
	// D - Dependancy Inversion

	public static void main(String[] args) throws Exception {

		// L - Liskov Substitution - all the sub classes should be able to replaced by
		// the parent classes

		// car
		Car car = new Car();
		// Bicycle
		Bicycle bicycle = new Bicycle();
		// Adding Vechile
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(car);
		vehicles.add(bicycle);

		/*
		 * here bicycle.engineOn threws exception because it doesn't have a engine this
		 * clearly breaks the Liskov principle All the vechicle subclass should be
		 * replace by Parent class The method in the parent class should be implemented
		 * by all the subclass - if not it breaks the liskov principle
		 */

		// printing
		for (Vehicle v : vehicles) {
			System.out.println(v.getWheelCount());
			v.engineOn();
		}

	}

}

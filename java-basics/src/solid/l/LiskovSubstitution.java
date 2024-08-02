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
		
		// L - Liskov Substitution - all the sub classes should be able to replaced by the original classes
		
		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(car);
		vehicles.add(bicycle);
		
		for(Vehicle v :vehicles) {
			System.out.println(v.getWheelCount());
			v.engineOn();
		}

	}

}

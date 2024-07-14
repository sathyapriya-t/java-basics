package oops.polymorphism;

public class MovieRunner {
	
	//ride - overide - run - runtime polymorphism
	public static void main(String[] args) {

		// Instances
		Movie artOfComputing = new Movie(1000,"sathya");
		Movie effectiveJava = new Review(1000,"sathya","Excellent",5);
		artOfComputing.read("Art Of Computing");
		effectiveJava.read("Effective Java");
		Review effectiveJava1 = new Review(1000,"sathya","Excellent",5);
		
		//Complie time Polymporphism - same method with differnt arguments
		effectiveJava1.payout();
		effectiveJava1.payout(5);

	}

}

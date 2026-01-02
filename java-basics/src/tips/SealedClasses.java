package tips;

/*

Sealed class - helps to have better control over Inheritance

The class which inherts Sealed class should be either final/ Non-sealed 
Final class of which extends the Sealed class - this can't be inherited as it is final class. As Final class cann't be inherited
Non-sealed class whiich extends the sealed class. this can be inherited and can access the methods inside the sealed class

There is way to access the sealed class 
we can access the sealed class through the non-sealed class which extends the sealed class

*/
sealed class Bird permits Peacock, Parrot {
	private String name;
	private String country;

	public void sound() {
		System.out.println("Quack Quack!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}

//Final class of which extends the Sealed class - this can't be inherited as it is final class
//Final class cann't be inherited
//Class ehich extends sealed class should either be final or nonsealed
final class Peacock extends Bird {

}

//Non-sealed class whiich extends the sealed class = this can be inherited and can access the methods inside the sealed class
non-sealed class Parrot extends Bird {
	
}

//Hen - canot be inherited because its not permitted in Super Class
//final class Hen extends Bird{
//	
//}

//Extending non-sealed class which extends the sealed class
class Pet extends Parrot {

}

//Can't extend as it is final
//class Pet extends Peacock{
//	
//}

public class SealedClasses {
	public static void main(String[] args) {

		// sealed class
		Bird bird2 = new Bird();
		bird2.sound();

		// calling sealed class method from non-sealed class
		Bird bird = new Parrot();
		bird.sound();

		// calling sealed class method from final class
		Bird bird1 = new Peacock();
		bird1.sound();

		// calling the sealed class method through the extending the non-sealed class
		// which extends the sealed class
		Parrot parrot = new Pet();
		parrot.sound();
	}

}

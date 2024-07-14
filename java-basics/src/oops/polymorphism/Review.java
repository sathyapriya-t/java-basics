package oops.polymorphism;

public class Review extends Movie {
	private String comments;
	private int rating;

	public Review(int price, String author, String comments, int rating) {
		super(price, author);
		this.comments = comments;
		this.rating = rating;
	}



	//Overriding - runtime Polymorphisim
	@Override
	void read(String name) {
		System.out.println("Reading Review of " + name + ": the rating is " + rating + "! " + comments);
	}
	
	//Overloading - Compile time polymorphism
	protected void payout(int value) {
		if(value > 4) {
			System.out.println(this.price * 10000);
		}
	}
	protected void payout() {
			System.out.println(this.price);
	}

}

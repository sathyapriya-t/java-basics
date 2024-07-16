package java8.functionalinterface;

public class Square {
	private int i;

	public Square(int i) {
		this.i = i;
	}

	public int calculateArea() {
		return this.i * this.i;
	}

}

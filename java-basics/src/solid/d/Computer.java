package solid.d;

public class Computer {

	private KeyBoard standardKeyBoard;
	private Mouse staMouse;

	// here the computer class is tightly couple with the lower level objects
	// standardKeyBoard and Mouse

	/*
	 * public Computer() {
	 *    super(); 
	 *    this.setStandardKeyBoard(new StandardKeyBoard());
	 *    this.setStaMouse(new StandardMouse());
	 *    }
	 */

	// Here we are taking the preference as a parameter
	public Computer(KeyBoard standardKeyBoard, Mouse staMouse) {
		super();
		this.standardKeyBoard = standardKeyBoard;
		this.staMouse = staMouse;
	}


	public Mouse getStaMouse() {
		return staMouse;
	}

	public void setStaMouse(Mouse staMouse) {
		this.staMouse = staMouse;
	}

	public KeyBoard getStandardKeyBoard() {
		return standardKeyBoard;
	}

	public void setStandardKeyBoard(KeyBoard standardKeyBoard) {
		this.standardKeyBoard = standardKeyBoard;
	}


	@Override
	public String toString() {
		return "Computer [standardKeyBoard=" + standardKeyBoard + ", staMouse=" + staMouse + "]";
	}

}

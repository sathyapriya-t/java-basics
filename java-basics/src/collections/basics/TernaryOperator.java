package collections.basics;

public class TernaryOperator {

	// JVM looks for the main method with string array as arugement and will excute
	// it
	public static void main(String[] args) {

		// Ternary Operator - condition ? statement1: satement 2
		int n1 = 10;
		int n2 = 20;
		String result = n1 < n2 ? n2 + " is greater" : "No";
		System.out.println(result + " main 1");

	}

	// this main will not be called
	public static void main(String arg) {

		// Ternary Operator - condition ? statement1: satement 2
		int n1 = 10;
		int n2 = 20;
		String result = n1 < n2 ? n2 + " is greater" : "No";
		System.out.println(result);

	}

	// This main will also not be called
	public static void main() {

		// Ternary Operator - condition ? statement1: satement 2
		int n1 = 10;
		int n2 = 20;
		String result = n1 < n2 ? n2 + " is greater" : "No";
		System.out.println(result);

	}

}

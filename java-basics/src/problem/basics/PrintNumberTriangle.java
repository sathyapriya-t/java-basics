package problem.basics;

public class PrintNumberTriangle {

	public void printTraingle() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public void printInvertedTraingle() {
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		PrintNumberTriangle print = new PrintNumberTriangle();

		print.printInvertedTraingle();
		print.printTraingle();
	}

}

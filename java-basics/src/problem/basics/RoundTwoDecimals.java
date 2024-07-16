package problem.basics;

public class RoundTwoDecimals {

	public static void main(String[] args) {
		
		// Rounding a double value to two decimals
		// multiply and divide by 100 -> this will return double value of two decimals
		System.out.println("roundNumber with decimal: " + roundNumber(3.12));
	}

	static double roundNumber(double value) {
		return Math.round(value * 100) / 100d;
	}

}

package problem.basics;

public class FacinatingNumber {

	public static void main(String[] args) {

		// Fascinating Number - number which has three digit
		// multiplication if 2 and 3 of that number should be three digit
		// And joining all three number - should contain all number from 1-9 excatly one
		// time
		int num = 327;
		int n1, n2 = 0;

		n1 = 2 * 327;
		n2 = 3 * 327;

		String concatString = num + "" + n1 + n2;
		boolean isFasinating = true;

		// chech for lenght is 3
		if ((num + "").toCharArray().length == 3) {

			// looping throught all the value 1 to 9
			for (char i = '1'; i <= '9'; i++) {
				int count = 0;
				// Looping through all the letter in a that string
				for (int j = 0; j < concatString.length(); j++) {
					char ch = concatString.charAt(j);
					if (i == ch) {
						count++;
					}
				}
				// Checking the all the letter is present and excatly one time
				if (count == 0 || count > 1) {
					isFasinating = false;
					System.out.println(" Not a Facinating Number");
					break;
				}

			}
			if (isFasinating) {
				System.out.println("Facinating Number!!");
			}

		}

	}
}

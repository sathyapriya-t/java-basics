package tips;

public class NewSwitchExpression {

	public static void main(String[] args) {

		int key = 2;
		System.out.println(normalSwitch(key));

		String dayOfWeek = newSwitchExpression(3);
		System.out.println(dayOfWeek);

		System.out.println(newSwitchExpressionWithMultipleLines(4));

	}

	private static String newSwitchExpression(int key) {
		// new switch Expression
		String dayOfWeek = switch (key) {
		case 1 -> "sunday";
		case 2 -> "Monday";
		case 3 -> "Tuesday";
		case 4 -> "Wednesday";
		case 5 -> "Thursday";
		default -> throw new IllegalArgumentException("Unexpected value: " + key);
		};
		return dayOfWeek;
	}

	private static String newSwitchExpressionWithMultipleLines(int key) {
		// new switch Expression with multiple lines
		// we can't return the multiple line value -- so we use yeild keyword to return
		String dayOfWeek = switch (key) {
		case 1 -> {
			System.out.println();
			yield "sunday";
		}
		case 2 -> "Monday";
		case 3 -> "Tuesday";
		case 4 -> "Wednesday";
		case 5 -> "Thursday";
		default -> throw new IllegalArgumentException("Unexpected value: " + key);
		};
		return dayOfWeek;
	}

	private static String normalSwitch(int key) {
		switch (key) {
		case 1:
			return "sunday";
		case 2:
			return "Monday";
		case 3:
			return "Tuesday";
		case 4:
			return "Wednesday";
		case 5:
			return "Thursday";
		default:
			throw new IllegalArgumentException("Unexpected value: " + key);
		}
	}

}

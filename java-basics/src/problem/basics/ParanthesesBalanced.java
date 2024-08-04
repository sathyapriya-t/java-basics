package problem.basics;

import java.util.Stack;

public class ParanthesesBalanced {
	public static void main(String[] args) {
		String val = "{{(}}";
		usingStack(val);
		usingStack("{{}}");

		usingCounter("{{)}}");
		usingCounter("{{}}");

		usingCounterAndSeparateIf("{{)}");
		usingCounterAndSeparateIf("{()}");

	}

	private static void usingCounterAndSeparateIf(String val) {

		// This works for all
		// defaining 3 counter to keep track of the brackets
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		for (Character c : val.toCharArray()) {
			if (c == '{') {
				count1++;
			} else if (c == '[') {
				count2++;
			} else if (c == '(') {
				count3++;
			} else if (c == ')') {
				count3--;
			} else if (c == '}') {
				count1--;
			} else if (c == ']') {
				count2--;
			} else {
				System.out.println("Not a valid bracket!!");
			}

		}
		if (count1 == 0 && count2 == 0 && count3 == 0) {
			System.out.println("All bracket have complete set");
		} else {
			System.out.println("Bracket doesn't have complete set");
		}
	}

	private static void usingCounter(String val) {

		// This works only for opening and closing brackets
		// this giives wrong value for {{]}
		// We can implement this by giving a separate saperate if statemets for each
		int count = 0;
		for (Character c : val.toCharArray()) {
			if (c == '{' || c == '(' || c == '[') {
				count++;
			} else if (c == ')' || c == '}' || c == ']') {
				count--;
			} else {
				System.out.println("Not a valid bracket!!");
			}

		}
		if (count == 0) {
			System.out.println("All bracket have complete set");
		} else {
			System.out.println("Bracket doesn't have complete set");
		}
	}

	private static void usingStack(String val) {

		// This only wrrks for "{{(}}" not "{{)}}"
		// using stack data structure to check the brackets
		Stack<Character> stack = new Stack<Character>();
		for (Character c : val.toCharArray()) {
			if (c == '{' || c == '(' || c == '[') {
				stack.add(c);
			} else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
				stack.pop();

			} else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();

			} else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();

			}
		}
		if (stack.isEmpty()) {
			System.out.println("All bracket have complete set");
		} else {
			System.out.println("Bracket doesn't have complete set");
		}
	}

}

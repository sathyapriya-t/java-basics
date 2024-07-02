package com.oops.string;

public class StringMagic {
	/*
	 * Your task is to complete a Java method called countUppercaseLetters. This
	 * method takes a string as input and returns the number of uppercase letters
	 * present in that string. The method is part of a class named StringMagic.
	 *
	 * Remember to consider the following edge cases: If the string is empty, the
	 * method should return 0. If the string does not contain any uppercase letters,
	 * the method should also return 0.
	 */

	public int countUppercaseLetters(String str) {
		if (str.isEmpty()) {
			return 0;
		}
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				count++;
			}
		}
		return count;
	}

	/**
	 * This method checks if a given string has two consecutive identical
	 * characters.
	 *
	 * @param str The string to check for consecutive duplicates.
	 * @return true if the string has consecutive duplicates, false otherwise.
	 */
	public boolean hasConsecutiveDuplicates(String str) {

		// TODO: Write your code here
		for (int i = 0; i < str.length() - 1; i++) {
			char duplicate = str.charAt(i);
			char duplicate1 = str.charAt(i + 1);

			if (duplicate == duplicate1) {
				return true;
			}
		}
		return false;
	}

	/**
	 * This method finds the rightmost digit in a given string.
	 *
	 * @param str The string to find the rightmost digit in.
	 * @return The rightmost digit in the string. If no digit is found, return -1.
	 */
	public int getRightmostDigit(String str) {

		// TODO: Write your code here
		char digit = '1';
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				digit = str.charAt(i);
			}
		}
		if (digit == '1') {
			return -1;
		} else {
			return Character.getNumericValue(digit);
		}
	}

	/**
	 * This method finds the longest word in a given sentence.
	 *
	 * @param sentence The sentence to find the longest word in.
	 * @return The longest word in the sentence. If sentence is empty, return an
	 *         empty string.
	 */
	public String findLongestWord(String sentence) {
		if (sentence == null || sentence == "") {
			return "";
		}
		String[] strList = sentence.split(" ");
		String longestWord = "";
		int longest = 0;
		for (String i : strList) {
			if (longest < i.length()) {
				longest = i.length();
				longestWord = i;
			}
		}
		return longestWord;
	}

}

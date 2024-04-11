package com.basics;

/*Word Reverser
In this exercise, you are required to write a Java method called reverseWordsInSentence within the provided StringMagic class.
The method should take a string sentence as input and return a string in which each word in the sentence is reversed while maintaining the original word order.

Edge conditions:
If the input string is null, your method should return the string "INVALID".
If the input string is empty (i.e., ""), your method should return an empty string.*/

public class ReverseTheWordInSentance {

	public String reverseWordsInSentence(String sentence) {

		if (sentence == null) {
			return "INVALID";
		}
		if (sentence == "") {
			return "";
		}
		StringBuilder str = new StringBuilder();
		String[] strList = sentence.split(" ");
		for (int i = 0; i < strList.length; i++) {
			StringBuilder part = new StringBuilder(strList[i].trim());
			str.append(part.reverse());
			if (i == strList.length - 1) {
				break;
			}
			str.append(" ");

		}
		return str.toString();

	}
}

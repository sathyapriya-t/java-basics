package com.oops.character;

public class CharRunner {

	public static void main(String[] args) {
		MyChar digit = new MyChar('1');
		MyChar vowel = new MyChar('A');
		MyChar alphabet = new MyChar('a');

		System.out.println(digit.isDigit());
		System.out.println(vowel.isVowel());
		System.out.println(alphabet.isAlphabet());
		System.out.println(digit.isUpperCase());
		System.out.println(digit.isLowerCase());

		MyChar.printUpperCaseAlphabets();
		MyChar.printLowerCaseAlphabets();

	}

}

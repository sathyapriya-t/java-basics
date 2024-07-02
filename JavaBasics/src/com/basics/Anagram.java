package com.basics;

/* Anagram Checker
You are given two strings str1 and str2. 
Your task is to determine if str1 and str2 are anagrams of each other.
An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 For example, the word "listen" is an anagram of "silent", "hello" and "olelh" are anagrams.
You need to implement the areAnagrams(String str1, String str2) method of the StringMagic class, which returns true if str1 and str2 are anagrams of each other, and false otherwise.

Edge conditions:
The comparison should be case insensitive. That is, "Listen" and "Silent" should be considered anagrams.
If either str1 or str2 is null, the method should return false.
The method should also return false if the lengths of str1 and str2 are not the same.

To check whether two strings are anagrams:
Convert the strings to lowercase.
Check if the lengths of the strings are different. If so, return false.
Convert the strings to character arrays.
Sort the character arrays.
If the sorted arrays are equal, return true. Otherwise, return false.
*/

import java.util.Arrays;

public class Anagram {

	public boolean areAnagrams(String str1, String str2) {
		if (str1 == null || str2 == null) {
			return false;
		}
		if (str2.length() == str1.length()) {

			// one using char
			// char[] charArray = str1.toUpperCase().toCharArray();
			// char[] charArray1 = str2.toUpperCase().toCharArray();
			// Arrays.sort(charArray);
			// Arrays.sort(charArray1);
			// boolean op = Arrays.equals(charArray1,charArray);
			// return op;
			String[] charArray = str1.toUpperCase().split("");
			String[] charArray1 = str2.toUpperCase().split("");
			Arrays.sort(charArray);
			Arrays.sort(charArray1);
			boolean isAnagram = Arrays.equals(charArray1, charArray);
			return isAnagram;
		}
		return false;

	}

	public static void main(String[] args) {
		Anagram anagram = new Anagram();
		System.out.println(anagram.areAnagrams("abc", "cba"));
		System.out.println(anagram.areAnagrams("ac", "cba"));

	}
}

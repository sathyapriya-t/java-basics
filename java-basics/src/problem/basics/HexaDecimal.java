package problem.basics;

/*Coding Exercise - Is Hexadecimal String?
In this problem, you are given a class MyString with a String variable str and two methods:
 isHexadecimalChar(char ch) and isHexadecimal().

You have to complete these methods.
A string is considered to be a valid hexadecimal if it only contains digits (0-9) and letters A-F (case-insensitive).
The isHexadecimalChar(char ch) method should return true if the character is a valid hexadecimal character (A-F or a-f) and false otherwise.
The isHexadecimal() method should return true if the string str is a valid hexadecimal string and false otherwise.*/

public class HexaDecimal {

	public String str;

	public HexaDecimal(String str) {
		this.str = str;
	}

	public boolean isHexadecimalChar(char ch) {
		return (ch >= 'a' && ch <= 'f') || (ch >= 'A' && ch <= 'F');
	}

	public boolean isHexadecimal() {
		if (str == null || str == "") {
			return false;
		}
		char[] charArray = str.toCharArray();

		for (char i : charArray) {
			System.out.println(isHexadecimalChar(i));
			if (!isHexadecimalChar(i) && !(i >= '0' && i <= '9')) {
				return false;
			}
		}
		return true;
	}

}
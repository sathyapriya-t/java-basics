package com.oops.character;

public class MyChar {
	private char value;


	public char getValue() {
		return value;
	}


	public void setValue(char value) {
		this.value = value;
	}


	public MyChar(char c) {
		this.value = c; 
		
	}
	public boolean isVowel() {
		if(this.value == 'A' || this.value == 'a' || this.value == 'E' || this.value == 'e' ||this.value == 'I' ||this.value == 'i' ||this.value == 'O' ||this.value == 'o' ||this.value == 'U' ||this.value == 'u') {
			return true;
		}
		return false;
	}

	public boolean isDigit() { // 0 to 9
		if( value >= 48 && value <=57) {
			return true;
		}
		return false;
	}
	public boolean isAlphabet() { // 0 to 9
		if( isUpperCase() ||isLowerCase() ) {
			return true;
		}
		return false;
	}
	public boolean isUpperCase() { // 0 to 9
		if( value >= 65 && value <= 90) {
			return true;
		}
		return false;
	}
	public boolean isLowerCase() { // 0 to 9
		if( value >= 97 && value <= 112) {
			return true;
		}
		return false;
	}


	public static void printUpperCaseAlphabets() {
		
		for(int i=65 ; i<=90;i++) {
			System.out.println((char)i);

		}
		
	}
    public static void printLowerCaseAlphabets() {
		
		for(int i=97 ; i<=112;i++) {
			System.out.println((char)i);

		}
		
	}
}

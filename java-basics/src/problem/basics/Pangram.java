package problem.basics;

import java.util.HashMap;
import java.util.Map;

public class Pangram {
	public static void main(String[] args) {
		String str = "athyaqwertyuiopasdfghghjklzxcvbnm";
		usingCharArrayAndMap(str);
		
		usingStringCharacterAndOperators(str);
	}

	private static void usingStringCharacterAndOperators(String str) {
		if( allAlphabets(str)) {
			System.out.println("Yes, Its a pangram");
		}
		else {
			System.out.println("No, its not a pangram");
		}
	}

	private static boolean allAlphabets(String str) {
		boolean isPangram = true;
		String lowerCaseString = str.toLowerCase();
		for(char ch ='a'; ch <='z'; ch++) {
			if(!lowerCaseString.contains(String.valueOf(ch))) {
				isPangram = false;
				break;
			}
			
		}
		return isPangram;
	}

	private static void usingCharArrayAndMap(String str) {
		char[] charArray = str.toLowerCase().toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		int count = 1;
		for(char ch : charArray) {
			if(Character.isAlphabetic(ch)) {
				map.put(ch,count);
			}
		}
		if(map.size() == 26) {
			System.out.println("Yes, its a panagram");
		}
		else {
			System.out.println("Its not a panagram");
		}
	}

}

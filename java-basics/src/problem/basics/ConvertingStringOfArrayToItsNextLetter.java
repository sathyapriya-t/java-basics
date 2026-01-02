package problem.basics;

public class ConvertingStringOfArrayToItsNextLetter {

	public static void main(String[] args) {
		String str = "asdf";
		char[] charArray = str.toCharArray();
		String result = "";
		for(char c : charArray) {
			if( c == 'z') {
				result +='a';
			}
			else if(c =='Z'){
				result +='A';
			}
			else {
				result += (char) (c +1);
			}
	}
		System.out.println(result);

}}

	

package oops.string;

public class StringUtilityMethods {

	public static void main(String[] args) {
		
		//Formatted method
		String str = "sathya is %d";
		System.out.println(str.formatted(22));
		
		//Lines method - returns stream of lines
		String str1 = "sathya\npriya\nThangavel";
		str1.lines().forEach(System.out::println);
		
		//Transform(Function) - > take a function and retuns the transfortion of applied function
		String str3 = "sathya";
		System.out.println(str3.transform(val -> val.repeat(5)));



	}

}

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

		
		int[] num = { 10,2, 11,7, 15 };
		int target = 9;
		for(int i = 0;i < num.length -1;i++) {
			int m = num[i] + num[i+1];
			if(m == target) {
				System.out.println(" yes");
			}
		}


	}

}

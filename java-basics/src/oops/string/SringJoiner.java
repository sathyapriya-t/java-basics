package oops.string;

import java.util.StringJoiner;

public class SringJoiner {
	public static void main(String[] args) {
		//Introduced in java 8 - used to join string with specific value
		StringJoiner stringJoiner = new StringJoiner(",");
		stringJoiner.add("Sathya");
		stringJoiner.add("Priya");
		stringJoiner.add("Thangavel");
		System.out.println(stringJoiner);
		
		StringJoiner stringJoiner1 = new StringJoiner(",","[","]");
		stringJoiner1.add("Sathya");
		stringJoiner1.add("Priya");
		stringJoiner1.add("Thangavel");
		System.out.println(stringJoiner1);


		
	}

}

package generics;

import java.util.List;

public class BoundedTypeParameter {

	public static void main(String[] args) {
		List<Integer> list = List.of(1,2,4,5,7,7);
		findMax(list);

		List<Double> list1 = List.of(1.0,2.0,4.0,5.0,7.0,7.0);
		findMax(list1);
	}

	// using extend keyword to get the integer
	private static <T extends Number & Comparable<T>> void findMax(List<T> list) {
		T max = list.stream().distinct().max((i, j) -> i.compareTo(j) ).orElse(null);
		System.out.println("Max: " + max);
	}

}

package problem.basics;

import java.util.Collections;
import java.util.List;

public class CountListOfOnes {
	public static void main(String[] args) {
		List<Integer> list = usingForEach();

		usingStreams(list);

		usingCollections(list);

	}

	private static void usingCollections(List<Integer> list) {
		System.out.println(Collections.frequency(list, 1));
	}

	private static void usingStreams(List<Integer> list) {
		long count2 = list.stream().filter(val -> val.equals(1)).count();
		System.out.println("Count: " + count2);
	}

	private static List<Integer> usingForEach() {
		List<Integer> list = List.of(1, 0, 0, 1, 1, 1, 0, 0, 0, 0);
		int count = 0;
		for (Integer integer : list) {
			if (integer.equals(1)) {
				count++;
			}
		}
		System.out.println("Count: " + count);
		return list;
	}

}

package problem.streams;

import java.util.Comparator;
import java.util.List;

public class SortingValues {
	public static void main(String[] args) {
		List<Integer> list = List.of(12,3,4,5,7,2,3,4,6,6,88,99,45);
		sortingUsingAcendingOrder(list);
		sortingDecendingOrder(list);
		List<String> list1 = List.of("sathya", "sathya,","priya");
		sortingBasedOnLengthDecendingOrder(list1);
	}

	private static void sortingDecendingOrder(List<Integer> list) {
		list.stream().sorted(Comparator.reverseOrder()).forEach(i -> System.out.println(i));
	}
	private static void sortingBasedOnLengthDecendingOrder(List<String> list) {
		list.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(i -> System.out.println(i));
	}

	private static void sortingUsingAcendingOrder(List<Integer> list) {
		System.out.println("Sorting!! " + list.stream().sorted(Comparator.naturalOrder()).toList());
	}
	

}

package problem.streams;

import java.util.Comparator;
import java.util.List;

public class SortToListOfStrings {

	public static void main(String[] args) {
		// Sort a list of strings according to the increasing order of their length
		// Write a Java 8 program to sort a given list of strings according to the
		// increasing order of their length.
		
		List<String> list = List.of("sathya","priya","Arun","Kumar");
		len(list);
		lenUsingComparator(list);

	}

	private static void lenUsingComparator(List<String> list) {
		List<String> list2 = list.stream().sorted(Comparator.comparingInt(String::length)).toList();
		System.out.println("list2: "+list2);
	}

	private static void len(List<String> list) {
		List<Integer> list2 = list.stream().map(str -> str.length()).sorted(Comparator.reverseOrder()).toList();
		System.out.println("list of strings with len: "+ list2);
	}

}

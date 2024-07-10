package problem.streams;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FindingDuplicateValuesInList {
	public static void main(String[] args) {
		List<Integer> list = List.of(12, 45, 11, 34, 5, 6, 8, 12, 4, 5);
		// How to find duplicate elements in a given integers list
		// in java using Stream functions?

		findingDuplicateUsingSet(list);
		findingDuplicateUsingGroupingBy(list);
		findingDuplicateValuesUsingGroupingByAndMapping(list);
		
	}

	private static void findingDuplicateValuesUsingGroupingByAndMapping(List<Integer> list) {
		Map<Integer, Long> duplicateMap = list.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()));
		List<Integer> collect = duplicateMap.entrySet().stream().filter(en -> en.getValue() > 1)
				.collect(Collectors.mapping(i -> i.getKey(), Collectors.toList()));
		System.out.println(collect);
		
	}

	private static void findingDuplicateUsingSet(List<Integer> list) {
		Set<Integer> set = new HashSet<Integer>();
		List<Integer> duplicateList = list.stream().filter(num -> !set.add(num)).collect(Collectors.toList());
		duplicateList.forEach(n -> System.out.println("duplicate value: " + n));
	}

	private static void findingDuplicateUsingGroupingBy(List<Integer> list) {
		Map<Integer, Long> duplicateMap = list.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()));
		List<Integer> collect = duplicateMap.entrySet().stream().filter(val -> val.getValue() > 1).map(i -> i.getKey())
				.collect(Collectors.toList());
		System.out.println(collect);
	}

}

package problem.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindingNonRepeatedCharacterInString {

	public static void main(String[] args) {
		// Given a String,
		// find the first non-repeated character in it using Stream functions?

		String str = "SathyaArun";
		nonRepeatedCharUsingMapAndCounting(str);
		usingFunctionIdentity(str);
		usingLinkedHashMap(str);
	}

	private static void usingLinkedHashMap(String str) {
		// LinnkedHashMap - to maintain the insertion order
		// Function.identity() - is a substitute of - i-> i - it takes the value i and
		// Returns the value i
		Character firstNonRepeatedValue = str.toLowerCase().chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(val -> val.getValue() == 1).map(ent -> ent.getKey()).findFirst()
				.orElse(null);
		System.out.println("firstNonRepeatedValue: " + firstNonRepeatedValue);
	}

	private static void usingFunctionIdentity(String str) {
		Character collect = str.chars().mapToObj(c -> Character.toLowerCase((char) c))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(entry -> entry.getValue() == 1).map(val -> val.getKey()).findFirst().get();
		System.out.println("nonRepeatedStr: " + collect);
	}

	private static void nonRepeatedCharUsingMapAndCounting(String str) {
		String[] split = str.toLowerCase().split("");
		List<String> listStr = new ArrayList<String>();
		Collections.addAll(listStr, split);
		List<String> nonRepeatedStr = listStr.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()))
				.entrySet().stream().filter(val -> val.getValue() == 1)
				.collect(Collectors.mapping(result -> result.getKey(), Collectors.toList()));
		System.out.println("nonRepeatedStr: " + nonRepeatedStr);
	}

}

package problem.streams;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindingFirstRepeatedCharacter {

	public static void main(String[] args) {
		String s = "ArunSathya";
		findingRepeatedValueUsingCollect(s);
		findingRepeatedValueUsingCollect("sathy");

	}

	private static void findingRepeatedValueUsingCollect(String s) {
		Character repeatedValue = s.toLowerCase().chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(entry -> entry.getValue()>1).map(ent -> ent.getKey()).findFirst().orElse(null);
		System.out.println("repeatedValue: "+ repeatedValue);
	}

}

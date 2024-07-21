package java8.functionalinterface;

import java.util.List;
import java.util.function.Predicate;

public class PredicateNot {

	public static void main(String[] args) {
		List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// negate()
		System.out.println("isEven using negate() method:");
		predicateNotWithNegateMethod(list);

		// Prediacte.not()
		System.out.println("isEven using Predicate.not(predicate) method:");
		predicateNotWithPredicateNotMethod(list);
	}

	private static void predicateNotWithNegateMethod(List<Integer> list) {
		Predicate<Integer> predicate = (num) -> isEven(num);
		list.stream().filter(predicate.negate()).forEach(System.out::println);
	}

	private static void predicateNotWithPredicateNotMethod(List<Integer> list) {
		list.stream().filter(Predicate.not(PredicateNot::isEven)).forEach(System.out::println);
	}

	private static boolean isEven(Integer num) {
		return num % 2 == 0;
	}

}

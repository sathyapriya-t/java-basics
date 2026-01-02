package java8.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/*
4 type of default FunctionalInterface
Consumer -> accept() -> takes one input and does not return output
Supplier -> get() -> supplies - means doesn't take input but returns output
Function -> apply() -> takes an input and returns an output
Predicate -> test() -> takes an input returns a booleean (condition)
*/

public class DefaultFunctionalInteface {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

		// Predicate
		Predicate<Integer> isEven = (val) -> val % 2 == 0;
		boolean test = isEven.test(10);
		System.out.println(test);

		// Function
		Function<Integer, Integer> square = (val) -> {
			return val * val;
		};
		Integer apply = square.apply(10);
		System.out.println(apply);

		// Consumer
		Consumer<Integer> print = (val) -> {
			System.out.println(val);
		};
		print.accept(10);

		// Supplier
		Supplier<Integer> initialValue = () -> {
			return 0;
		};
		System.out.println(initialValue.get());

		// Applying streams
		System.out.println();
		System.out.println("Applying on streams");
		Integer reduce = list.stream().filter(isEven).map(square).peek(print).reduce(initialValue.get(),
				(val, val1) -> val + val1);
		System.out.println(reduce);
	}

}

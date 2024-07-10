package java8.streams;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class ConsumerImplemantation implements Consumer<Integer> {
	@Override
	public void accept(Integer t) {
		System.out.println(t);
	}
}

class PredicateImplemantation implements Predicate<Integer> {
	@Override
	public boolean test(Integer t) {
		return t % 2 == 0;
	}
}

class FunctionImplemantation implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer t) {
		return t * t;
	}
}

public class FunctionalInterfaceWithStreams {

	public static void main(String[] args) {

		List.of(1, 2, 3, 4, 5, 6).stream().map(val -> val * val).filter(n -> n % 2 == 0)
				.forEach(n -> System.out.println(n));
		List.of(1, 2, 3, 4, 5, 6).stream().map(new FunctionImplemantation()).filter(new PredicateImplemantation())
				.forEach(new ConsumerImplemantation());

		// MethodReference
		List.of(1, 2, 3, 4, 5, 6).stream().filter(n -> FunctionalInterfaceWithStreams.isEven(n))
				.max((n, n1) -> Integer.compare(n, n1));
		List.of(1, 2, 3, 4, 5, 6).stream().filter(FunctionalInterfaceWithStreams::isEven).max(Integer::compare).orElse(0);

	}

	public static boolean isEven(Integer n) {
		return n % 2 == 0;
	}

}

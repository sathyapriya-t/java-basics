package java8.defaultstaticmethods;

import java.util.List;
import java.util.stream.IntStream;

public class MultiplierImpl implements Multipier {

	@Override
	public void multiply(int table, int from, int to) {
		IntStream.range(from, to + 1).forEach(val -> System.out.println(val + " * " + table + " = " + val * table));
	}

	@Override
	public int findListSize(List<Integer> list) {
		System.out.println("inside MultiplierImpl");
		return list.size();

	}

}

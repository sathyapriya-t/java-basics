package com.java8.defaultstaticmethods;

import java.util.List;

public interface Multipier {

	void multiply(int table, int from, int to);

	default int findListSize(List<Integer> list) {
		System.out.println("Inside Multipier");
		return list.size();
	}

	static int multiplyList(List<Integer> list) {
		return list.stream().reduce(1, (val, val1) -> val * val1);
	}

}

package problem.streams;

import java.util.List;

public class CubeAndFilter {

	public static void main(String[] args) {
		// Java 8 program to perform cube on list elements 
		// and filter numbers greater than 500.
	
		List<Integer> list = List.of(21,3,4,66,7,8,9,2,5,6,7,8);
		System.out.println(cubeAndFilter(list));
	}

	private static List<Integer> cubeAndFilter(List<Integer> list) {
		return list.stream().map(val -> val*val*val).filter(val -> val > 500).toList();
	}
}

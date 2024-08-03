package collections.basics;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterableImpl {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,5,3,6,7,8,9,9);
		
		//iterator
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		//forEachRemaining
		iterator.forEachRemaining(System.out::println);
		
		
	}

}

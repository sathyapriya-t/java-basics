package tips;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnonymousClass {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(List.of("sathya", "arun", "priya", "kumar"));

		// Anonymous class - has no name
		// Lambda expression is kind of an Anonymous class
		// old way
		// there are lot of new ways after java 8 - check out
		// src->problem->basics->SortToListOfStrings.class
		Comparator<String> comparator = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return Integer.compare(o1.length(), o2.length());
			}
		};
		list.sort(comparator);
		System.out.println(list);
	}

}

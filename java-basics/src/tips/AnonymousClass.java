package tips;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnonymousClass {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(List.of("sathya","arun","priya","kumar"));
//		list.sort(Comparator.comparing(String::length));
		list.sort(Comparator.comparing(val -> val.length()));

		System.out.println(list);
	}

}

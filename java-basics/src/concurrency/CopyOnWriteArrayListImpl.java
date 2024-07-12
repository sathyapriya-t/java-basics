package concurrency;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListImpl {

	public static void main(String[] args) {
		
		/*
		 * CopyOnWriteArrayList - copys the value and creates the new List everytime if
		 * there is a modification in the list It costly , So it better when we have lot
		 * of reading operation and few modification operation Thread safe Similarly we
		 * have CopyOnWriteArraySet and CopyOnWriteMap
		 * operation are just like normal ArrayList but with More concurrency
		 */
		
		List<String> list = new CopyOnWriteArrayList<String>();
		list.add("sathya");
		list.add("Priya");
		list.add("Arun");
		list.add("Kumar");
		list.add("Jeeva");

		for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
			String string = iterator.next();
			System.out.println(string);
		}
	}

}

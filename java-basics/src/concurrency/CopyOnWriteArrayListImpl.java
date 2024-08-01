package concurrency;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListImpl {

	public static void main(String[] args) {

		/*
		 * CopyOnWriteArrayList - copys the value and creates the new List everytime if
		 * there is a modification in the list It costly , So it better when we have lot
		 * of reading operation and few modification operation Thread safe Similarly we
		 * have CopyOnWriteArraySet and CopyOnWriteMap operation are just like normal
		 * ArrayList but with More concurrency
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

		// fail fast
		
		List<String> list1 = new ArrayList<String>();
		list1.add("sathya");
		list1.add("Priya");
		list1.add("Arun");
		list1.add("Kumar");
		list1.forEach(val -> {
			System.out.println("Trying to Add .......");
			// here trying to add in the list while looping it
			// list1.add("ujsg");

		});

		// fail safe
		
		// Hear comes the CopyOnWriteArrayList - thread safe
		list.forEach(val -> {
			System.out.println("Added ");
			// here trying to add in the list while looping it
			list.add("ujsg");

		});

	}

}

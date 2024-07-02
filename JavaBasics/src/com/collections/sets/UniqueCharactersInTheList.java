package com.collections.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UniqueCharactersInTheList {

	public static void main(String[] args) {
		List<Character> list = List.of('a','n','a','c','A');
		List<Integer> list1 = List.of(1,2,52,4,6,3);
		Set<Character> charSet1 = new HashSet<Character>(list);
		System.out.println("In random order");
		System.out.println(charSet1);
		
		Set<Character> charSet2 = new LinkedHashSet<Character>(list);
		System.out.println("In correct order");
		System.out.println(charSet2);

		Set<Character> charSet3 = new TreeSet<Character>(list);
		System.out.println("In Sorted order");
		System.out.println(charSet3);
		
		TreeSet<Integer> charSet4 = new TreeSet<>(list1);

		System.out.println(charSet4);
		System.out.println(charSet4.headSet(4));
		System.out.println(charSet4.tailSet(4));
	}

}

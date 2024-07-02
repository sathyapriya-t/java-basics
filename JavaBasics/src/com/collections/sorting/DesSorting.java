package com.collections.sorting;

import java.util.Comparator;

public class DesSorting implements Comparator<Student> {
	@Override
	public int compare(Student student1, Student student2) {
		return Integer.compare(student2.getId(), student1.getId());
	}

}

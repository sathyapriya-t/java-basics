package com.oops.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getListOfMarks() {
		return listOfMarks;
	}

	public void setListOfMarks(int[] listOfMarks) {
		this.listOfMarks = listOfMarks;
	}

	private int[] listOfMarks;

	// int ...VARIABLE ARGUMENT should be the last parameter
	public Student(String name, int... listOfMarks) {
		this.name = name;
		this.listOfMarks = listOfMarks;
	}

	public int sumOfMarks() {
		int sum = 0;
		for (int i : listOfMarks) {
			sum = sum + i;
		}
		return sum;
	}

	public int getMaximumMarks() {
		int max = 0;
		for (int i : listOfMarks) {
			if (max < i) {
				max = i;
			}
		}
		return max;
	}

	public BigDecimal getAverageMarks() {
		BigDecimal avarage = new BigDecimal(sumOfMarks()).divide(new BigDecimal(listOfMarks.length), 3,
				RoundingMode.UP);
		return avarage;
	}

}

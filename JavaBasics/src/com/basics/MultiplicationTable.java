package com.basics;

public class MultiplicationTable {

	public void generateTable(int table, int times) {
		for (int i = 1; i <= times; i++) {
			System.out.printf("%d * %d = %d", i, table, i * table).println();

		}
	}

	public static void main(String[] args) {
		MultiplicationTable five = new MultiplicationTable();
		five.generateTable(5, 10);
		MultiplicationTable ten = new MultiplicationTable();
		ten.generateTable(10, 100);

	}

}

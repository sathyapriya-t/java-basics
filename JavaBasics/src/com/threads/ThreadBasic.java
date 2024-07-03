package com.threads;

// Two types:
// 1. Extend Thread class
// 2. Implement Runnable interface
class Task1 extends Thread {
	public void run() { // Signature
		System.out.println("Task 1 starting!! ");
		for (int i = 0; i < 100; i++) {
			System.out.print(i * 10 + " ");
		}
		System.out.println("Task 1 ending");
	}
}

class Task2 implements Runnable {

	@Override
	public void run() {
		System.out.println("Task 2 starting!! ");
		for (int i = 10; i < 200; i++) {
			System.out.print(i * 10 + " ");
		}
		System.out.println("Task 2 ending");
	}
}

public class ThreadBasic {

	public static void main(String[] args) {

		System.out.println("Main starting");
		// Task1
		Task1 task1 = new Task1();
		task1.start(); // nor task.run() -> mistake

		// task2
		Task2 task2 = new Task2();
		Thread thread = new Thread(task2); // Extra step - creating object of thread
		thread.start(); // nor task.run() -> mistake

		// task3
		System.out.println("Task 3 starting!! ");
		for (int i = 20; i < 300; i++) {
			System.out.print(i * 10 + " ");
		}
		System.out.println("Task 3 ending");

	}

}

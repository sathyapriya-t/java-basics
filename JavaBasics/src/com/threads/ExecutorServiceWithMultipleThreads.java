package com.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {
	private int num;

	// Constructor to take values
	public Task(int num) {
		this.num = num;
	}

	// Signature
	public void run() {
		System.out.println("\nTask" + num + " starting!! ");
		for (int i = num; i < num * 100 + 99; i++) {
			System.out.print(i * 10 + " ");
		}
		System.out.println("\nTask" + num + " ending");
	}
}

public class ExecutorServiceWithMultipleThreads {

	public static void main(String[] args) {

		// Creating with multiple threads
		ExecutorService executorService = Executors.newFixedThreadPool(2); // 2 means 2 threads

		// Execution
		executorService.execute(new Task(1));
		executorService.execute(new Task(2));
		executorService.execute(new Task(3));
		executorService.execute(new Task(4));
		executorService.execute(new Task(5));
		executorService.execute(new Task(6));
		// ShutDown
		executorService.shutdown();
	}

}

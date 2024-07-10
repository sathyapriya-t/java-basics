package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExcecutorService {

	public static void main(String[] args) {

		// ExecutorService - Control and Manipulate Threads
		// Creation
		ExecutorService executorService = Executors.newSingleThreadExecutor();

		// Execution
		// Task 1
		executorService.execute(new Task1()); // Executing task one

		// Task 2- here we new thread because we implemented it with runnable interface
		executorService.execute(new Thread(new Task2())); // -> This will wait for task one to complete
															// and then it will start

		// Task 3
		System.out.println("Task 3 starting!! ");
		for (int i = 20; i < 300; i++) {
			System.out.print(i * 10 + " ");
		}
		System.out.println("Task 3 ending");

		// ShutDown
		executorService.shutdown();
	}

}

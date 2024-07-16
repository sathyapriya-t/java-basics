package threads;

/*thread types 
Deamon thread - infrastructure thread
Non Deamon thread OR User thread - threads that aren't infra thread 

 Two types to create Thread implementation:
 1. Extend Thread class
 2. Implement Runnable interface

 STATES OF THREAD:
 1.NEW - when a object of the thread is created
 2.RUNNABLE - When one thread is running and its waiting for the other to do some operation
 3.RUNNING - When the thread is running(doing some operation/ printing)
 4.BLOCKED/WAITING - When a thread is waiting for some data from another thread
 5.TERMINATED/DEAD - When the thread is completed it job.

MIN_PRIOROTY = 1
MAX_PRIORITY = 10
NORM_PRIORITY = 5(Default)

join() - waiting for one tread to complete
*/

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

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Main starting");
		// Task1
		Task1 task1 = new Task1();
		task1.setPriority(1);
		task1.start(); // nor task.run() -> mistake
		Thread.sleep(1000);

		// task2
		Task2 task2 = new Task2();
		Thread thread = new Thread(task2); // Extra step - creating object of thread
		thread.setPriority(10);
		thread.start(); 
		Thread.yield();// nor task.run() -> mistake

		// task3
		task1.join();
		System.out.println("Task 3 starting!! ");
		for (int i = 20; i < 300; i++) {
			System.out.print(i * 10 + " ");
		}
		System.out.println("Task 3 ending");

	}

}

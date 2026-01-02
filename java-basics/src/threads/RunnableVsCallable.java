package threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//Both callable and Runnable are functional Interface -> we can implemented using lambda expression
//Callable - used when a thread retuns a value
//Runnabke - used when a thread does not return anything

public class RunnableVsCallable {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		Runnable run = () -> {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Running thread1");
		};

		Callable<String> callable = () -> {
			Thread.sleep(1000);
			System.out.println("Running thread2");
			return "Hello ";
		};

		// Without Exceutor service
		new Thread(run).start();

		// Executor Service - uesed to manipulate threads
		ExecutorService service = Executors.newFixedThreadPool(10);

		// Runnable
		service.submit(run);

		// Callable - returns value
		Future<String> submit = service.submit(callable);
		System.out.println(submit.get());

	}
}

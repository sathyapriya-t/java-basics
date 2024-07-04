package com.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//Callable Interface is for when a thread returns a value
class CallableTask implements Callable<String> {

	private String name;

	public CallableTask(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "Hello " + name + ", Welcome to coding!!";
	}

}

public class CallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		// Creation
		ExecutorService executorService = Executors.newFixedThreadPool(1);

		// here we will use submit for callable
		// it will return the Future<String> -> a promise that it will return a string
		Future<String> submit = executorService.submit(new CallableTask("Sathya")); // submit method here not execute

		// thread is processed
		System.out.println("(new CallableTask(\"Sathya\") is done");

		// we can get the string using get method
		String result = submit.get();
		System.out.println("result: " + result);

		executorService.shutdown();
		System.out.println("Main Completed");

	}

}

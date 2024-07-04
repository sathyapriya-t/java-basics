package com.threads;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTaskWithMultipleValue implements Callable<String> {

	private String name;

	public CallableTaskWithMultipleValue(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(100);
		return "Hello " + name + ", Welcome to coding!!";
	}

}

public class CallableRunnerWithAnyOfMultiplevalues {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// Creation
		ExecutorService executorService = Executors.newFixedThreadPool(3);

		List<CallableTask> resultList = List.of(new CallableTask("sathya"), new CallableTask("priya"),
				new CallableTask("Arun"), new CallableTask("kumar"));

		// here we will use invokeAny method for callable - it takes collection
		// it will return the String
		String submit = executorService.invokeAny(resultList); // invokeAny method here - not execute/submit

		// thread is processed
		System.out.println("(new CallableTask(\"Sathya\") is done");

		// we can get the string using get method
		System.out.println("result: " + submit);

		executorService.shutdown();
		System.out.println("Main Completed");
	}
}

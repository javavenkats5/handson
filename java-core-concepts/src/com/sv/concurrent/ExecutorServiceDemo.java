package com.sv.concurrent;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**Java 5 added a new Java package to the Java platform, the java.util.concurrent package. 
 * http://tutorials.jenkov.com/java-util-concurrent/executorservice.html
 * @author Venkatesh
 *
 * 3 ways to execute:
	1.ExecutorService executorService1 = Executors.newSingleThreadExecutor();
	2.ExecutorService executorService2 = Executors.newFixedThreadPool(10);
	3.ExecutorService executorService3 = Executors.newScheduledThreadPool(10);
	
	
methods:
	1.execute(Runnable)
	2.submit(Runnable)
	3.submit(Callable)
	4.invokeAny(...)
	5.invokeAll(...)
 */
public class ExecutorServiceDemo {

	public static void main(String[] args) {
		
		try {
			
			executeDemo();
			submitRunnableDemo();
			submitCallableDemo();
			invokeAnyDemo();
			invokeAllDemo();
			Stack<String> stk=new Stack<>();
			stk.push("");
			stk.pop();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}

	private static void invokeAllDemo() throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newSingleThreadExecutor();

		Set<Callable<String>> callables = new HashSet<Callable<String>>();

		callables.add(new Callable<String>() {
		    public String call() throws Exception {
		        return "Task 1";
		    }
		});
		callables.add(new Callable<String>() {
		    public String call() throws Exception {
		        return "Task 2";
		    }
		});
		callables.add(new Callable<String>() {
		    public String call() throws Exception {
		        return "Task 3";
		    }
		});

		List<Future<String>> futures = executorService.invokeAll(callables);

		for(Future<String> future : futures){
		    System.out.println("future.get = " + future.get());
		}

		executorService.shutdown();
		
	}

	private static void invokeAnyDemo() throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newSingleThreadExecutor();

		Set<Callable<String>> callables = new HashSet<Callable<String>>();

		callables.add(new Callable<String>() {
		    public String call() throws Exception {
		        return "Task 1";
		    }
		});
		callables.add(new Callable<String>() {
		    public String call() throws Exception {
		        return "Task 2";
		    }
		});
		callables.add(new Callable<String>() {
		    public String call() throws Exception {
		        return "Task 3";
		    }
		});

		String result = executorService.invokeAny(callables);

		System.out.println("result = " + result);

		executorService.shutdown();
		
	}

	private static void submitCallableDemo() throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		Future future = executorService.submit(new Callable(){
		    public Object call() throws Exception {
		        System.out.println("Asynchronous submitCallableExample");
		        return "Callable Result";
		    }
		}); 

		System.out.println("future.get() = " + future.get());
		executorService.shutdown();
	}

	private static void executeDemo() {
		ExecutorService executorService = Executors.newSingleThreadExecutor();

		executorService.execute(new Runnable() {
		    public void run() {
		        System.out.println("Asynchronous execute task");
		    }
		});

		executorService.shutdown();
		
	}

	private static void submitRunnableDemo() throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		Future future = executorService.submit(new Runnable() {
		    public void run() {
		        System.out.println("Asynchronous submit task");
		    }
		});
 
		future.get();  //returns null if the task has finished correctly.
		executorService.shutdown();
	}

}

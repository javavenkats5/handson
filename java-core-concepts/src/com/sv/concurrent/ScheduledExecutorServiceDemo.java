package com.sv.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * http://tutorials.jenkov.com/java-util-concurrent/scheduledexecutorservice.html
 * @author Venkatesh
 * methods:
	1.schedule (Callable task, long delay, TimeUnit timeunit)
	2.schedule (Runnable task, long delay, TimeUnit timeunit)
	3.scheduleAtFixedRate (Runnable, long initialDelay, long period, TimeUnit timeunit)
	4.scheduleWithFixedDelay (Runnable, long initialDelay, long period, TimeUnit timeunit)
 */
public class ScheduledExecutorServiceDemo {

	public static void main(String[] args) {

		try {
			scheduleDemo();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}

	private static void scheduleDemo() throws InterruptedException, ExecutionException {
		ScheduledExecutorService scheduledExecutorService =
		        Executors.newScheduledThreadPool(5);

		ScheduledFuture scheduledFuture =
		    scheduledExecutorService.schedule(new Callable() {
		        public Object call() throws Exception {
		            System.out.println("Executed after 2 secs!");
		            return "Called!";
		        }
		    },
		    2,
		    TimeUnit.SECONDS);
		
		System.out.println("result = " + scheduledFuture.get());
		scheduledExecutorService.shutdown();
	}

}

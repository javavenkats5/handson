package com.sv.concurrent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;

/**
 *
 */

//Main class
public class SchedulerMain {
	public static void main(String args[]) throws InterruptedException {

		Timer time = new Timer(); // Instantiate Timer Object
		ScheduledTask st = new ScheduledTask(); // Instantiate SheduledTask class
		time.schedule(st, 0, 1000); // Create Repetitively task for every 1 secs
		//for demo only.
		for (int i = 0; i <= 5; i++) {
			System.out.println("Execution in Main Thread...." + i);
			Thread.sleep(2000);
			if (i == 5) {
				System.out.println("Application Terminates");
				System.exit(0);
			}
		}
	}
}

class MyMap<K,V>{
	K key;
	V v;
}
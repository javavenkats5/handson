package com.sv.concurrent.queues;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {

			    private static final int CAPACITY = 1024;

				public static void main(String[] args) throws Exception {

			        BlockingQueue queue = new ArrayBlockingQueue(CAPACITY);

			        Producer producer = new Producer(queue);
			        Consumer consumer = new Consumer(queue);

			        new Thread(producer).start();
			        new Thread(consumer).start();

			        Thread.sleep(4000);
			    }
			}	
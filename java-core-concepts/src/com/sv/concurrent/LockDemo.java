package com.sv.concurrent;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * http://tutorials.jenkov.com/java-util-concurrent/lock.html
 * @author Venkatesh
 *
 *
 *
 *methods
	lock()
	lockInterruptibly()
	tryLock()
	tryLock(long timeout, TimeUnit timeUnit)
	unlock()
 */
public class LockDemo {

	public static void main(String[] args) {

		ReadWriteLock readWriteLock = new ReentrantReadWriteLock();


		readWriteLock.readLock().lock();

		    // multiple readers can enter this section
		    // if not locked for writing, and not writers waiting
		    // to lock for writing.

		readWriteLock.readLock().unlock();


		readWriteLock.writeLock().lock();

		    // only one writer can enter this section,
		    // and only if no threads are currently reading.

		readWriteLock.writeLock().unlock();
	}

}

package concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*if any method is synchronized, all the method will run in a single thread
  it will significantly affect the performance

 To solve That we will use Lock with ReentrantLock
 we can use these in the synchronized methods instead of that keyword
 First lock and unlock
 
*/

public class BiCounterWithLocks {
	private int inc = 0;
	private int dec = 100;

	Lock lockForIncrement = new ReentrantLock();
	Lock lockForDecrement = new ReentrantLock();

	public int getDec() {
		return dec;
	}

	public int getInc() {
		return inc;
	}

	synchronized void increment() {
		// this is not thread safe
		// get i
		// increment
		// set i

		lockForIncrement.lock(); // get the lock
		inc++;
		lockForIncrement.unlock(); // release the lock
	}

	synchronized void decrement() {
		// this is not thread safe
		// get i
		// increment
		// set i

		lockForDecrement.lock(); // get the lock
		dec--;
		lockForDecrement.unlock(); // release the lock

	}
}

package concurrency;

// if any method is synchronized, all the method will run in a single thread
// it will significantly affect the performance

public class BiCounter {
	private int inc = 0;
	private int dec = 100;

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
		inc++;
	}

	synchronized void decrement() {
		// this is not thread safe
		// get i
		// increment
		// set i
		dec--;
	}

}

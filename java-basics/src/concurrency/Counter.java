package concurrency;

public class Counter {
	private int inc = 0;

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

}

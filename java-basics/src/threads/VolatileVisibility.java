package threads;

public class VolatileVisibility {

	public static void main(String[] args) {

		/*
		 * Volatile - visible to all the threads there is one problem in multithreading
		 * if one thread starts and takes some time to process and the seconed thread
		 * depends on the first thread to implement but before the first thread
		 * implements second one starts and the thread two will not get the value which
		 * is done by first thread thats where the volatile keyword comes
		 */

		Flag flag = new Flag();
		new Thread(() -> {
			try {
				System.out.println("thread one start");
				Thread.sleep(1000);
				flag.setFlag(true);
				System.out.println("Thread 1 completed");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}).start();

		new Thread(() -> {
			try {
				System.out.println("thread Two start");
				System.out.println(flag.isFlag());
				while (!flag.isFlag()) {
					// impl
				}
				System.out.println("Thread 2 completed");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}).start();

	}

}

package threads;

public class VolatileVisibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flag flag = new Flag();
		new Thread(()-> {
			try {
				System.out.println("thread one start");
				Thread.sleep(1000);
				flag.setFlag(true);
				System.out.println("Thread 1 completed");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}).start();
		
		new Thread(()-> {
			try {
				System.out.println("thread Two start");
				System.out.println(flag.isFlag());
				while(!flag.isFlag()) {
					//impl
				}
				System.out.println("Thread 2 completed");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}).start();
		

	}

}

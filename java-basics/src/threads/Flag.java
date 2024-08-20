package threads;

public class Flag {
	// volatile - will sync the value in all the threads
	// only applied to variables
	private volatile boolean flag = false;

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}

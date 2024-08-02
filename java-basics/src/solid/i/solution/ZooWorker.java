package solid.i.solution;

public class ZooWorker implements BearCleaner,BearFeeder{

	@Override
	public void feedBear() {
		System.out.println("Bear is fed");
		
	}

	@Override
	public void cleanBear() {
		System.out.println("Bear is Cleaned");

	}

}

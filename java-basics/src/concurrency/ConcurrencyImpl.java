package concurrency;

public class ConcurrencyImpl {

	public static void main(String[] args) {
		Counter count = new Counter();
		count.increment();
		System.out.println(count.getInc());
		
		BiCounter biCounter = new BiCounter();
		biCounter.decrement();
		biCounter.increment();
		System.out.println(biCounter.getInc());
		System.out.println(biCounter.getDec());

	}

}

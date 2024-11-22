package multithreading;

public class CounterMain {

	public static void main(String[] args) {
		
		Counter counter1 = new Counter();
		CounterThread1 r1 = new CounterThread1(counter1);
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		t1.start();
		t2.start();

	}

}

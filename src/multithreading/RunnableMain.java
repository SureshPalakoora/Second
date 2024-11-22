package multithreading;

public class RunnableMain {

	public static void main(String[] args) {
		RunnableEx r1 = new RunnableEx();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		Thread t3 = new Thread(r1);
		t1.start();
		t2.start();
		t3.start();
		

	}

}

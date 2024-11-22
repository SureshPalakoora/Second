package multithreading;

public class ThreadEx extends Thread {

	
	public void run()
	{
		for(int i=0;i<10;i++) {
			try
			{
				Thread.sleep(100);
				System.out.println("Thread "+Thread.currentThread().getName()+" is running");
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		
		
	}
	public static void main(String[] args) {
		
		ThreadEx t1 = new ThreadEx();
		t1.start();
		ThreadEx t2 = new ThreadEx();
		t2.start();
		
		
		

	}

}

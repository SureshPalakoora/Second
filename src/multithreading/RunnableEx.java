package multithreading;

public class RunnableEx implements Runnable {
	
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

}

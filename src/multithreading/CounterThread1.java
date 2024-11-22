package multithreading;

public class CounterThread1 implements Runnable {
	
	private Counter counter;
	
	
	public CounterThread1(Counter counter)
	{
		this.counter=counter;
	}
	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Thread "+Thread.currentThread().getName()+" is running");
			try
			{
				Thread.sleep(100);
				counter.incrementCounter();
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			 System.out.println("In Thread "+Thread.currentThread().getName());
			counter.incrementCounter();
			System.out.println("CounterValue is "+counter.getCounter());
		}
	}

}

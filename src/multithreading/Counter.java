package multithreading;

public class Counter {

	private int counter=0;
	
	public void incrementCounter()
	{
		synchronized(this)
		{
			counter++;
		}
		
	}
	
	public int getCounter()
	{
		return counter;
	}
}

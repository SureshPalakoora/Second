package dmloops;

public class Factors {
	
	public static void main(String[] args)
	{
		int number = 48;
		
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
			{
				System.out.print(i+" ");
			}
		}
	}

}

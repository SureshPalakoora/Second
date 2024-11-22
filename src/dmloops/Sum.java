package dmloops;

public class Sum {

	static int findSum(int n)
	{
		if(n<=1)
		{
			return 1;
		}
		return n+findSum(n-1);
	}
	public static void main(String[] args) {
		
		int sum=0;
		for(int i=0;i<=10;i++)
		{
			sum=sum+i;
		}

		System.out.println(sum);
		
		int number=10;
		int sumR= findSum(number);
		System.out.println(sumR);
	}

}

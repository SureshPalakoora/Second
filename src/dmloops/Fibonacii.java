package dmloops;

import java.util.Scanner;

public class Fibonacii {

	static int findFibonacii(int n)
	{
		int a=0,b=1;
		int fib=0;
		if(n<=1)
		{
			return n;
		}
		for(int i=2;i<=n;i++)
		{
			fib=a+b;
			a=b;
			b=fib;	
		}
		return fib;
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of terms");
		int n = scan.nextInt();
		scan.close();
		
		
		int firstTerm=0,secondTerm=1;
		
		
		for(int i=0;i<=n;i++)
		{
			System.out.print(firstTerm+" ");
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
		System.out.println();
		int fibonacii = findFibonacii(n);
		System.out.println("The Fibonacii of "+n+" i.e. f("+n+") is "+fibonacii);

	}

}

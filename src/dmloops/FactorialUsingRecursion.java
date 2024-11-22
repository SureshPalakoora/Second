package dmloops;

import java.util.Scanner;

public class FactorialUsingRecursion {

	
	static long findFactorial(int number)
	{
		if(number<1)
		{
			return 1;
		}
		else
			return number*findFactorial(number-1);
		
	}
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.close();
		
		long factorial = findFactorial(number);
		System.out.println(factorial);

	}

}

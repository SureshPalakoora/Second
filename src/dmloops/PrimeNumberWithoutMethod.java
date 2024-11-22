package dmloops;

import java.util.Scanner;

public class PrimeNumberWithoutMethod {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check");
		int number = scan.nextInt();
		scan.close();
		boolean flag = false;
		
		for(int i=2;i<number;i++)
		{
			if(number%i==0)
			{
				flag=true;
				break;
			}
		}
		
		if(!flag)
		{
			System.out.println("Prime Number");
		}
		else
			System.out.println("Not a prime number");

	}

}

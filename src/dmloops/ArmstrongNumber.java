package dmloops;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scan.nextInt();
		
		int originalNumber = number;
		
		scan.close();
		
		int temp = number;
		int digits=0;
		
		while(temp!=0)
		{
			temp = temp/10;
			digits++;
		}
		
		int armstrong=0;
		while(number!=0)
		{
			int remainder = number%10;
			armstrong = armstrong +(int)Math.pow(remainder, digits);
			number=number/10;
		}
		
		
		if(originalNumber==armstrong) {
			System.out.println("Given number "+originalNumber+" is an armstrong number");
		}
			else {
				System.out.println("Not an armstrong number");
		}
		

		
	}

}

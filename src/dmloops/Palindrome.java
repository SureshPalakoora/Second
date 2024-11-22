package dmloops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check");
		int number=scan.nextInt();
		scan.close();
		
		int originalNumber = number;
		int reverse=0;
		while(number>0)
		{
		  int remainder = number%10;
		  reverse = (reverse*10)+remainder;
		  number = number/10;
		}
		
		if(originalNumber==reverse)
		{
			System.out.println("Given number "+originalNumber+ " is a palindrome");
		}
		else
			System.out.println("not a palindrome");

	}

}

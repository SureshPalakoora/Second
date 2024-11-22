package dmloops;

import java.util.Scanner;

public class PositiveNegativeNumber {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		double number = scan.nextDouble();
		scan.close();
		
		if(number>0.0)
		{
			System.out.println("Positive");
		}
		else if(number<0.0)
		{
			System.out.println("Negative");
		}
		else
			System.out.println("Zero");

	}

}

package basics;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		scan.close();
		
		if(num%2==0)
		{
			System.out.println("Even number");
		}
		else
			System.out.println("odd number");

	}

}

package basics;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Dividend");
		Double dividend = scan.nextDouble();
		System.out.println("Enter the Divisor");
		Double divisor = scan.nextDouble();
		
		scan.close();
		
		double quotient = dividend/divisor;
		double remainder = dividend%divisor;
		
		System.out.println(quotient);
		System.out.println(remainder);

	}

}

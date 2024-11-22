package basics;

import java.util.Scanner;

public class AddInteger {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter two integers for the addition");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		scan.close();
		
		System.out.println("Addition of two integers "+a+ " and "+b+" is "+(a+b));

	}

}

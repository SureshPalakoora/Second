package dmloops;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter one operator out of +,-,*,/");
		char ch = scan.next().charAt(0);
		System.out.println("Enter two numbers");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int result;
		scan.close();
		
		
		switch(ch)
		{
		case '+':
			result = n1+n2;
			System.out.println("Addition of two numbers "+n1+ " and "+n2+"  is "+result);
			break;
		case '-':
			result = n1-n2;
			System.out.println("Substraction of two numbers "+n1+ " and "+n2+"  is "+result);
			break;
		case '*':
			result = n1*n2;
			System.out.println("Multiplication of two numbers "+n1+ " and "+n2+"  is "+result);
			break;
		case '/':
			result = n1/n2;
			System.out.println("Division of two numbers "+n1+ " and "+n2+"  is "+result);
			break;
			default:
				System.out.println("Enter a valid operator");
		}

	}

}

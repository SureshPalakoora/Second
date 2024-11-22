package dmloops;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		scan.close();
		
		int smallest = (n1>n2)?n2:n1;
		int gcd=1;
		
		for(int i=1;i<=smallest;i++)
		{
			if((n1%i==0) && (n2%i==0))
			{
				gcd=i;
			}
		}
		System.out.println(gcd);
		
		

	}

}

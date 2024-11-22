package dmloops;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		scan.close();
		
		int lcm = (n1>n2)?n1:n2;

		while(true)
		{
			if((lcm%n1==0) && (lcm%n2==0)) {
				System.out.println(lcm);
				break;
			}
			lcm++;
		}
	}

}

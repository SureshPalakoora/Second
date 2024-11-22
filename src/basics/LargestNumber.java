package basics;

import java.util.Scanner;

public class LargestNumber {

	static int findLargest(int n1, int n2, int n3)
	{
		if((n1>n2) && (n1>n3))
		{
			return n1;
		}
		else if ((n2>n1) && (n2>n3))
				{
			        return n2;
				}
		return n3;
	}
	
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter three numbers to check which is the largest number");
	int n1 = scan.nextInt();
	int n2 = scan.nextInt();
	int n3 = scan.nextInt();
	scan.close();
	
	int largest = findLargest(n1,n2,n3);
	System.out.println("Largest of the 3 numbers is "+largest);
	}

}

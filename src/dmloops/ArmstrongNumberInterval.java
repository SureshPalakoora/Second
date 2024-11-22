package dmloops;

import java.util.Scanner;

public class ArmstrongNumberInterval {

	
	 static boolean isArmstrong(int n) {
		
		int temp =n;
		int originalNumber=n;
		int digit = 0;
		int armstrong=0;
		while(temp!=0)
		{
			temp = temp/10;
			digit++;
		}
		
		while(n!=0)
		{
			int remainder = n%10;
			armstrong = armstrong + (int)Math.pow( remainder, digit);
			n=n/10;
		}
		if(originalNumber==armstrong)
		{
			return true;
		}
		return false;
	 }
	public static void main(String[] args) {
		

		for(int i=11;i<=9897;i++)
		{
			if(isArmstrong(i))
			System.out.println(i);
		}
	}

	
}

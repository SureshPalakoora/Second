package dmloops;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String to check");
		String s = scan.next();
		scan.close();
		
		String reversedString = "";
		
	
		for(int i=s.length()-1;i>=0;i--)
		{
			reversedString = reversedString + s.charAt(i);
		}
		
		System.out.println("Reversed String is "+reversedString);
		if(s.equalsIgnoreCase(reversedString))
		{
			System.out.println("palindrome");
		}
		else
			System.out.println("not a palindrome");

	}

}

package dmloops;

import java.util.Scanner;

public class AlphabetCheck {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a character to check");
		char ch = scan.next().charAt(0);
		scan.close();
		
		//if(Character.isAlphabetic(ch))
		if( (ch>='a' && ch<='z') || (ch>='A' && ch<='Z') )
		{
			System.out.println("Given character "+ch+" is an alphabet");
			
		}
		else
			System.out.println("Not a character");
		

	}

}

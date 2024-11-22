package basics;

import java.util.Scanner;

public class CharCount {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a String");
		String s = scan.nextLine();
		System.out.println("Enter a character to count the occurence");
		char ch = scan.next().charAt(0);
		scan.close();
		
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(ch==s.charAt(i))
			{
				count++;
			}
		}
		
		System.out.println("Count of "+ch+" in "+s+" is "+count);

	}

}

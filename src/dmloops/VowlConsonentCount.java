package dmloops;

import java.util.Scanner;

public class VowlConsonentCount {

	public static void main(String[] args) {
		
		
		String str;
		int vowels=0, consonants=0,digits=0,spaces=0;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string to count Vowels and Consonants");
		str=scan.nextLine();
		scan.close();
		
		str = str.toLowerCase();
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				++vowels;
			}
			else if ( ch>='a' && ch<='z')
			{
				++consonants;
			}
			else if (ch>='0' && ch<='9')
			{
				++digits;
			}
			else if ( ch == ' ')
				++spaces;
		}
		

		System.out.println("Vowels count is "+vowels);
		System.out.println("Consonents count is "+consonants);
		System.out.println("Digits count is "+digits);
		System.out.println("spaces count is "+spaces);
		
	}

}

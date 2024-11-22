package basics;

import java.util.Scanner;

public class VowelConstant {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character to check");
		char ch = scan.next().charAt(0);
		scan.close();
		
			switch(ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("Vowel");
		break;
		default:
			System.out.println("consonent");
				
		}

	}

}

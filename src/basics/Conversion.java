package basics;

import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {
		
		char ch='x';
		
	    int a = ch;
	    char ab=(char)a;
		
		System.out.println("Value after directly casting "+a);
		
		
		int cascii = (int)ch;

		System.out.println("Value after using cast "+cascii);
		
		System.out.println(ab);
	
		String s = "23";
		
		int x = Integer.parseInt(s);
		System.out.println(x);
		
		
		char z = 't';
		
		String vz = String.valueOf(z);
		System.out.println(vz);
		
		String value = "How are you";
		char[] carray=value.toCharArray();
		System.out.println(carray);
		for(char element: carray)
		{
			System.out.print(element);
		}
		System.out.println();
		
		boolean b=false;
		String bo = String.valueOf(false);
		System.out.println(bo);
		
		
		int n1 = 23;
		String num = String.valueOf(n1);
		System.out.println(num);
		
		
		String abc = "false";
		
		boolean ba = Boolean.parseBoolean(abc);
		System.out.println(ba);
		
	}

}

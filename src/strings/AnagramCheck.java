package strings;

import java.util.Arrays;

public class AnagramCheck {

	static boolean isAnagram(String s1, String s2)
	{
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(c1.length == c2.length)
		{
			for(int i=0;i<c1.length;i++)
			{
				if(c1[i]==c2[i])
				{
					return true;
				}
				else 
					return false;
			}
		} 
		return false;
		
	}
	public static void main(String[] args) {
		
		String s1 = "how are you";
		String s2 = "are you a";
		
		if(isAnagram(s1,s2))
		{
			System.out.println("Anagrams");
		}
		else
			System.out.println("not anagrams");

	}

}

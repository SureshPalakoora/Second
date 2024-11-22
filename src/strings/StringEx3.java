package strings;

public class StringEx3 {

	public static void main(String[] args) {
		
		String s1 = "How are you doing to see you";
		String s2 = "? Nice ";
		
		int index = 16;
		String newString = "";
		for(int i=0;i<s1.length();i++)
		{
			newString = newString +s1.charAt(i);
			if(i==index)
			{
				newString = newString + s2;
			}
		}
		
		System.out.println(newString);

	}

}

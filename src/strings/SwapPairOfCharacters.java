package strings;

public class SwapPairOfCharacters {

	public static void main(String[] args) {
		
		
		String s = "GeeksforGeeks";
		
		char[] ch = s.toCharArray();
		
		for(int i=0;i<ch.length-1;i=i+2)
		{
			char temp = ch[i];
			ch[i]=ch[i+1];
			ch[i+1]=temp;
		}
		
		String s1 = new String(ch);

		System.out.println(s1);
	}

}

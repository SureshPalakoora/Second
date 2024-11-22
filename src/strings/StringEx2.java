package strings;

public class StringEx2 {

	public static void main(String[] args) {
		String s ="Where are you going ? Fine dine ?";
		
		String[] words = s.split(" ");
		
		for(String word: words)
		{
			if(word.length() %2 ==0)
			{
				System.out.println(word);
			}
		}
		

	}

}

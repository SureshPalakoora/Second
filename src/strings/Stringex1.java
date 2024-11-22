package strings;

public class Stringex1 {

	public static void main(String[] args) {
		
		char c ='?';
		
		String s ="how are you";
		
		String s1 = s+c;
		
		System.out.println(s1);
		
		String s2= "how are you long time no see";
		
		String s3 = s2.substring(0,11)+c+s2.substring(12);
		System.out.println(s3);
		
		String s4 = "This is a good idea ";
		String s5 = "for a better life";
		String s6 = s4.concat(s5);
		System.out.println(s6);

	}

}

package Java8;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceEx {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Suresh","Ramesh","Ravi");
		
		names.forEach(System.out::println);
		
		names.sort(String::compareToIgnoreCase);
		System.out.println(names);
		

	}

}

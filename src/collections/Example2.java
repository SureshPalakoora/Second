package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class Example2 {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<String>();
		list1.add("Java");
		list1.add("Ruby");
		list1.add("Python");
		list1.add(".NET");
		
		ListIterator litr = list1.listIterator();
		
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}

		list1.remove(3);
		list1.remove(2);
		
		
		System.out.println();
		System.out.println("Printing array");
		String[] languages = new String[list1.size()];
		
		list1.toArray(languages);
		
		for(String language: languages)
		{
			System.out.println(language);
		}
		
		System.out.println("Printing using for each");
		list1.forEach((language)->System.out.println(language));
	}

}

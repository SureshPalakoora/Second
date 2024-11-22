package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example3 {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<String>();
		list1.add("a");
		
		
		
		List<String> list2 = new ArrayList<String>();
		list2.add("b");
		
		List<String> joined = new ArrayList<String>();
		
		joined.addAll(list1);
		joined.addAll(list2);
		
		joined.forEach((item)-> System.out.println(item));
		
		
		String j = joined.toString();
		
		System.out.println(j);
		
		
String names = "Ramesh, Suresh, Naresh, Rajesh";
		
		System.out.println("String: "+names);
		
		String[] namesList = names.split(",");
		
		ArrayList<String> listOfNames = new ArrayList<String>(Arrays.asList(namesList));
		
		System.out.println("ArrayList: "+listOfNames);
		
		listOfNames.add("Ajay");
		
		System.out.println("ArrayList: "+listOfNames);
		

	}

}

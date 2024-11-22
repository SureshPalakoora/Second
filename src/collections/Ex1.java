package collections;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;



public class Ex1 {

	public static void main(String[] args) {
		
		String[] names = {"Ajay","Vijay","Ramesh","Suresh"};
		
		List<String> list1 = Arrays.asList(names);
		
		System.out.println(list1);

		
		Iterator<String> itr = list1.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	

		for(String li: list1)
		{
			System.out.println(li);
		}
		
		System.out.println();
		
		for(int i=0;i<list1.size();i++)
		{
			System.out.println(list1.get(i));
		}
		
		System.out.println();
		list1.forEach((list)-> System.out.println(list));
		
		
		List<String> list2 = new ArrayList<String>();
		list2.add("Vinod");
		list2.add("Pramod");
		list2.add("Avinash");
		
		System.out.println(list2);

		
		
	}

}

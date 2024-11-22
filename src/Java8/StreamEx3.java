package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamEx3 {

	public static void main(String[] args) {
		
		 List<String> names = Arrays.asList("Alice","Bob","Charlie","David","Eve");
		 
		 
		 //Using Joining
		 
		 String s1 = names.stream().collect(Collectors.joining());
		 System.out.println(s1);
		 
		 String s2 = names.stream().collect(Collectors.joining(","));
		 System.out.println(s2);
		 
		 String s3 = names.stream().collect(Collectors.joining(",","[","]"));
		 System.out.println(s3);

		 
		 //using grouping by
			
			  Map<Integer,List<String>> nameListLength =
			  names.stream().collect(Collectors.groupingBy(String::length));
			  nameListLength.forEach((key,value)->System.out.println(key+" "+value));
			  
			  Map<Integer,Long> nameListLengthCount =
			  names.stream().collect(Collectors.groupingBy(String::length,Collectors.
			  counting()));
			  nameListLengthCount.forEach((key,value)->System.out.println(key+" "+value));
			 
		 Map<Boolean,List<String>> part = names.stream().collect(Collectors.partitioningBy(s->s.length()>4));
		 System.out.println(part.get(true));
		 System.out.println(part.get(false));
		 
		 
		 Map<Integer,String> toMap = names.stream().collect(Collectors.toMap((n)->n.length(),name->name,(existing,replacement)->existing+" and "+replacement));
		 toMap.forEach((key,value)->System.out.println(key+" "+value));
		 
		 
		 
	}

}

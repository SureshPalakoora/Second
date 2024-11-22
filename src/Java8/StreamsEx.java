package Java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsEx {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Ramesh","Suresh","Ajay","Vijay");
		System.out.println(names);
		
		List<String> namesEnding = names.stream()
				.filter((s)->s.endsWith("ay")).
				collect(Collectors.toList());
		
		namesEnding.forEach(System.out::println);
		
		
		List<Integer> nums = Arrays.asList(1,2,2,5,3,4,5,6,7,8);
		
	Set<Integer> set = new HashSet<>();
		
		nums.stream().filter(n->!set.add(n)).forEach(System.out::println);
		
		nums.stream()
		.filter((n)->n%2==0)
		.map((n)->n*n)
		.forEach(n->System.out.print(n+" "));
		
		System.out.println();
		Optional<Integer> first = nums.stream().findFirst();
		
		if(first.isPresent())
		{
			System.out.println(first.get());
		}
		else
			System.out.println("not present");
	
		//int max = nums.stream().reduce(Integer::max).get();
		int max = nums.stream().max(Integer::compare).get();
		System.out.println(max);

	}

}

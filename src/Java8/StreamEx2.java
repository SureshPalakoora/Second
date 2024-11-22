package Java8;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class StreamEx2 {

	public static void main(String[] args) {
	
		int[] numbers = {3,23523,22,352,52523,62323,123,23523,522};
		
		boolean any = Arrays.stream(numbers).anyMatch((n)-> n>522);
		System.out.println(any);
		
		boolean all = Arrays.stream(numbers).allMatch((n)-> n>522);
		System.out.println(all);
		
		boolean none = Arrays.stream(numbers).noneMatch((n)-> n>522);
		System.out.println(none);
		
		IntStream nums = IntStream.of(1,2,3,4);
		nums.forEach(System.out::print);

		System.out.println();
		IntStream.range(1, 5).forEach(n->System.out.print(n+" "));
		System.out.println();
		IntStream.rangeClosed(1, 5).forEach(n->System.out.print(n+" "));
		System.out.println();
		DoubleStream.iterate(0, n-> n+1).limit(5).forEach(d->System.out.print(d+" "));
		
		System.out.println()
		;
		int result = IntStream.range(1, 6).reduce(0,Integer::sum);
		System.out.println(result);
		
		int result1 = IntStream.rangeClosed(1, 5).reduce(1,(a,b)->a*b);
		System.out.println(result1);
		
	}

}

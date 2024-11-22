package Java8;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Example2 {

	public static void main(String[] args) {
		
		Function<String,Integer> strLength = (s)->s.length();
		int length = strLength.apply("How are you");
		System.out.println(length);
		
		Function<Integer,Integer> square = (a)->a*a;
		int result4 = square.apply(3);
		System.out.println(result4);
		
		BiFunction<Integer,Integer,Integer> func = (a,b)->a+b;
		int result = func.apply(32, 2);
		System.out.println(result);
		
		
		BinaryOperator<Integer> func1 = (a,b)->a*b;
		int result1 = func1.apply(32, 2);
		System.out.println(result1);
		
		IntBinaryOperator func2 = (a,b)->a/b;
		int result2= func2.applyAsInt(36, 6);
		System.out.println(result2);
		
		UnaryOperator<String> upper = (s)->s.toUpperCase();
		String result3 = upper.apply("hi");
		System.out.println(result3);
		
		Predicate<String> isEmpty= (s)->s.isEmpty();
		System.out.println(isEmpty.test("Testing"));
		System.out.println(isEmpty.test(""));
		System.out.println(isEmpty.test(" "));
		
		IntPredicate isEven = (a)->a%2==0;
		boolean rs = isEven.test(33);
		System.out.println(rs);
		

		
		Consumer<String> cs = (s)-> System.out.println(s);
		cs.accept("Hello");
		
		Supplier<Double> random = ()->Math.random();
		Double value =random.get();
		System.out.println(value);
	}

}

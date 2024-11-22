package Java8;

@FunctionalInterface
interface CheckEven
{
	public boolean isEven(int a);
}
public class Example1 {

	public static void main(String[] args) {
	

		MathFunction add = (a,b)-> a+b;
		int result = add.operate(32, 52);
		System.out.println(result);
	
		MathFunction multiply = (a,b)->a*b;
		int mul = multiply.operate(2,3);
		System.out.println(mul);
		
		CheckEven check = (a)-> a%2==0;
		boolean result1 = check.isEven(38);
		System.out.println(result1);
		
		
		MathFunction max = (a,b)-> a>b?a:b;
		int maxnum = max.operate(35, 73);
		System.out.println(maxnum);
	}

}

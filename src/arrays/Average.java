package arrays;

public class Average {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5,6};
		
		double sum=0;
		for(double d: numbers)
		{
			sum = sum+d;
		}
		
		System.out.println(sum);
		
		double average = sum/numbers.length;
		System.out.println(average);

	}

}

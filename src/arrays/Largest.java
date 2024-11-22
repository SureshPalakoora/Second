package arrays;

public class Largest {

	public static void main(String[] args) {
		
		int[] numbers = {234,232,523,2322,22,232,532,533,23222};
		
		int largest = numbers[0];
		
		for(int n:numbers)
		{
			if(n>largest)
			{
			
				largest = n;
				
			}
		}
		
		System.out.println(largest);
	

	}

}

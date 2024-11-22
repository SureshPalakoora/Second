package arrays;

public class SecondLargest {

	public static void main(String[] args) {
		
		int[] numbers = {23,532,22,1134,5322,2112341,1412,141231,2112341};
		
		int largest = numbers[0];
		int secondLargest=numbers[0];
		
		for(int n:numbers)
		{
			if(n>largest)
			{
				secondLargest=largest;
				largest=n;
				
			}
			else if(n>secondLargest && n!=largest)
			{
				secondLargest=n;
			}
		}

		System.out.println(largest);
		System.out.println(secondLargest);
	}

}

package arrays;

public class ValueCheck {

	public static void main(String[] args) {
		
		int[] nums = { 1,3,223,2523,2,232,2342,235423,2342,235232,2,6467453,46323,32463};
		
		int find=5;
		boolean flag=false;
		for(int n:nums)
		{
			if(n==find)
			{
				
				flag=true;
				break;
			}
			else
				flag=false;
		}

		
		if(flag)
		{
			System.out.println("Value found");
		}
		else
			System.out.println("value not found");
	}

}

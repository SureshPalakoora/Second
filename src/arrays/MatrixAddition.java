package arrays;

public class MatrixAddition {

	public static void main(String[] args) {
		int rows=3, cols =2;
		
		int[][] a = {{2,3},{3,4},{5,6}};
		int[][] b = {{5,3},{9,3},{3,2}};
		
		int[][] addition = new int[rows][cols];
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				addition[i][j] = a[i][j] + b[i][j];
			}
		}
		
		for(int[] x: addition) {
			for(int y: x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}

	}

}

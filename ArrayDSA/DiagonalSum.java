package ArrayDSA;

public class DiagonalSum {
	
	/*
	 * Condition for Principal Diagonal: The row-column condition is row = column. 
The secondary diagonal is formed by the elements A03, A12, A21, A30.
Condition for Secondary Diagonal: The row-column condition is row = numberOfRows – column -1
	 */
	 static void printDiagonalSum(int [][]mat,int n)
	 {
		int principal = 0, secondary = 0; 
		for (int i = 0; i < n; i++) 
		{
			principal += mat[i][i];
			secondary += mat[i][n - i - 1]; 
		}

		System.out.println("Principal Diagonal:"+ principal);
         
		System.out.println("Secondary Diagonal:" + secondary);
	 }

	 static int printDiagonalSumsOptimize(int [][]matrix)
	 {
		 int sum=0;
		 for(int i=0;i<matrix.length;i++)
		 {
			 for(int j=0;j<matrix.length;j++)
			 {
				 if(i==j)
				 {
					 sum+=matrix[i][j];
				 }
				 else if(i+j==matrix.length-1)
				 {
					 sum+=matrix[i][j];
				 }
			 }
			 
		 }
		 
		 
		 
//		 //pd
//		 for(int i=0;i<matrix.length;i++)
//		 {
//			 sum+=matrix[i][i];
//			 
//			 if(i!=matrix.length-1-i)
//			 {
//				 sum+=matrix[i][matrix.length-i-1];
//			 }
//		 }
		 return sum;
	 }
	 
	public static void main(String[] args) {
		int [][]a = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 }, 
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 } };

			printDiagonalSum(a, 4);
			printDiagonalSumsOptimize(a);
			System.out.println(printDiagonalSumsOptimize(a));
	}
}

package com.enfy.arraybasic;

public class Array_2D {
	
	public static void twoDarrayprint_1st_method()
	{
		int A[][]=new int[5][5];
        int B[][]={{1,0,0},{0,2,0},{1,0,1}};
        
        int C[][];
        C=new int[3][3];
        
        int []D[]=new int[3][3];
        
        int[] E,F[];
        E=new int[5];		//E is single dim.
        F=new int[5][5];  //F is 2 dimensional , e.g., int[] E,int [] F[]; here F have 2d array but E has one.
        							//if int[] i,j,k,l[]; then l will be 2D and other variable will be 1D
       
        /*
        	for(int i=0;i<B.length;i++)
        	{
        		for(int j=0;j<B.length;j++)
        		{
        			System.out.print(B[i][j]+"");
        		}
        		System.out.println("");
        	}
		*/
        
        for(int x[]:B)
        {
        	for(int y:x)
        	{
        		System.out.print(y);
        	}
        	System.out.println();
        }
        System.out.println("\n");
		
	}

	public static void jaggedArray()
	{
		int A[][];
		
		A=new int[3][];
		
		A[0]=new int[3];
		A[1]=new int[6];
		A[2]=new int[7];
		
		for(int i=0;i<A.length;i++)		
		{
			for(int j=0;j<A[i].length;j++)
			{
				System.out.print(A[i][j]+" ");
			}
			
			System.out.println("");
		}
		
		System.out.println("\n");
		
		for(int x[]:A)
		{
			for(int y:x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
			
		}
	}
	public static void main(String[] args) {
		twoDarrayprint_1st_method();
		jaggedArray();
	}
}

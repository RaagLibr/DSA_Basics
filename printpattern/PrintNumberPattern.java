package com.enfy.printpattern;
import java.util.*;
public class PrintNumberPattern {
	Scanner sc=new Scanner(System.in);
		
	public void invertHalfPyramidWithNumb(int totrow,int totcol)
	{
		System.out.println("write a totrow=");
		totrow=sc.nextInt();
		
		System.out.println("write a totcol=");
		totcol=sc.nextInt();
		
		//outer loop
		for(int i=1;i<=totrow;i++)
		{
			for(int j=1;j<=totcol-i+1;j++)      //value is decreasing at downward , totcol-i+1.
			{
				System.out.print(j+" ");
			}
			
			System.out.println();
			
		}
	}
	
		public void floyedsTriangle(int totrow)
		{
			System.out.println("write a totrow=");
			totrow=sc.nextInt();
			
			int counter=1;
			for(int i=1;i<=totrow;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(counter+" ");
					counter ++;
				}
				System.out.println(" ");
			}
			
			System.out.println();
		}
		
		
		

}

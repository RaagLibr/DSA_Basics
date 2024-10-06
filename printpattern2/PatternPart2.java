package com.enfy.printpattern2;

import java.util.Scanner;

public class PatternPart2 {
	
	Scanner sc=new Scanner(System.in);
	
	public void hollowRectangle(int totrow,int totcol)
	{
		System.out.println("Write totrow:");
		totrow=sc.nextInt();
		System.out.println("Write totcol:");
		totcol=sc.nextInt();
		for(int i=1;i<=totrow;i++)
		{
			for(int j=1;j<=totcol;j++)
			{
				if(i==1||i==totrow||j==1||j==totcol)
				{
					System.out.print("*");
				}
				else
				{
				   System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
	}

	public void starPattern1(int n)
	{
		System.out.println("n = ");
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public void floyd(int n)
	{
		int counter=1;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(counter+" ");
				counter++;
			}
			System.out.println();
		}
		
	}
}

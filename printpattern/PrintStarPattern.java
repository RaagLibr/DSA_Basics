package com.enfy.printpattern;

import java.util.*;

public class PrintStarPattern {
	Scanner sc= new Scanner(System.in);
	
	public  void Pattern1(int n)
	{	
		System.out.println("write a value to print pattern=");
		
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print("* "
						+ "");
			}
			System.out.println(" ");
		}
	}
	
	public  void Pattern2(int n)
	{
		System.out.println("write a value to print pattern=");
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
	
	public void Pattern3(int n)
	{
		System.out.println("write a value to print pattern=");
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
	
	public void Pattern4(int n)
	{
		System.out.println("write a value to print pattern=");
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
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
	
	
	public void Pattern5(int n)
	{
		System.out.println("write a value to print pattern=");
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=i;j<=n;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
	
	public void Pattern6(int n)
	{
		System.out.println("write a value to print pattern=");
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void Pattern7(int n)
	{
		System.out.println("write a value to print pattern=");
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	public void Pattern8(int totRow,int totCol)
	{
		System.out.println("Write a tot row.");
		totRow=sc.nextInt();
		
		System.out.println("Write a tot col.");
		totCol=sc.nextInt();
		
		for(int i=1;i<=totRow;i++)
		{
			for(int j=1;j<=totCol;j++)
			{
				if(i==1 || i==totRow || j==1 || j==totCol)
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

}

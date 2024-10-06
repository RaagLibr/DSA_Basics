package com.enfy.printseries;
import java.util.*;
public class ArithmaticSeries {
	Scanner sc=new Scanner(System.in);
	
	
	public int sumOfSeries1(int n)
	{
		System.out.println("write a value for n =");
		n=sc.nextInt();
		for(int i=1,a=1;i<=n;i++,a++)
		{
			System.out.println(a);
		}
		
		return n;
	}
	
	
	public int sumOfSeries2(int n)
	{
		System.out.println("write a value for n =");
		n=sc.nextInt();
		for(int i=1,a=9;i<=n;i++,a+=4)
		{
			System.out.println(a);
		}
		
		return n;
	}
	
	
	public int sumOfSeries3(int n)
	{
		System.out.println("write a value for n =");
		n=sc.nextInt();
		for(int i=1,a=2;i<=n;i++,a+=2)
		{
			System.out.println(a);
		}
		
		return n;
	}
	
	
	
	public int sumOfSeries4(int n)
	{
		System.out.println("write a value for n =");
		n=sc.nextInt();
		for(int i=1,a=1;i<=n;i++,a+=2)
		{
			System.out.println(a);
		}
		
		return n;
	}
	
	public int sumOfSeries5(int n)
	{
		System.out.println("write a value for n =");
		n=sc.nextInt();
		for(int i=1,a=10;i<=n;i++,--a)
		{
			System.out.println(a);
		}
		
		return n;
	}
	
	
	
	
}

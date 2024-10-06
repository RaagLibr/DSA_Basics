package com.enfy.printseries;
import java.util.*;
public class ArithmaticSeriesPart2 {

	Scanner sc=new Scanner(System.in);

	public int sumOfSeriespart1(int n)
	{
		System.out.println("write a value for n =");
		n=sc.nextInt();
		
		for(int i=1,a=9;i<=n;i++,a+=4)
		{
			System.out.println(a);
		}
		
		return n;
	}
}

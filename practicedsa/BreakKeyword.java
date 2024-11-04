package com.enfy.practicedsa;

import java.util.Scanner;

public class BreakKeyword {
	Scanner sc=new Scanner(System.in);
	
	public void main(String args[])
	{
		do
		{
			System.out.println("enter nu=");
			int n=sc.nextInt();
			if(n%10==0)
			{
				break;
			}
			System.out.println(n);
		}
		while(true);
	}
}

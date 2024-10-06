package com.enfy.printpattern;

import java.util.Scanner;

public class PrintStandardCharPattern {
	Scanner sc=new Scanner(System.in);
	
	public char pattern1(String n)
	{
		//System.out.println("write a character=");
		//n=sc.nextLine();
		char i,j;
		for( i='A';i<='n';i++) {
			for( j='A';j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.print(" ");
		}
		
		System.out.println();
			
		
		
		return 'n';
	}
}


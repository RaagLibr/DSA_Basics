package com.enfy.arraybasic;
import java.util.*;
public class ArrayIO {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("size of array = ");
		int n=sc.nextInt();
		int marks[]=new int[n];
		
		System.out.println("enter marks for math = ");
		marks[0]=sc.nextInt();
		
		System.out.println("enter marks for phy = ");
		marks[1]=sc.nextInt();
				
		System.out.println("enter marks for che = ");
		marks[2]=sc.nextInt();
		
		System.out.println("Math = "+marks[0]);
		System.out.println("Phy = "+ marks[1]);
		System.out.println("Che = " + marks[2]);
		
		marks[2]=100;
		System.out.println("updated marks Che = " + marks[2]);
		
		int percentage = (marks[0]+marks[1]+marks[2])/3;
		System.out.println("percentage = " +percentage+"%");
		
		
		
	//To find size of arra we use length properties	
		System.out.println("\n"+"length of array = "+marks.length);
		
	}

}

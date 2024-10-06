package com.enfy.arraybasic;

public class Array1 {
	public static void update(int marks[],int nonchangeable)
	{
		nonchangeable=10;
		for(int i=0;i<marks.length;i++)
		{
			marks[i]=marks[i]+1;
		}
	}
	public static void main(String[] args) {
		int marks[]= {98,77,66};
		int nonchangeable=5;
		
		update(marks,nonchangeable);
		System.out.println("nonchangeable = "+nonchangeable+"\n");
		//print our marks
		for(int i=0;i<marks.length;i++)
		{
			System.out.println(marks[i]+" ");
		}
	}

}

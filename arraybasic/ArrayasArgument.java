package com.enfy.arraybasic;

public class ArrayasArgument {
	public static void update(int marks[])
	{
		for(int i=0;i<marks.length;i++)
		{
			marks[i]=marks[i]+1;
		}
	}
	public static void main(String[] args) {
		
		//pass by reference = we alway pass array by reference
		int marks[]= {55,77,44,99};
		System.out.println("before update = ");
		for(int i=0;i<marks.length;i++)
		{
			System.out.print(marks[i]+" ");
		}
		
		update(marks);
		
		//print our marks
		
		System.out.println("\n\nAfter Update = ");
		for(int i=0;i<marks.length;i++)
		{
			System.out.print(marks[i]+" ");
		}
		
		System.out.println();
		

	}

}

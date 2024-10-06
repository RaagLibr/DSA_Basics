package com.enfy.arrayexamples;

public class Arraysorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {66,4,54,7,88,34,23,54,22};
		System.out.println("array elements = ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}
		
		int biggest=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>biggest)
				biggest=a[i];
		}
		System.out.println("\n"+"largest number = "+biggest);
		
		
		int smallest=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<smallest)
				smallest=a[i];
		}
		System.out.println("\n"+"smallest number = "+smallest);
		
		
	}

}

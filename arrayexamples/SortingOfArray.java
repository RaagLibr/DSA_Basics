package com.enfy.arrayexamples;

public class SortingOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {55,66,33,7,-9,44};
		System.out.println("Array before sorting = ");
		for(int i=0;i<a.length;i++)
		{	
		System.out.print( a[i]+"  ");
		}
		
		
		System.out.println("\n"+"\n"+"Array after sorting in acending = ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
				if(a[j]<a[i])
				{
					int temp = a[i];
					 a[i]=a[j];
					a[j]=temp;
				}
			System.out.print(a[i]+"  ");
		}
		
		
		System.out.println("\n"+"\n"+"Array after sorting in decending = ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
				if(a[j]>a[i])
				{
					int temp = a[i];
					 a[i]=a[j];
					a[j]=temp;
				}
			System.out.print(a[i]+"  ");
		}
		
	}

}

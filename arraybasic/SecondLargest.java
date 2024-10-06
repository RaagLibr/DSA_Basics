package com.enfy.arraybasic;

public class SecondLargest {
	
	static
	{
		System.out.println("SecondLargest");
	}
	
	{
		System.out.println("hey=================");
	}
	public static int getSecondlarg(int a[], int tot)
	{
		int temp;
		for(int i=0;i<=tot;i++)  
			
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					System.out.println("before: "+a[i]+" "+a[j]+" ");
					
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					System.out.println("after: "+a[i]+" "+a[j]+" "+temp);
				}
			}
			System.out.println();
		}
		
	System.out.println("tot"+tot);
		//return a[a.length-2];
		return a[tot-2];
		
		
		
	}
	
	public static void main(String[] args) {
		int a[] = {25,96,76,77,15,91};		//0,1,2,3,4 (n-5)=4.
		
		//getSecondlarg(a, 5);
		System.out.println("second largest lements . \n"+getSecondlarg(a, 3));
	
	
	}

}

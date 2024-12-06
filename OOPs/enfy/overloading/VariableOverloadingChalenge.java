package com.enfy.overloading;

public class VariableOverloadingChalenge {
	//maximum of number using varag
	static int max(int ...A)
	{
		if(A.length==0)
		{
			return Integer.MIN_VALUE;
			
		}
		int max=A[0];
		for(int i=1;i<A.length;i++)
		{
			if(A[i]>max)
			{
				max=A[i];
			}
		}
		
		
		return max;
	}
	
	//sum of all elements using varags
	public static int sum(int ...s)
	{ int sum=0;
		for(int i=0;i<s.length;i++)
		{
			sum=sum+s[i];
		}
		return sum;
	}
		
	//calculate discount using varargs
	public static void main(String[] args) {
		System.out.println(sum(3));
		System.out.println(sum(30,5,3,2,9));
		System.out.println(sum(20,6,3));
		System.out.println(sum(3,0));
		
	}
}

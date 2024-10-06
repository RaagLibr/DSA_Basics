package com.enfy.foreachloop;

public class ForEach1 {
	public static void main(String args[])
	{
		int sum=0;
		int  nums[]= {1,2,3,4,5,6,7,8,9,10};
		
		//use for to display and sum the values
		
		for(int x:nums)
		{
			System.out.println("value is:"+x);
			sum+=x;
			//if(x==5) break;  //stop the loop when 5 is obtained
						
		}
		System.out.println("summation of first 5 elements."+sum);
	}

}

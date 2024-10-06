package com.enfy.arrayexamples;

public class Arrayoddeven {
		
	//odd and even
	// divisible by 7
	//less than 50
	//greator than 55
	// between 20 and 70
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {55,44,33,7,3,99,44,77,777};
		
//		for(int i=0;i<a.length;i++)
//		{
//			//System.out.println(a[i]);
//			if(a[i]%2==0)
//			{
//				System.out.println("number is even.= "+a[i]);
//			}
//			if(a[i]%2==1)
//			{
//				System.out.println("number is odd = "+a[i]);
//			}
//		}
//	
		
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]<50)
			{
				System.out.println("less than 50 ="+a[i]);
			}
			
			if(a[i]>50)
			{
				System.out.println("greater than 50 ="+a[i]);
			}
			
			
			if(a[i]<20 && a[i]>70)
			{
				System.out.println("20 to 70 = "+a[i]);
			}
			
			if(a[i]%7==0)
			{
				System.out.println("divisible by 7 = " +a[i]);
			}
			
		}
		
		
		
	}

}

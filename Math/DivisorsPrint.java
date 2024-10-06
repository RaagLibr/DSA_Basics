package com.enfy.Math;

public class DivisorsPrint {
	
	public static void DivisorofNum(int n)
	{
		int i=1;
		for( ;i*i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
		}
		
		for(  ;i>1; )
		{
			i--;
			 if(i!=n/i && n%i==0)
			{
				System.out.println(n/i);
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		
		int n=255;
		DivisorofNum(n);
		
		
	}

}

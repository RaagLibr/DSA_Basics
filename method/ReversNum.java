package com.enfy.method;

public class ReversNum {
	static int revNum(int revnum)
	{
		int mynum=revnum,rev=0,lastdigit;
		while(revnum>0)
		{
			lastdigit=revnum%10;
			rev=(rev*10)+lastdigit;
			revnum=revnum/10;
		}
		System.out.println("revers of digit = "+mynum+ " is "+rev);
		return rev;
		
	}
	
	public static void main(String args[])
	{
		revNum(29388);
	}
}

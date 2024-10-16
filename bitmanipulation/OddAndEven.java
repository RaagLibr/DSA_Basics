package com.enfy.bitmanipulation;

public class OddAndEven {
	
	public static void oddEven(int n)
	{
		
		//non zero value will be odd 
		int bitMask=1;
		if((n & bitMask)==0)
		{
			System.out.println("no. is even.");
		}
		else
		{
			System.out.println("odd");
		}
	}
	
	public static int getBit(int n,int i) {
		int bitMask=1<<i;
		if((n & bitMask)==0)
		{
			return 0;
			
		}
		else
		{
			return 1;
		}
		
	}
		
	public static int setBit(int n, int i)
	{
		int bitMask=1<<i;
		return n | bitMask;
	}
	
	public static int clearBit(int n, int i)
	{
		int bitMask=~(1<<i);
		return n & bitMask;
	}
	
	public static void main(String[] args) {
		oddEven(3);
		System.out.println(getBit(10,3));
		System.out.println(setBit(10,2));
		System.out.println(clearBit(10, 1));
	}

}

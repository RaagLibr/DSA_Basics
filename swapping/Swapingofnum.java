package com.enfy.swapping;

public class Swapingofnum {
	public static void swappin(int a,int b)
	{
		int temp;
		System.out.println("before swap = "+"a : "+ a+"b : " +b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("after swap = "+"a : "+ a+" b : " +b);
	}
	
	
	public static void swaping2no(int a, int b)
	{
		System.out.println("Before swap = "+"a : "+ a+" b : " +b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("after swap = "+"a : "+ a+" b : " +b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swapingofnum sn=new Swapingofnum();
		//sn.swappin(3, 4);
		sn.swaping2no(4, 5);
	}

}

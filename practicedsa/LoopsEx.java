package com.enfy.practicedsa;

public class LoopsEx {
	public static void main(String args[])
	{
		int n=432556,rev=0,ld;
		while(n>1)
		{
			ld=n%10;
			rev=(rev*10)+ld;
			n=n/10;
		}
		System.out.println(rev);
	}
}

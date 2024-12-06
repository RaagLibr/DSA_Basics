package com.enfy.overloading;

import java.util.Iterator;

public class VariableArgument {
	int A;
	public VariableArgument(int a,int ...b)
	{
		a= this.A;
		
	}
	public static void show(int ...A)
	{
		for(int x:A)
		{
			System.out.println(x);
		}
	}
	
	public static void showList(int start , String ...s)
	{
		for(int i=0;i<s.length;i++)
		{
			System.out.println(start+" "+s[i]);
			start++;
			
		}
	}
	public static void main(String[] args) {
		show();
		show(4,5,88);
		show(88,33,2,1,55,6,3,8);

		show(new int[] {4,3,2,5,6,2});
		showList(3, "rag", "ragini","ashi","akki");
	}

}

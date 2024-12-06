package com.enfy.inheritance;
public class A {
	int i;
	void display()
	{
		//this.i=66;
		System.out.println(i+"i");
	}
}

class B extends A
{
	int j;
	void display(int j)
	{
		//this.j=44;
		
		System.out.println(j+"j");
	}
}

class C extends B
{
	int k;
	void display()
	{
		//this.k=54;
		
		System.out.println(k+"k");
	}
	
}

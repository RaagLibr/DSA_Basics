package com.enfy.jbk;

public class A {
	
	private void m1()
	{
		System.out.println("m1.private.square");
	}
	
	void m2()
	{
		System.out.println("m2.default.triangle");
	}
	
	protected void m3()
	{
		System.out.println("m3.protected.diamond");
	}
	
	public void m4()
	{
		System.out.println("m4.public.circle");
	}
	
	
	public static void main(String[] args) {
		A aa= new A();
		aa.m1();
		aa.m2();
		aa.m3();
		aa.m4();
	}
}

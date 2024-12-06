package com.enfy.jbk1.jb;

public class AccessDemo {
	private int x=46;
	
	public void showDemo()
	{
		System.out.println("showdemo = "+getX());
	}
	
	public void testDemo()
	{
		System.out.println("It cannot be accessed by another class.");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
}

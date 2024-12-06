package com.enfy.encapsulation;

public class Area {
	int length;
	int breath;
	
	Area(int length, int breath) {
		super();
		this.length = length;
		this.breath = breath;
	}
	
	public void getArea()
	{
		int area= length*breath;
		System.out.println("area = "+area);
	}
}



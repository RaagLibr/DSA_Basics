package com.enfy.bitmanipulation;

public class DateFormate {
	
	
	public static void binaryOrNot()
	{
		int b = 1800110;
		String str = String.valueOf(b);
		System.out.println(str.matches("[01]+"));  //string contain 0 and 1?
	}
	
	public static void hexaOrNot()
	{
		String str = "234AB";
		System.out.println(str.matches("[0-9A-F]+"));
	}
	
	public static void dataAndTimeFormate()
	{
		String date = "08/08/1999";
		System.out.println(date.matches("[0-3][0-9]/[0-3][0-9]/[0-9]{4}"));
	}
	public static void main(String[] args) {
		binaryOrNot();
		hexaOrNot();
		dataAndTimeFormate();
	}

}

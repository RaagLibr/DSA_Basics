package com.enfy.basicskeyworkds;

public class ReturnTypeStudy {

		public static int getData()
		{
			//its not gonna print until we are not printing it 
			//but it will returns some values over/in main method
			//which output function gonna give us
			return 20;
		}
		
		
		public static String getName()
		{
			return "ragini";
		}
	public static void main(String[] args) {
		System.out.println("Get function call  = ");
		System.out.println(getData());
		
		String name=getName();
		System.out.println(name);
	}
}

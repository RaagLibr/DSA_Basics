package com.enfy.inheritance2;

class Parent {
	static {
		System.out.println("Static init block parent");
	}
	
	{
		System.out.println("Init block parent");
	}
	
	public Parent() {
		System.out.println("Parent constructor");
	}
	
	public static void par()
	{
		
	}
	
}

class Child extends Parent {
	static {
		System.out.println("Static init block child");
	}
	
	{
		System.out.println("Init block child");
	}
	
	public Child()
	{
		System.out.println("child constructor default");
		
	}
	
	public static void chil()
	{
		
	}
}


public class ObjectInitializationOrder {
	
	public static void main(String[] args) {
		Child p = new Child();
		
		System.out.println("=====================");
		 p = new Child();		
	
	}

}



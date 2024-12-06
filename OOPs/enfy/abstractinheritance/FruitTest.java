package com.enfy.abstractinheritance;
public class FruitTest {
	
	public static int fab(int n)
	{
		if(n==1 || n==0)
		{
			return n;
		}
		
		System.out.println("fab1"+n);
		int fab1 = fab(n-1);
		System.out.println("fab2"+n);
		int fab2=fab(n-2);
		System.out.println("end both fab");
		
		
		return fab1+fab2;
	}
	
	
	 public static void main(String[] args) {
		// int n=5;
		 System.out.println(fab(5));
	     // Create an array of Fruit objects
//	     Fruit[] fruits = new Fruit[6];
//
//	     // Add different fruits to the array
//	     fruits[0] = new Apple();
//	     fruits[1] = new Mango();
//	     fruits[2] = new Watermelon();
//	     fruits[3] = new Apple();
//	     fruits[4] = new Mango();
//	     fruits[5] = new Watermelon();
//
//	     // Loop to display the type of each fruit
//	     for (Fruit fruit : fruits) {
//	         System.out.println(fruit.getType());
//	     }
	 }
}

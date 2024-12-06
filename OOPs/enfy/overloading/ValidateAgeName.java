package com.enfy.overloading;

public class ValidateAgeName {
	public static boolean reverse(String name)
	{
		
		System.out.println(name);
		return name.matches("[a-zA-Z\\s]+");
		
	}
	
	public static boolean reverse(int age)
	{
		
		return age>=3 && age<=35;
	}
	public static void main(String[] args) {
		
		int name; String age;
		boolean nameisValide= reverse("Ragini");
		System.out.println(nameisValide);
		
		boolean ageisValide = reverse(80);
		System.out.println(ageisValide);
		
		
		
	}
}

package com.enfy.statickey;

public class Statickeyword {
	public static void main(String[] args) {
		Student std= new Student();
		std.schoolName="RLT college of science";
		System.out.println(std.schoolName);
		
		
		Student std1= new Student();
		std1.schoolName="Adarsh college of management";
		System.out.println(std1.schoolName);
		
		
		//this last object of static variable gonna change the all 
		//literals of variables.
		Student std2 = new Student();
		std2.schoolName="shivaji college of sci";
		System.out.println(std.schoolName);
		System.out.println(std1.schoolName);
		System.out.println(std2.schoolName);
	}

}

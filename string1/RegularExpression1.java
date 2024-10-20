package com.enfy.string1;

public class RegularExpression1 {

	/*
	 * Regular Expressions or Regex (in short) in Java is 
	 * an API for defining String patterns that can be used for 
	 * searching, manipulating,
	 *  and editing a string in Java. 
	 *  
	 *  Quentifiers : -
	 *   . = anything 
	 *   * =  0 or more time, e.g., [abc]*->abc aabbcc accbbaa , [a-z]* a to z 
	 *   + = one or more 
	 *   ? = 0 or 1 time	
	 *   {x}=X times   , e.g., [a-z]{5}-> only five letters allow
	 *   {X,Y}= Between X and Y time in string
	 *   
	 *   \\w =  any alphabets and digits
	 *   \\s = 
	 */
	
	public static void removeSpecialChar(String str)
	{
		String str1=str.replace(" ", "");
		System.out.println(str1);
	}
	
	public static void removeExtraSpaces(String str)
	{
		String str1=str.replaceAll("[^a-zA-Z0-9]","").replace(" ", "");
		System.out.println(str1);
		
		
		
		
	}
	
	public static void numOfWordsInString(String str)
	{
		str = str.replaceAll("\\s+"," ");
		System.out.println(str	);
		
		String words[]=str.split("\\s");
		System.out.println(words.length);
		
	}
	public static void main(String[] args) {
		String str="!2ewje43   Ragini";
		removeSpecialChar(str);
		numOfWordsInString(str);
		removeExtraSpaces(str);
		
	}
}

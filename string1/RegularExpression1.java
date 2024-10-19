package com.enfy.string1;

public class RegularExpression1 {

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
		str = str.replaceAll("\\s"," ");
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

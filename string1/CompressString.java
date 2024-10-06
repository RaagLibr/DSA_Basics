package com.enfy.string1;

import java.util.Scanner;

public class CompressString {
	public static String Compression(String str) {
		
		
		String newStr="";
		
		for(int i=0;i<str.length();i++)
		{
			Integer count = 1;
			while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
			{
				count++;
				i++;
			}
			
			newStr +=str.charAt(i);
			if(count>1)
			{
				newStr += count.toString();
			}
		}	
		return newStr; 
	}
	
	
	public static void main(String[] args) {
       // Call the Compression method to compress the string
       String str = "rrrrggg";
       System.out.println(Compression(str));
	}
	
}

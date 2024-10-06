package com.enfy.method;


public class Stringmethods {
	
	public static void toString1()
	{
		Integer x = 5;
		System.out.println(x.toString());
		System.out.println(Integer.toString(12));
		
	}
	
	
	public static void Indexofchar1()
	{
		for(int i=0;i<=256;i++)
		{
			System.out.println(i+":"+(char)i);
		}
	}
	
	
	
	public static void indexfound()
	{
		String  s="Hello";
		System.out.println(s.indexOf('l'));
	}
	
	
	public static void vowelconsol()
	{
		String s="Ice-234cream987!!!!";
		int vowel_count=0;
		int consonant_count=0;
		int std_char_count=0;
		int digit_count=0;
		
			for(int i=0;i<s.length();i++)
			{
				char ch=s.charAt(i);
				switch(1)
				{
					case 1:
						if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')   
						{
							vowel_count++;
							break;
							
						}
					
					case 2:
						if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')) 
						{
							consonant_count++;
							break;
							
						}
					
					case 3:
						if(ch>='0' && ch<='9')
						{
							digit_count++;
							break;
							
						}
					
					default :
						std_char_count++;
					
				}
			}
			
			
		System.out.println("total consonant = "+consonant_count);	
		System.out.println("total digit = "+digit_count);
		System.out.println("total standard character =  "+std_char_count);
		System.out.println("total vowels = "+vowel_count);
		
	}
	
	public static void converAStringintCharArray()
	{
		String s="hello";
		char ch[]=s.toCharArray();
		
		
		System.out.println("character of array = "+ch[0]);
		for(int i=0;i<s.length();i++)
		{
			System.out.println("character of array = "+ch[i]);
			
		}
		System.out.println("string is immutable, so = "+s);
	}
	public static void main(String[] args) {
		/*
		 * 1. use toString method of String class
		 * 2.show the index of character o
		 * 3. show total number of character in the String
		 * 4. count all the vowels in the string
		 * 5. count all consonants in the String
		 * 6. count all digits in the String 7
		 * 7. find the frequency of given character in given String
		 * 8. find the frequency of each character in given String 
		 * 
		 */
		
		Stringmethods sm= new Stringmethods();
		//sm.toString1();
		//Indexofchar1();
		//indexfound();
		vowelconsol();
		//converAStringintCharArray();
	}
}

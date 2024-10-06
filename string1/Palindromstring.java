package com.enfy.string1;

public class Palindromstring {

	public static boolean stringPalindrom(String s)
	{
		for(int i=0;i<s.length()/2;i++)
		{
			int n=s.length();
			if(s.charAt(i)!=s.charAt(n-1-i))
			{
				//notpalindrom
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String s="noon";
		stringPalindrom(s);
		System.out.println(stringPalindrom(s));
	}
}

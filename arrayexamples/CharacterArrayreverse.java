package com.enfy.arrayexamples;

public class CharacterArrayreverse {

		public static void charArrayRevers(String s)
		{
			char a[]=s.toCharArray();
			
			for(int i=0;i<a.length/2;i++)
			{
				char temp = a[i];
					a[i]=a[a.length-1-i];
					a[a.length-1-i]= temp ;
			}
			
			for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}
			
			
			
		}
		
		public static void main(String[] args) {
			charArrayRevers("hello, there.");
		}
}

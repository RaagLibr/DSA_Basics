package com.enfy.string1;

public class StringMethods {

	public static void poolObj()
	{
		String str1="Pyramid";
		String str2="pyramid";
		String str3="";
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(String.valueOf(str2));
		System.out.println(str1.compareTo(str2));
		System.out.println(str1==str2);
		
		
		System.out.println(str1.matches("[a-z]*")+" "+str2.matches("[a-z]*")+" "+str3.matches("[a-z]*"));
		System.out.println(str1.matches("[a-z]+")+" "+str2.matches("[a-z]+")+" "+str3.matches("[a-z]+"));
		System.out.println(" "+str2.matches("[a-z]{3}"));  //exactly 3 letters
		System.out.println(" "+str2.matches("[a-z]{3,7}"));  //exactly 3 to 7 letters
		
		String email = "rag@gmail.co1m";
		System.out.println(email.matches(".*gmail.*"));  //any dot and any num of time after gmail .com there will be or anything
		System.out.println(email.matches("\\w*@gmail(.com)"));  //only alphabets or digits and any num of time than 1 and  any dot
	}
	
	public static boolean findEmail(String str)
	{
		String str1 = "rag@hotmail.com";
		
		
			int i=str.indexOf("@");
			String uname=str.substring(0,i);
			String domain=str.substring(i+1,str.length());
			
			System.out.println("username : "+uname);
			System.out.println("domain : "+domain);
			System.out.println(domain.startsWith("gmail"));
			
			
			int j=domain.indexOf(".");
			String name = domain.substring(0,j);
			System.out.println(name.equals("gmail"));
			
			return true;
		
	}
	
	public static void main(String[] args) {
		poolObj();
		
		String str = "rag@gmail.com";
		System.out.println(findEmail(str));
	}
}

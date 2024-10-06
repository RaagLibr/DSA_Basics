package com.enfy.arrayexamples;

public class ArrayStringEx {
	public int LinearSearch(String strg[],String key)
	{
		for(int i=0;i<strg.length;i++)
		{
			if(strg[i]==key)
			{
				return i;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		String strg[]= {"Samosa","idli","dokla","Smbhar","Shrikhand"};
		String key="idli";
		
		ArrayStringEx ase=new ArrayStringEx();
		
		int index=ase.LinearSearch(strg,key);
			if(index==-1)
			{
				
				System.out.println("Not found ");
			}
			else
			{
				System.out.println("found = "+key+ " at index \n number = "+index);
			}
		
		
	}
}

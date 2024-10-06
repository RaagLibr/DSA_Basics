package com.enfy.arrayexamples;

public class LinearSerchArray {
	public static int linearSerach(int number[],int key)
	{
		for(int i=0;i<number.length;i++)
		{
			if(number[i]==key)
			{
				return i;
			}
		}
	
		return -1;
	}
	public static void main(String[] args) {
		int number[]= {66,88,33,22,9,4};
		int key=4;
		
		int index=linearSerach(number, key);
		if(index==-1)
		{
			System.out.println("Not found.");
		}
		else
		{
			System.out.println("Key is at index = "+index);
		}
	}
	
}

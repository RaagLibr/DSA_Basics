package com.enfy.ArrayDSA;


public class BinarySearchEx {
	public static int binarySearch(int numbers[], int key)
	{
		int start=0,end = numbers.length-1;
		
		while(start<=end)
		{
			int mid=(start+end)/2;
			
			//comparisons
			if(numbers[mid]==key)
			{
				return mid;
			}
			
			if(numbers[mid]<key)
			{
				start = mid+1;			//right
			}
			
			if(numbers[mid]>key)				
			{
				end=mid-1;   			//left
			}
		}
		
		return -1;
	}
	public static void main(String[] args) {
		int numbers[]= {34,66,73,2,89,5,9};
		int key=5;
		
		System.out.println("index for key is = "+binarySearch(numbers,key));
	}
}

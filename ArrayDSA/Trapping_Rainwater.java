package com.enfy.ArrayDSA;

 
public class Trapping_Rainwater {
	
	public static int trappingRainwater(int height[])
	{
		int n=height.length;
		
		int leftmax[]= new int[n];
		leftmax[0]=height[0];
		
		for(int i=1;i<n;i++)
		{
			leftmax[i]=Math.max(height[i], leftmax[i-1]);
		}
		
		//calculate right max boundary array
		int rightmax[]=new int [n];
		rightmax[n-1]=height[n-1];
		for(int i=n-2;i>=0;i--)
		{
			rightmax[i]=Math.max(height[i],rightmax[i+1]);
		}
		
		
		 // Calculate the accumulated water element by element
		int trappedWater=0;
		for(int i=0;i<n;i++)
		{
			int waterLevel = Math.min(leftmax[i],rightmax[i]);
			
			trappedWater += waterLevel - height[i];
		}
		
		return trappedWater;
	}
	
	public static void main(String[] args) {
		int height[]= {4,5,6,3,7,6,9};
		trappingRainwater(height);
		System.out.println("Trapping rain water = "+trappingRainwater(height)+"units");
	}
}

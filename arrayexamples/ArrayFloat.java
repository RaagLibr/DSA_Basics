package com.enfy.arrayexamples;

public class ArrayFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float arr[]= {4.4f,4.5f,0.2f,0.4f,6.0f,7.0f,0.8f,9.0f};
		float sum=1;
		
		System.out.println("Addition of all elements = ");
		for(float i=0;i<arr.length;i++)
		{
			 sum=sum+arr[(int) i];
			 System.out.println(sum);
		}
		
//		for(float i=0;i<arr.length;i++)
//		{
//			float avg;
//			avg=a[i]/a[i];
//		}
		
	}

}

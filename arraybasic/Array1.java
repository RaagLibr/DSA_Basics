package com.enfy.arraybasic;

import java.util.Arrays;

public class Array1 {
	public static void update(int marks[],int nonchangeable)
	{
		nonchangeable=10;
		for(int i=0;i<marks.length;i++)
		{
			marks[i]=marks[i]+1;
		}
	}
	
	
	public static void sumOfelement(int arr[])
	{
		int sum=0;
		for (int x : arr) {
			sum=sum+x;
			System.out.println(sum);
		}
	}
	
	public static void searchAnElement(int arr[])
	{
		int key = 5;
		for (int x : arr) {
			if(x==key)
			{
				System.out.println("got key = "+arr[x]);
			}
			
		}
			System.out.println("invalide input");
		
	}
	
	public static int findMaximum(int arr[])
	{
		if (arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        int maxValue = arr[0]; // Initialize with the first element

        for (int num : arr) {
            if (num > maxValue) {
                maxValue = num; // Update maxValue if current num is greater
            }
            
            
        }

        return maxValue; // Return the maximum value found
    
	}

	public static int findMinimum(int arr[])
	{
		if (arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        int minValue = arr[0]; // Initialize with the first element

        for (int num : arr) {
            if (num < minValue) {
                minValue = num; // Update maxValue if current num is greater
            }
            
            
        }

        return minValue; // Return the maximum value found
    
	}

	public static void findingLargestElementusingLamdaExp(int arr[])
	{
		   // Initialize a variable to hold the largest element
        int[] largest = {Integer.MIN_VALUE}; // Use an array to modify within forEach

        // Use a forEach loop to find the largest element
        Arrays.stream(arr).forEach(num -> {
            if (num > largest[0]) {
                largest[0] = num; // Update the largest if current num is greater
            }
        });
	
        System.out.println("The largest element in the array is: " + largest[0]);
     }
	public static void main(String[] args) {
		int marks[]= {98,77,66};
		int nonchangeable=5;
		
		update(marks,nonchangeable);
		System.out.println("nonchangeable = "+nonchangeable+"\n");
		//print our marks
		for(int i=0;i<marks.length;i++)
		{
			System.out.println(marks[i]+" ");
		}
	
		System.out.println("=======================");
		int arr[]= {5,6,3,7,8,9,4};
		sumOfelement(arr);
		
		
		System.out.println("=======================");
		searchAnElement(arr);
		
		System.out.println("=========================");
		findingLargestElementusingLamdaExp(arr);
		
		System.out.println("=========================");
		int[] numbers = {3, 5, 1, 8, 2};
        int maxNum = findMaximum(numbers);
        System.out.println("The maximum element is: " + maxNum);
        
        
        int miniNum=findMinimum(numbers);
        System.out.println("the minimum elements is : "+miniNum);
	}

	
}

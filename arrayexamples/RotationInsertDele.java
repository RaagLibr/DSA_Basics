package com.enfy.arrayexamples;

import java.util.ArrayList;

public class RotationInsertDele {
	
	public static void rotatingArray()
	{
		int arr[]= {3,4,5,7,8,3,9,4};
		for (int x : arr) {
			System.out.print(x+",");
		}
		
		System.out.println();
		int temp = arr[0];
		
		for(int x=1;x<arr.length;x++)
		{
			arr[x-1]=arr[x];
		}
		arr[arr.length-1]=temp;
		
		for(int x:arr)
		{
			System.out.print(x+",");
		}
		System.out.println();
	}
	
	public static void insertElement()
	{
		
		/*
		 * Original Array: We start with an original array containing initial values.
Temporary Array: A new array newArray is created with a size that is one greater than the original.
Copy Elements:
Elements before the specified insertion index are copied directly from the original array.
Insert the New Value: The new value is inserted at the specified index in the temporary array.
Copy Remaining Elements: Remaining elements from the original array are copied into the temporary array, shifted by one position.
Print the Updated Array: Finally, the updated array is printed.
		 */
				 // Step 1: Initialize the original array and values
		        int[] originalArray = {3, 5, 4, 5, 6}; // Original array with 5 elements
		        
		        int n = originalArray.length; // Current number of elements
		        int x = 20; // Value to be inserted
		        int indexToInsert = 2; // Index where to insert the new value
		
		        // Step 2: Create a new array with an extra space
		        int[] newArray = new int[n + 1];
		        
		        System.out.print("original array = ");
		        for(int i=0;i<originalArray.length;i++)
		        {
		        	System.out.print(originalArray[i]+",");
		        }
		        System.out.println();
		        // Step 3: Copy elements before the insertion index
		        for (int i = 0; i < indexToInsert; i++) {
		            newArray[i] = originalArray[i];
		        }
		
		        // Step 4: Insert the new value
		        newArray[indexToInsert] = x;
		
		        // Step 5: Copy the remaining elements
		        for (int i = indexToInsert; i < n; i++) {
		            newArray[i + 1] = originalArray[i];
		        }
		
		        // Step 6: Print the updated array
		        System.out.print("Updated array: ");
		        for (int i = 0; i < newArray.length; i++) {
		            System.out.print(newArray[i] + ",");
		        }
		        System.out.println();
        }
	
	public static void deleteElement()
	{
			 // Step 1: Initialize the original array and values
	        int[] originalArray = {3, 5, 20, 4, 5, 6}; // Original array
	        int n = originalArray.length; // Current number of elements
	        int indexToDelete = 2; // Index of the element to delete (20)
	
	        System.out.print("original array = ");
	        for(int i=0;i<originalArray.length;i++)
	        {
	        	System.out.print(originalArray[i]+",");
	        }
	        System.out.println();
	        // Step 2: Check if the index is valid
	        if (indexToDelete < 0 || indexToDelete >= n) {
	            System.out.println("Index out of bounds");
	            return;
	        }
	
	        // Step 3: Shift elements to the left
	        for (int i = indexToDelete; i < n - 1; i++) {
	            originalArray[i] = originalArray[i + 1]; // Shift elements left
	        }
	
	        // Step 4: Reduce the size by one (optional)
	        n--; // We can ignore the last element as it's now a duplicate
	
	        // Step 5: Print the updated array
	        System.out.print("Updated array after deletion: ");
	        for (int i = 0; i < n; i++) {
	            System.out.print(originalArray[i] + ",");
	        }
	        System.out.println();	
        }
    public static void main(String[] args) {
		rotatingArray();
		insertElement();
		deleteElement();
	}
	

}

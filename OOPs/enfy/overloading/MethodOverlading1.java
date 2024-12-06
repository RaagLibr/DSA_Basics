package com.enfy.overloading;

public class MethodOverlading1 {

	public static int reverse(int x)
	{
		 int rev = 0;
	        int ls; // Last digit
	        
	        // Loop until the number becomes 0
	        while (x != 0) {
	            ls = x % 10; // Get the last digit
	            rev = (rev * 10) + ls; // Append it to the reversed number
	            x = x / 10; // Remove the last digit
	        }
	        
	        return rev; // Return the reversed number
		
	}
	
	public static int[] reverse(int a[])
	{
		 int[] b = new int[a.length]; // Create a new array to store the reversed values
	        
	        for (int j = 0, i = a.length - 1; i >= 0; i--, j++) {
	            b[j] = a[i]; // Reverse the array
	        }
	        
	        return b; // Return the reversed array
			
	}
	public static void main(String[] args) {
		
		 int x = 2919;
	        int reversedNumber = reverse(x);
	        System.out.println("Reversed number: " + reversedNumber);

	        int[] A = {2, 3, 4, 6, 18, 9};
	        int[] reversedArray = reverse(A);
	        System.out.print("Reversed array: ");
	        for (int num : reversedArray) {
	            System.out.print(num + " ");
	        }
	    }
}

package com.enfy.arrayexamples;

import java.util.Scanner;

public class CopingReverseIncrease {
    public static void copingArray(int A[]) {
        int B[] = new int[A.length];

        System.out.println("Length of A = " + A.length);
        System.out.print("Original Array A: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + (i < A.length - 1 ? ", " : ""));
            B[i] = A[i];
        }
        
        // Copying reference (not values)
        A = B;
        System.out.println("\nCopied Array B: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(B[i] + (i < B.length - 1 ? ", " : ""));
        }
        System.out.println("\nLength of A = " + A.length);
    }
    
    public static void copyingReverseArray(int A[]) {
        int B[] = new int[A.length];

        System.out.println("Array size = " + A.length + " | Original Array: ");
        for (int x : A) {
            System.out.print(x + " ");
        }
        System.out.println(); // Move to the next line
        
        for (int i = A.length - 1, j = 0; i >= 0; i--, j++) {
            B[j] = A[i];
        }

        System.out.println("Updated Array B (Reversed): ");
        for (int x : B) {
            System.out.print(x + " ");
        }
        System.out.println(); // Move to the next line
    }
    
    public static void increaseSizeOfArray(int A[])
    {
    	System.out.println("=============");
    	 System.out.println("length of array = "+A.length);
         
    	int B[]=new int[2*A.length];
    	 
    	 for (int i = A.length - 1, j = 0; i >= 0; i--, j++) {
             B[j] = A[i];
    	 }
    	 
    	     System.out.println("increased Updated Array B (Reversed): ");
             for (int x : B) {
                 System.out.print(x + " ");
             }
             
             System.out.println(); // Move to the next line
             
             // Assign B to A, effectively increasing the size of A
             A = B; // This only changes the reference of A within this method

         System.out.println("length of array = "+B.length);
         
   }
    	 
    	 

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int A[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        
        
        copingArray(A);
        
        copyingReverseArray(A);
        
        increaseSizeOfArray(A);
        sc.close(); // Close the scanner at the end
    }
}

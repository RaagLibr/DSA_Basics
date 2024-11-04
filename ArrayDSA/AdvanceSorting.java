package com.enfy.ArrayDSA;


public class AdvanceSorting {

	
	public static int[] countSort(int[] inputArray) {
       int n=inputArray.length;
       int M=0;
       
       for(int i=0;i<n;i++)
       {
    	   M=Math.max(M, inputArray[i]);
       }
       
       int countArray[]= new int[M+1];
       
       for(int i=0;i<n;i++)
       {
//This increments the count of the element inputArray[i] by 1.
//So if the element appears multiple times in the inputArray, 
//each time it's encountered, its corresponding count in the countArray is increased.
    	   countArray[inputArray[i]]++;
    	   
       }
       
       for(int i=1;i<=M;i++)
       {
    	   countArray[i]+=countArray[i-1];
       }
	
	
       int outputArray[] = new int[n];
       for (int i = n - 1; i >= 0; i--) {
            outputArray[countArray[inputArray[i]] - 1] = inputArray[i];
            countArray[inputArray[i]]--;

        }
       
       
        return outputArray;
    }

	  /* A utility function to print array of size n */
	   
	
	

	public static void main(String[] args) {
		
		 int[] arr= {4, 3, 12, 1, 5, 5, 3, 9};
	       
        
        
       
        int[] outputArray = countSort(arr);
        System.out.println("cS");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(outputArray[i]);
            System.out.println();
           
            //OR
            
//            System.out.print(outputArray[i] + "c " + arr[i] + "i " + arr[i] + "i " + arr[i] + "i ");
//            System.out.println(); // Move to the next line after printing
//            
         }
		
       
	}
}

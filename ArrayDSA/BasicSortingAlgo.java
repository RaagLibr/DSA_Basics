package ArrayDSA;

public class BasicSortingAlgo {
	/*
	 * We start with second element of the array as first element in the array is assumed to be sorted.
		Compare second element with the first element and check if the second element is smaller then swap them.
		Move to the third element and compare it with the second element, then the first element and swap as necessary to put it in the correct position among the first three elements.
		Continue this process, comparing each element with the ones before it and swapping as needed to place it in the correct position among the sorted elements.
		Repeat until the entire array is sorted.
	 * 
	 * insersionsort(array)
	 * {
	 * 		mark First element as sorted
	 * 			for each unsorted element E
	 * 				'extract the element E
	 * 			for(j<-lastsortedelement down to 0)
	 * 				if(currentlement j>E) if( 
	 * 					move sorted element to the right by 1
	 * 			break loop and insert E here
	 * 		end insertionSort;
	 * 
	 * {
	 */
	
	
		public static int[] inserSort(int arr[])
		{
			int n = arr.length;
	        for (int i = 1; i < n; ++i) {
	            int temp= arr[i];
	            int j = i - 1;

	            /* Move elements of arr[0..i-1], that are
	               greater than temp, to one position ahead
	               of their current position */
	            while (j >= 0 && arr[j] > temp) {
	                arr[j + 1] = arr[j];
	                j = j - 1;
	            }
	            arr[j + 1] = temp;
	        }
	        
	        return arr;
	        
		}
		
		
	
	
		
//SELECTION SORT ALGORITHM
		/*
		 * Start with the first element as the initial position.
Find the smallest element in the unsorted portion of the array.
Swap this smallest element with the first unsorted element.
Move the boundary of the sorted portion one element forward.
Repeat steps 2-4 for the remaining unsorted elements until the entire array is sorted.
		 */
	
		public static int[] selectionSort(int arr[])
		{
				int n=arr.length;
				
				for(int i=0;i<n-1;i++)
				{
					int min_idx=i;
					
					for(int j=i;j<n;j++)
					{
						if(arr[j]<arr[min_idx])
						{
							int mid_idx=j;
						}
					}
					if(min_idx != i)
					{
						 int temp = arr[i];
			                arr[i] = arr[min_idx];
			                arr[min_idx] = temp;
					}
				
				}
				
			return arr;
		}
		
		
/*
 * Divide: Divide the list or array recursively into two halves until it can no more be divided.
Conquer: Each subarray is sorted individually using the merge sort algorithm.
Merge: The sorted subarrays are merged back together in sorted order.
 The process continues until all elements from both subarrays have been merged.		
 */
		public static int[] mergeSort(int a[], int beg,int mid, int end)
		{
			
			 			return a;
		}
		

		public static void main(String[] args) {
			
			 int[] arr= {4, 3, 12, 1, 5, 5, 3, 9};
		       
	        inserSort(arr);
	        selectionSort(arr);
	        
	       
	        System.out.println("sS"+" "+"iS");
	      
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i]+"  ");
	            System.out.print(arr[i]+"   ");
	            System.out.println();
	           
	            //OR
	            
//	            System.out.print(outputArray[i] + "c " + arr[i] + "i " + arr[i] + "i " + arr[i] + "i ");
//	            System.out.println(); // Move to the next line after printing
//	            
	         }
			
	       
		}
		
		
		

}

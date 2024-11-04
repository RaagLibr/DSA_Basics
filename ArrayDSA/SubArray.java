package com.enfy.ArrayDSA;


public class SubArray {
	
	
	public static void KadanAlgo(int num[])
	{
		int max_subarray=Integer.MIN_VALUE;
		int cs=0;
		
		for(int i=0;i<num.length;i++)
		{
			cs=cs+num[i];
			if(cs<0)
			{
				cs=0;
			}
			System.out.println(num[i]);
			
			max_subarray = Math.max(cs,max_subarray);
			
		}
		System.out.println("Our max subarray sum is = "+max_subarray);
	}
	
	public static void subArray1(int num[])
	{
		int total=0;
		for(int i=0;i<num.length;i++)
		{
			int start=i,sum=0;
			for(int j=start;j<num.length;j++)
			{
				int end=j;
				for(int k=start;k<=end;k++)		//print
				{
					System.out.print(num[k]+" ");		//subarray
				}
				sum=sum+num[j];
				
				total++;
				System.out.println();
				System.out.println("sum = "+sum);
				
			}
			System.out.println();
		}
		
		System.out.println("total = "+total);
	}
	
	
	
	//BrutForce Approach
	public static void subArray2(int num[])
	{
		int current_sum=0;
		int max_sum=Integer.MIN_VALUE;
		for(int i=0;i<num.length;i++)
		{
			int start=i;
			for(int j=i;j<num.length;j++)
			{
				int end=j;
				current_sum=0;
				
				for(int k=start;k<=end;k++)
				{
					current_sum+=num[k];
				}
				
				System.out.println(current_sum);
				if(max_sum<current_sum)
				{
					max_sum=current_sum;
				}
			}
		}
		System.out.println("maxim sum fo array = "+max_sum);
		
	}
	
	
	//Prefix Sum
	public static void subArray3(int num[])
	{
		int current_sum=0;
		int max_sum=Integer.MIN_VALUE;
		int prefix[]=new int[num.length];
		
		prefix[0]=num[0];
		
		//calculate
		
		for(int i=1;i<prefix.length;i++)
		{
			prefix[i]=prefix[i-1]+num[i];
		}
		
		for(int i=0;i<num.length;i++)
		{
			int start=i;
			for(int j=i;j<num.length;j++)
			{
				int end=j;
				current_sum=start==0?prefix[end]:prefix[end]-prefix[start-1];
			
				if(max_sum<current_sum)
				{
					max_sum=current_sum;
				}
			}
		}
		System.out.println("maxim sum fo array = "+max_sum);
		
	}

	public static void main(String[] args) {
		int num[]= {4,3,5,3,6,3,6};
		//subArray1(num);
		//subArray2(num);
		//subArray3(num);
		KadanAlgo(num);
	}
}

package com.enfy.method;

public class SumOfDigitInInteger {
		public int digitSum(int n)
		{
			int sum=0,lastdigit;
			
			while(n>0)
			{
				
				lastdigit=n%10;
				sum=lastdigit+sum;
				n=n/10;
				
				
			}
			System.out.println("sum of digits.= "+sum);
			return sum;
		}
	public static void main(String[] args) {
		
		SumOfDigitInInteger sum=new SumOfDigitInInteger();
		sum.digitSum(6666);
	}

}

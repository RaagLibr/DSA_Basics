package com.enfy.method;

public class Prime {

	
	//Factors are exact divisors 
	//when we divide a number by its factor we get reminder of zero we get questient
	public static boolean isPrime(int n)
	{
		
		//corner cases  -> only for n>=2
		if(n==2)
		{
			return true;
		}
		
//way-2 => n=6 .  
		//n%1=>questien=6, reminder=0
		//n%2=>q=3,r=0
		//n%3=>q=2,r=0
		//but
		//n%4=>q=1,r=2
		//n%5=>q=1,r=1
		
		//so factors of 6 are 1,2,3
		//n%n-1=>q=factor,r=0
		//n%10==0 return false; not prime
		
		
		
		for(int i=2;i<=n-1;i++)
		{
			if(n%10==0)    //completely dividing
			{
				return false;
			}
			
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(isPrime(3));	

	}

}

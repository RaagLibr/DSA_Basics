package com.enfy.method;

public class PrimeOpti
{

	
	//Factors are exact divisors 
	//when we divide a number by its factor we get reminder of zero we get questient
	public static boolean isPrime(int n)
	{
		
		//corner cases  -> only for n>=2
		if(n==2)
		{
			return true;
		}
		
		
		for(int i=2;i<=n-1;i++)
		{
			if(n%10==0)    //completely dividing
			{
				return false;
			}
			
		}
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
			
		
	public static boolean isPrime(float n)   //helper function
	{
		if(n==2)
		{
			return true;
		}
		for(float i=2;i<=Math.sqrt(n);i++)     //root n * root n = n
		{
			if(n%2==0 || n%i==0)						//number divisible by ith or by 2 number then false
			{
				return false;
			}	
		}	
		return true;				//return true if condition false.
		
		
	}
	
	public static void Primerange(float n)
	{
		for(float i=2;i<=n;i++)
		{
			if(isPrime(i))
				
			{
				System.out.println(i+" ");
			}
		}
		System.out.print("");
	}
	
	
	public static void primenumberGenerate(int no) {
		int count=0;
		
		for(int i=1;i<=no;i++)
		{
			if(no%i==0)
			{
				count+=1;

			}
			
			
		}
		if(count==2)
		{
			System.out.println("is prime");
		}
		else 
		{
			System.out.println("is not prime.");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(isPrime(13));
		//Primerange(12);
		primenumberGenerate(11);

	}

}

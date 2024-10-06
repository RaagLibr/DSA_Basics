package com.enfy.method;
import java.math.BigInteger;
import java.util.*;
public class Method {
	Scanner sc= new Scanner(System.in);

	//Print Prime number 
	
	
		public boolean isPrime(int n)
		{
			System.out.println("write a value=");
			n=sc.nextInt();
			boolean isPrime1=true;
			for(int i=2;i<=n-1;i++)
			{
				if(n%i==0)
				{
					isPrime1=false;
					break;
				}
			}
			return isPrime1;
		}
		
		public boolean isPrimeOpti(int n)
		{
//			System.out.println("write a value=");
//			n=sc.nextInt();
			boolean isPrime1=true;
			for(int i=2;i<=Math.sqrt(n);i++)
			{
				if(n%i==0)
				{
					isPrime1=false;
					break;
				}
			}
			return isPrime1;
		}
		
		public int isPrimeRange(int no)
		{
			System.out.println("write a value=");
			no=sc.nextInt();
			for(int i=2;i<=no;i++)
			{
				if(isPrimeOpti(i))
				{
					System.out.print(i+" ");
					
				}
				
		
			}
			
		
			return no;
		}
		
//swapping of variable wtht using 3rd variable.............		
		public int isSwap(int a, int b)
		{
			int isSwap1=1;
			System.out.println("write a value for a=");
			a=sc.nextInt();
			System.out.println("write a value for b =");
			b=sc.nextInt();
			System.out.println("before swaping ="+a+" "+b);
			
			a=a+b;
			b=a-b;
			a=a-b;
		
			System.out.println("after swaping = "+ a +" "+ b);
			
			return isSwap1;
		}
		
		
		
		
		public int factorial(int n)
		{
			System.out.println("write a value=");
			n=sc.nextInt();
			
			int fact=1;
				 for(int i=1;i<=n;i++)
				 {
					 fact=fact*i;
				 }
				
			return fact;
		}
		
		
		public static void extraLongFactorial(int n)
		{
			BigInteger bigInt = BigInteger.valueOf(1);
			for(int i=0;i<n;i++)
			{
				bigInt = bigInt.multiply(BigInteger.valueOf(n-1));
			}
			System.out.println(bigInt);
		}
		
		public int bioCoeficient(int a,int b)
		{
			System.out.println("write a value for a=");
			a=sc.nextInt();
			System.out.println("write a value for b=");
			b=sc.nextInt();
			
			int fact_a=factorial(a);
			int fact_b=factorial(b);
			int fact_nmr = factorial(a-b);
			
			int bifact=fact_a/(fact_b*fact_nmr);
			return bifact;
		}

		 public void reverseDigit(int n)
		    {

				System.out.println("write value to"
						+ " get ans=");
				
			
		        int ld,rev=0;
		        while(n>0)
		        {
		            ld=n%10;
		            rev=(rev*10)+ld;
		            n=n/10;
		        }
		        System.out.println(rev);
		    }
		 
		/* 
		 public void swap(int a,int b)
		 {

				int swap,a,b;
				
				System.out.println("enter value for a =");
				a=sc.nextInt();
						
				System.out.println("enter value for b=");	
				b=sc.nextInt();
				
				 swap=a;
				 a=b;
				b=swap;
				
				System.out.println("swaped="+swap);

		 }
		 
		 
		 public void swap3(int x,int y)
		 {
		 
		 	 System.out.println("Enter the value of x and y");  
        int x = sc.nextInt();  
        int y = sc.nextInt();  
        System.out.println("before swapping numbers: "+x +" "+ y);  
        x = x + y;   
        y = x - y;   
        x = x - y;   
        System.out.println("After swapping: "+x +"  " + y);   
    
		 
		 
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 */
	

}

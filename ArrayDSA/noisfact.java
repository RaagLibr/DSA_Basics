package com.enfy.ArrayDSA;


public class noisfact {
	
	public static void isFact(int n[])
	{
		
		for(int i=0;i<n.length;i++)
		{
			int f = n[i],fact=1;
			for(int j=0;j<n[j];j++)
			{
				
				fact = fact*i;
				if(n[i]==f)
				{
					
					System.out.println("is fact."+n[i]);
				}
				else
				{
					System.out.println("not fact."+n[i]);
				}
			}
			
		}
			
		}
		
	

	public static void main(String[] args) {
		
		int n[]= {125,125,55,120,190};
		isFact(n);
	}
}

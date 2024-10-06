package com.enfy.numberpattern;

public class OneAndZero {
		public void oneandzero(int n)
		{
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=i;j++)
				{
					int temp=1;
						if((i+j)%2==0)
						{
							System.out.print("1");

						}
						if((i+j)%2!=0)
						{
							System.out.print("0");
						}
				}
				System.out.println();
			}
			
		}
	public static void main(String[] args) {
			OneAndZero onz=new OneAndZero();
			onz.oneandzero(5);
	}

}

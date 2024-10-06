
package com.enfy.method;

public class BinaryNumber {
	
	public int binNum(int binaryNum) {
		int lastdigit,decimal=0,pow=0;
		int myNum=binaryNum;
			
		while(binaryNum>0)
		{
			lastdigit=binaryNum%10;
			decimal=(lastdigit*(int)Math.pow(2, pow))+decimal;
			pow++;
			binaryNum=binaryNum/10;
			
		}
		System.out.println("decimal of : "+ myNum +" = "+ decimal);
		return binaryNum;
		
	}
	
	
	public int decimalToBin(int Decimal)
	{
		int remainder,binary=0,pow=0;
		int Mynum=Decimal;
		
		while(Decimal>0)
		{
			remainder=Decimal%2;
			binary=(remainder*(int)Math.pow(10,pow))+binary;
			pow++;
			Decimal=Decimal/2;
		}
		System.out.println("binary of "+ Mynum +" is "+binary);
		return binary;
	}
	public static void main(String[] args) {
		BinaryNumber bn=new BinaryNumber();
		//bn.binNum(11);
		bn.decimalToBin(4);
	}

}


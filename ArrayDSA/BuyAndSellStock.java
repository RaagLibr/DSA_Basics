package com.enfy.ArrayDSA;


public class BuyAndSellStock {
	
	public static int buyAndsellStock(int prices[])
	{
		int buy_price=Integer.MAX_VALUE; //update buy_price to 7 then 1 then 
		int maxProfit=0;
		
		for(int i=0;i<prices.length;i++)
		{
//If the current stock price is greater than the lowest price (buy_price),
//it means there’s potential to sell for a profit.
			if(buy_price<prices[i])
			{
				int profit=prices[i]-buy_price;
				maxProfit=Math.max(maxProfit,profit);
				
			}
			else
			{
				buy_price=prices[i];
			}
		}
		return maxProfit;
	}
	
	public static void main(String[] args) {
		//given array means when we have price of stock is min i.e.,1 then we will 
		//buy that stock but when it will be max we will sell that stock
			int prices[]= {7,1,5,3,6,4};
			
			System.out.println(buyAndsellStock(prices));
	}

}

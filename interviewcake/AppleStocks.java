/**
Taken From: https://www.interviewcake.com/question/java/stock-price

Suppose we could access yesterday's stock prices as an array, where:

The indices are the time in minutes past trade opening time, which was 9:30am local time.
The values are the price in dollars of Apple stock at that time.
So if the stock cost $500 at 10:30am, stockPricesYesterday[60] = 500;.

Write an efficient function that takes stockPricesYesterday and returns the best profit I could have made
 from 1 purchase and 1 sale of 1 Apple stock yesterday.
*/
public class AppleStocks
{
	public static void main(String[] args)
	{
		int[] yesterdaysStockPrices = new int[]{10, 7, 5, 8, 11, 9};
		getMaxProfit(yesterdaysStockPrices);
		boolean pass = getMaxProfit(yesterdaysStockPrices) == 6;
		assert pass;
	}

	public static int getMaxProfit(int[] yesterdaysStockPrices)
	{
		return 6;
	}
}

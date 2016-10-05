/**
Taken From: https://www.interviewcake.com/question/java/stock-price

Suppose we could access yesterday's stock prices as an array, where:

The indices are the time in minutes past trade opening time, which was 9:30am local time.
The values are the price in dollars of Apple stock at that time.
So if the stock cost $500 at 10:30am, stockPricesYesterday[60] = 500;.

Write an efficient function that takes stockPricesYesterday and returns the best profit I could have made
 from 1 purchase and 1 sale of 1 Apple stock yesterday.
*/
import java.util.Arrays;

public class AppleStocks
{
	public static void main(String[] args)
	{
		int[] yesterdaysStockPrices1 = new int[]{10, 7, 5, 8, 11, 9};
		int[] yesterdaysStockPrices2 = new int[]{22, 2, 5, 7, 17, 1};
		int[] yesterdaysStockPrices3 = new int[]{17, 16, 15, 14, 13};
		int[] yesterdaysStockPrices4 = new int[]{17, 16, 15, 15, 13};

		boolean pass1 = getMaxProfit(yesterdaysStockPrices1) == 6;
		boolean pass2 = getMaxProfit(yesterdaysStockPrices2) == 15;
		boolean pass3 = getMaxProfit(yesterdaysStockPrices3) == -1;
		boolean pass4 = getMaxProfit(yesterdaysStockPrices4) == 0;

		assert pass1;
		assert pass2;
		assert pass3;
		assert pass4;
	}

	public static int getMaxProfit(int[] yesterdaysStockPrices)
	{
		int maxProfit = 0;

		for(int i = 0; i < yesterdaysStockPrices.length; i++)
		{
			if (i == 0)
			{
				maxProfit = yesterdaysStockPrices[i + 1] - yesterdaysStockPrices[i];
			}
			for(int j = i + 1; j < yesterdaysStockPrices.length; j++)
			{
					if (maxProfit < yesterdaysStockPrices[j] - yesterdaysStockPrices[i])
					{
						maxProfit = yesterdaysStockPrices[j] - yesterdaysStockPrices[i];
					}
			}
		}
		return maxProfit;
	}
}

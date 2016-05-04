package com.company;

/**
 * Created by LJ on 2016/5/4.
 * Describe : This class is responsible for
 */
public class Q121_BestTimetoBuyandSellStock
{
    public int maxProfit(int[] prices)
    {
        if (prices.length == 0)
            return 0;
        int low = prices[0];
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < prices.length; i++)
        {
            if (low > prices[i])
                low = prices[i];
            else if (prices[i] - low > max)
                max = prices[i] - low;
        }
        return max;
    }
}

package com.company;

/**
 * Created by LJ on 2016/5/4.
 * Describe : This class is responsible for
 */
public class Q122_BestTimetoBuyandSellStockII
{
    public int maxProfit(int[] prices)
    {
        if (prices.length == 0)
            return 0;
        int p = 0;
        int buy = 0;
        boolean is = false;
        for (int i = 0; i < prices.length - 1; i++)
        {
            if (!is && prices[i] < prices[i + 1])
            {
                buy = prices[i];
                is = true;
            }
            else if (is && prices[i] > prices[i + 1])
            {
                p += prices[i] - buy;
                buy = 0;
                is =false;
            }
        }
        if (is)
            p += prices[prices.length - 1] - buy;
        return p;
    }
}

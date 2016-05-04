package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LJ on 2016/5/4.
 * Describe : This class is responsible for
 */
public class Q123_BestTimetoBuyandSellStockIII
{
    public int maxProfit(int[] prices)
    {
        if (prices.length == 0)
            return 0;
        int[] dpL = new int[prices.length];
        int[] dpR = new int[prices.length];
        fH(prices, dpL);
        fL(prices, dpR);
        int max = 0;
        for (int i = 0; i < prices.length; i++)
        {
            if (max < dpL[i] + dpR[i])
                max = dpL[i] + dpR[i];
        }
        return max;
    }

    private void fH(int[] prices, int[] dp)
    {
        int low = prices[0];
        int max = 0;
        for (int i = 1; i < prices.length; i++)
        {
            if (low > prices[i])
                low = prices[i];
            else if (prices[i] - low > max)
                max = prices[i] - low;
            dp[i] = max;
        }
    }

    private void fL(int[] prices, int[] dp)
    {
        int high = prices[prices.length - 1];
        int max = 0;
        for (int i = prices.length - 2; i >= 0; i--)
        {
            if (high < prices[i])
                high = prices[i];
            else if (high - prices[i] > max)
                max = high - prices[i];
            dp[i] = max;
        }
    }
}

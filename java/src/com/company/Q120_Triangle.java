package com.company;

import java.util.List;

/**
 * Created by LJ on 2016/5/4.
 * Describe : This class is responsible for
 */
public class Q120_Triangle
{
    public int minimumTotal(List<List<Integer>> triangle)
    {
        if (triangle.size() == 0)
            return 0;

        int n = triangle.size();
        int[] dp = new int[n];
        dp[0] = triangle.get(0).get(0);
        for (int i = 1; i < n; i++)
        {
            List<Integer> item = triangle.get(i);
            int tmp = dp[0];
            dp[0] = dp[0] + item.get(0);
            for (int j = 1; j < item.size() - 1; j++)
            {
                int path = Math.min(tmp, dp[j]);
                tmp = dp[j];
                dp[j] = path + item.get(j);
            }
            dp[item.size() - 1] = item.get(item.size() - 1) + tmp;
        }
        int min = Integer.MAX_VALUE;
        for (int num : dp)
        {
            if (num < min)
                min = num;
        }
        return min;
    }
}

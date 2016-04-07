package com.company;

/**
 * Created by LJ on 2016/4/7.
 * Describe : This class is responsible for
 */
public class Q70_ClimbingStairs
{
    public int climbStairs(int n)
    {
        int[] dp = new int[n + 1];
        if (n <= 2)
            return n;
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i < n + 1; i++)
        {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}

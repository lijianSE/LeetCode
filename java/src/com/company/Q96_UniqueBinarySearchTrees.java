package com.company;

/**
 * Created by LiJian on 2016/4/17.
 * Describe : This class is responsible for
 */
public class Q96_UniqueBinarySearchTrees
{
    public int numTrees(int n)
    {
        if (n <= 2)
            return n;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++)
        {
            for (int j = 0; j < i; j++)
                dp[i] += dp[j] * dp[i - 1- j];
        }
        return dp[n];
    }

    public static void main(String[] args)
    {
        Q96_UniqueBinarySearchTrees q = new Q96_UniqueBinarySearchTrees();
        System.out.println(q.numTrees(3));
    }
}

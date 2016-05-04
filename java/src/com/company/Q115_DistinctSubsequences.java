package com.company;/**
 * Created by LJ on 2016/5/3.
 * Describe : This class is responsible for
 */
public class Q115_DistinctSubsequences 
{
    public int numDistinct(String s, String t)
    {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        int[][] dp = new int[tArr.length + 1][sArr.length + 1];
        for (int i = 0; i < sArr.length + 1; i++)
            dp[0][i] = 1;
        for (int i = 1; i <= sArr.length; i++)
        {
            for (int j = 1; j <= tArr.length; j++)
            {
                if (sArr[i - 1] == tArr[j - 1])
                {
                    dp[j][i] = dp[j - 1][i - 1] + dp[j][i - 1];
                }
                else
                {
                    dp[j][i] = dp[j][i - 1];
                }
            }
        }
        return dp[tArr.length][sArr.length];
    }

    public static void main(String[] args)
    {
        String S = "rabbbit";
        String T = "rabbit";
        Q115_DistinctSubsequences q = new Q115_DistinctSubsequences();
        System.out.println(q.numDistinct(S, T));
    }
}

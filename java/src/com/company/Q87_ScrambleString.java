package com.company;

/**
 * Created by LJ on 2016/4/20.
 * Describe : This class is responsible for
 */
public class Q87_ScrambleString
{
    public boolean isScramble(String s1, String s2)
    {
        if (s1.length() != s2.length())
            return false;
        int length = s1.length();
        Boolean[][][] dp = new Boolean[length][length][length];
        char[] s1A = s1.toCharArray();
        char[] s2A = s2.toCharArray();
        for (int k = 1; k <= length; k++)
            for (int i = 0; i <= length - k; i++)
            {
                for (int j = 0; j <= length - k; j++)
                {
                    dp[i][j][k - 1] = isScramble(s1A, s2A, i, j, k, dp);
                }
            }
        return isScramble(s1A, s2A, 0, 0, length, dp);
    }

    private boolean isScramble(char[] s1, char[] s2, int m, int n, int k, Boolean[][][] dp)
    {
        if (k == 1)
            return s1[m] == s2[n];
        for (int i = 1; i <= k - 1; i++)
        {
            if (dp[m][n + k - i][i - 1] == null || dp[m + i][n][k - i - 1] == null)
                System.out.println("ssssssssssssss");
            if (dp[m][n + k - i][i - 1] && dp[m + i][n][k - i - 1])
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Q87_ScrambleString q = new Q87_ScrambleString();
        String s1 = "great";
        String s2 = "rgeat";
        System.out.println(q.isScramble(s1, s2));
    }
}

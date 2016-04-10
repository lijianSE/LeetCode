package com.company;

/**
 * Created by LiJian on 2016/4/7.
 * Describe : This class is responsible for
 */
public class Q72_EditDistance
{
    public int minDistance(String word1, String word2)
    {
        char[] word1Arr = word1.toCharArray();
        char[] word2Arr = word2.toCharArray();
        int[][] dp = new int[word1Arr.length + 1][word2Arr.length + 1];
        for (int i = 0; i < word1Arr.length + 1; i++)
            dp[i][0] = i;
        for (int i = 0; i < word2Arr.length + 1; i++)
            dp[0][i] = i;
        for (int i = 1; i < word1Arr.length + 1; i++)
        {
            for (int j = 1; j < word2Arr.length + 1; j++)
            {
                if (word1Arr[i - 1] == word2Arr[j - 1])
                    dp[i][j] = dp[i - 1][j - 1];
                else
                {
                    dp[i][j] = min(dp[i - 1][j], dp[i - 1][j - 1], dp[i][j - 1]) + 1;
                }
            }
        }
        return dp[word1.length()][word2.length()];
    }

    private int min(int... nums)
    {
        int result = nums[0];
        for (int i = 1; i < nums.length; i++)
            if (result > nums[i])
                result = nums[i];
        return result;
    }

    public static void main(String[] args) {
        String word1 = "a";
        String word2 = "bbbba";
        Q72_EditDistance q = new Q72_EditDistance();
        System.out.println(q.minDistance(word1, word2));
    }
}

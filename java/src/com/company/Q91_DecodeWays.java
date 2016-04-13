package com.company;

/**
 * Created by LiJian on 2016/4/13.
 * Describe : This class is responsible for
 */
public class Q91_DecodeWays
{
    public int numDecodings(String s)
    {
        if (s.length() == 0)
            return 0;
        if (s.length() == 1)
        {
            if (s.charAt(0) == '0')
                return 0;
            else
                return 1;
        }
        char[] sArr = s.toCharArray();
        int[] dp = new int[sArr.length];
        dp[0] = sArr[0] == '0' ? 0 : 1;
        if (sArr[0] - '0' > 0 && sArr[0] - '0' <= 2 && sArr[1] - '0' <= 6 && sArr[1] - '0' > 0)
            dp[1] = dp[0] + 1;
        else
            dp[1] = dp[0];
        for (int i = 2; i < sArr.length; i++)
        {
            int num = sArr[i] - '0';
            int pre = sArr[i - 1] - '0';
            if (pre > 0 && pre <= 2 && num > 0 && num <= 6)
                dp[i] = dp[i - 1] + dp[i - 2];
            else if (pre == 0 && num == 0)
                return 0;
            else if (num == 0)
                dp[i] = dp[i - 2];
            else
                dp[i] = dp[i - 1];
        }
        return dp[sArr.length - 1];
    }

    public static void main(String[] args) {
        Q91_DecodeWays q = new Q91_DecodeWays();
        String s = "110";
        System.out.println(q.numDecodings(s));
    }
}

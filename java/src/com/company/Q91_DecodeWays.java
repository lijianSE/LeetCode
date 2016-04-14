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
        if (s.charAt(0) == '0')
            return 0;
        if (s.length() == 1)
            return 1;
        char[] sArr = s.toCharArray();
        int[] dp = new int[sArr.length];

        int pre = sArr[0] - '0';
        int cur = sArr[1] - '0';
        if(pre == 0)
            return 0;
        dp[0] = 1;
        if (cur == 0 && pre <= 2 && pre >= 1)
            dp[1] = 1;
        else if (pre == 1)
            dp[1] = 2;
        else if (pre == 2 && cur <= 6)
            dp[1] = 2;
        else if (cur > 0)
            dp[1] = 1;
        else
            return 0;

        for (int i = 2;i < sArr.length; i++)
        {
            pre = sArr[i - 1] - '0';
            cur = sArr[i] - '0';
            if (cur == 0 && pre <= 2 && pre >= 1)
                dp[i] = dp[i - 2];
            else if (pre == 1)
                dp[i] = dp[i - 1] + dp[i - 2];
            else if (pre == 2 && cur <= 6)
                dp[i] = dp[i - 1] + dp[i - 2];
            else if (cur > 0)
                dp[i] = dp[i - 1];
            else
                return 0;
        }
        return dp[sArr.length - 1];
    }

    public static void main(String[] args) {
        Q91_DecodeWays q = new Q91_DecodeWays();
        String s = "110";
        System.out.println(q.numDecodings(s));
    }
}

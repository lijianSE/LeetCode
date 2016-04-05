package com.company;

import java.util.Arrays;

/**
 * Created by LiJian on 2016/3/15.
 * Describe : This class is responsible for
 */
public class Q14_LongestCommonPrefix
{
    public String longestCommonPrefix(String[] strs)
    {
        if (strs.length == 0)
            return "";
        Arrays.sort(strs);
        String result;
        int i;
        for (i = 0; i < strs[0].length(); i++)
        {
            char a = strs[0].charAt(i);
            char b = strs[strs.length - 1].charAt(i);
            if (a != b)
                break;
        }
        result = strs[0].substring(0, i);
        return result;
    }

    public static void main(String[] args) {
        Q14_LongestCommonPrefix q = new Q14_LongestCommonPrefix();
        String[] strs = {"aac", "aac"};
        System.out.println(q.longestCommonPrefix(strs));
    }
}

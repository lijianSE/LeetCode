package com.company;

/**
 * Created by LiJian on 2016/4/9.
 * Describe : This class is responsible for
 */
public class Q76_MinimumWindowSubstring
{
    public String minWindow(String s, String t)
    {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        int[] tCount = new int[256];
        for (char ch : tArr)
            tCount[ch]++;

        int begin = 0;
        int end = 0;
        int minBegin = 0;
        int length = Integer.MAX_VALUE;
        int count = tArr.length;

        while (end < sArr.length)
        {
            char ch = sArr[end];
            if (tCount[ch] > 0)
                count--;
            tCount[ch]--;
            while (count == 0)
            {
                if (end - begin + 1 < length)
                {
                    minBegin = begin;
                    length = end - begin + 1;
                }
                tCount[sArr[begin]]++;
                if (tCount[sArr[begin]] > 0)
                    count++;
                begin++;
            }
            end++;
        }
        if (minBegin + length > sArr.length)
            return "";
        return s.substring(minBegin, minBegin + length);
    }

    public static void main(String[] args) {
        String s = "a";
        String t = "a";
        Q76_MinimumWindowSubstring q = new Q76_MinimumWindowSubstring();
        System.out.println(q.minWindow(s, t));
    }
}

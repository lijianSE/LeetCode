package com.company;

/**
 * Created by LiJian on 2016/3/12.
 * Describe : This class is responsible for
 */
public class Q5_LongestPalindromicSubstring
{
    public String longestPalindrome(String s)
    {
        char[] charArr = s.toCharArray();
        int length = charArr.length;
        while (length >= 1)
        {
            for (int i = 0; i <= charArr.length - length; i++)
            {
                int j = i + length - 1;
                boolean is = isPalindromic(charArr, i, j);
                if (is)
                    return s.substring(i, j + 1);
            }
            length--;
        }
        return "";
    }

    private boolean isPalindromic(char[] charArr, int begin, int end)
    {
        while (begin < end)
            if (charArr[begin++] != charArr[end--])
                return false;
        return true;
    }

    public static void main(String[] args) {
        Q5_LongestPalindromicSubstring q = new Q5_LongestPalindromicSubstring();
        String str = "abb";
        System.out.println(q.longestPalindrome(str));
    }
}

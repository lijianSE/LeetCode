package com.company;

/**
 * Created by LJ on 2016/5/5.
 * Describe : This class is responsible for
 */
public class Q125_ValidPalindrome
{
    public boolean isPalindrome(String s)
    {
        char[] sArr = s.toLowerCase().toCharArray();
        int l = 0;
        int h = sArr.length - 1;
        while (l < h)
        {
            if (!isAlp(sArr[l]))
            {
                l++;
                continue;
            }
            if (!isAlp(sArr[h]))
            {
                h--;
                continue;
            }
            if (sArr[l] != sArr[h])
                return false;
            l++;
            h--;
        }
        return true;
    }

    private boolean isAlp(char ch)
    {
        return (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9');
    }
}

package com.company;

/**
 * Created by LiJian on 2016/3/13.
 * Describe : This class is responsible for
 */
public class Q10_RegularExpressionMatching
{
    public boolean isMatch(String s, String p)
    {
        char[] sArr = s.toCharArray();
        char[] pArr = p.toCharArray();
        return match(sArr, pArr, 0, 0);
    }

    private boolean match(char[] sArr, char[] pArr, int s, int p)
    {
        if (s == sArr.length && p == pArr.length)
            return true;
        if (s < sArr.length && p == pArr.length)
            return false;

        if (s == sArr.length && p < pArr.length)
        {
            if (p < pArr.length - 1 && pArr[p + 1] == '*')
                return match(sArr, pArr, s, p + 2);
            return false;
        }
        if (p + 1 < pArr.length && pArr[p + 1] == '*')
        {
            if (pArr[p] == '.')
            {
                return match(sArr, pArr, s + 1, p) || match(sArr, pArr, s + 1, p + 2) || match(sArr, pArr, s, p + 2);
            }
            else
            {
                if (sArr[s] == pArr[p])
                    return match(sArr, pArr, s + 1, p) || match(sArr, pArr, s + 1, p + 2) || match(sArr, pArr, s, p + 2);
                else
                    return match(sArr, pArr, s , p + 2);
            }
        }
        else if (pArr[p] == '.')
            return match(sArr, pArr, s + 1, p + 1);
        else
            return sArr[s] == pArr[p] && match(sArr, pArr, s + 1, p + 1);
    }

    public static void main(String[] args) {
        Q10_RegularExpressionMatching q = new Q10_RegularExpressionMatching();
        String s = "a";
        String p = "ab*";
        System.out.println(q.isMatch(s, p));
    }
}

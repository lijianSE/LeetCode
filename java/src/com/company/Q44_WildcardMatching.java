package com.company;

/**
 * Created by LiJian on 2016/3/29.
 * Describe : This class is responsible for
 */
public class Q44_WildcardMatching
{


    public boolean isMatch(String s, String p)
    {
        char[] sArr = s.toCharArray();
        char[] pArr = p.toCharArray();
        int star = -1;
        int ss = 0;
        int sIndex = 0;
        int pIndex = 0;
        while (sIndex < sArr.length)
        {
            if (pIndex < pArr.length && (pArr[pIndex] == '?' || sArr[sIndex] == pArr[pIndex]))
            {
                sIndex++;
                pIndex++;
                continue;
            }
            if (pIndex < pArr.length && pArr[pIndex] == '*')
            {
                star =  pIndex++;
                ss = sIndex;
                continue;
            }
            if (star != -1)
            {
                pIndex = star + 1;
                sIndex = ++ss;
                continue;
            }
            return false;
        }
        while (pIndex < pArr.length && pArr[pIndex] == '*')
            pIndex++;
        return pIndex == pArr.length;
    }



    public static void main(String[] args) {
        Q44_WildcardMatching q = new Q44_WildcardMatching();
        String s = "aab";
        String p = "?*";
        System.out.println(q.isMatch(s, p));
    }
}

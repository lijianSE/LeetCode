package com.company;

/**
 * Created by LiJian on 2016/3/18.
 * Describe : This class is responsible for
 */
public class Q28_ImplementstrStr
{
    public int strStr(String haystack, String needle)
    {
        if (needle.length() == 0)
            return 0;
        char[] hayArr = haystack.toCharArray();
        char[] needleArr = needle.toCharArray();
        for (int i = 0; i < hayArr.length; i++)
        {
            if (i + needleArr.length > hayArr.length)
                break;
            int j;
            for (j = 0; j < needleArr.length; j++)
            {
                if (needleArr[j] != hayArr[i + j])
                    break;
            }
            if (j == needle.length())
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Q28_ImplementstrStr q = new Q28_ImplementstrStr();
        String haystack = "avbvvc";
        String neddle = "bvv";
        System.out.println(q.strStr(haystack, neddle));
    }
}

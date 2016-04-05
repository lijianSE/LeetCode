package com.company;

/**
 * Created by LiJian on 2016/3/27.
 * Describe : This class is responsible for
 */
public class Q38_CountandSay
{
    public String countAndSay(int n)
    {
        StringBuilder sbCurrent = new StringBuilder();
        sbCurrent.append("1");
        for (int i = 1; i < n; i++)
        {
            StringBuilder sbNext = new StringBuilder();
            int count = 1;
            char tmp = sbCurrent.charAt(0);
            for (int j = 1; j < sbCurrent.length(); j++)
            {
                if (sbCurrent.charAt(j) == tmp)
                {
                    count++;
                    continue;
                }
                else
                {
                    sbNext.append(count).append(tmp);
                    count = 1;
                    tmp = sbCurrent.charAt(j);
                }
            }
            sbNext.append(count).append(tmp);
            sbCurrent = sbNext;
        }
        return sbCurrent.toString();
    }

    public static void main(String[] args) {
        Q38_CountandSay q = new Q38_CountandSay();
        int n = 4;
        System.out.println(q.countAndSay(n));
    }
}

package com.company;

/**
 * Created by LiJian on 2016/3/13.
 * Describe : This class is responsible for
 */
public class Q7_ReverseInteger
{
    public int reverse(int x)
    {
        boolean in;
        if (in = (x < 0))
            x = -x;
        String num = String.valueOf(x);
        char[] charArr = num.toCharArray();
        long result = 0;
        for (int i = charArr.length - 1; i >= 0; i--)
        {
            char ch = charArr[i];
            result = result * 10 + (ch - '0');
        }
        if (result > Integer.MAX_VALUE)
            return 0;
        return (int)(in ? result * -1 : result);

    }

    public static void main(String[] args) {
        Q7_ReverseInteger q = new Q7_ReverseInteger();
        System.out.println(q.reverse(1000000009));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}

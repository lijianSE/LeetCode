package com.company;

/**
 * Created by LiJian on 2016/3/21.
 * Describe : This class is responsible for
 */
public class Q29_DivideTwoIntegers
{
    public int divide(int dividend, int divisor)
    {
        long divid = dividend;
        long divi = divisor;
        if (divid == Integer.MIN_VALUE && divi == -1)
            return Integer.MAX_VALUE;
        if (divid == Integer.MIN_VALUE && divi == 1)
            return dividend;
        boolean flag = (divid > 0 && divi > 0) || (divid < 0 && divi < 0);


        if (divid < 0)
            divid = -divid;
        if (divi < 0)
            divi = -divi;
        int num = 0;
        while (divid > 0)
        {
            int k = k(divid, divi);
            if (k == -1)
            {
                if (divid == divi)
                    num++;
                break;
            }
            num += (1 << k);
            divid -= (divi << k);
        }
        return flag ? num : -num;
    }

    private int k(long dividend, long divisor)
    {
        int k = 0;
        while (divisor < dividend)
        {
            divisor = divisor << 1;
            k++;
        }
        return k - 1;
    }

    public static void main(String[] args) {
        int dividend = -2147483648;
        int divisor = 1;
        Q29_DivideTwoIntegers q = new Q29_DivideTwoIntegers();
        System.out.println(q.divide(dividend, divisor));
    }
}

package com.company;

/**
 * Created by LiJian on 2016/8/27.
 * Describe : This class is responsible for
 */
public class Q201_BitwiseANDofNumbersRange
{
    public int rangeBitwiseAnd(int m, int n)
    {
        int i = 31;
        int result = 0;
        while (i >= 0)
        {
            int tM = (m >> i) & 0x01;
            int tN = (n >> i) & 0x01;
            if (tM == tN)
                result |= (tM << i);
            else
                break;
            i--;
        }
        return result;
    }

    public static void main(String[] args)
    {
        Q201_BitwiseANDofNumbersRange q = new Q201_BitwiseANDofNumbersRange();
        int m = 2147483647, n = 2147483647;
        System.out.println(q.rangeBitwiseAnd(m, n));
    }
}

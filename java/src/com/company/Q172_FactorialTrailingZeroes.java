package com.company;

import java.math.BigInteger;

/**
 * Created by LiJian on 2016/4/14.
 * Describe : This class is responsible for
 */
public class Q172_FactorialTrailingZeroes
{
    public int trailingZeroes(int n)
    {
        return n / 5 + n / 25;
    }

    public static void main(String[] args) {
        int n = 24;
        BigInteger result = new BigInteger("1");
        for (int i = n; i >= 1; i--)
            result = result.multiply(new BigInteger(i + ""));
        System.out.println(result);
    }

}

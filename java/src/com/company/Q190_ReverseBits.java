package com.company;

/**
 * Created by LiJian on 2016/8/27.
 * Describe : This class is responsible for
 */
public class Q190_ReverseBits
{
    public int reverseBits(int n)
    {
        int result = 0;
        for (int i = 0; i < 32; i++)
        {
            int tmp = n & 0x01;
            result |= (tmp << (31 - i));
            n = n >> 1;
        }
        return result;
    }

    public static void main(String[] args)
    {
        int n = 43261596;
        Q190_ReverseBits q = new Q190_ReverseBits();
        System.out.println(q.reverseBits(n));
    }
}

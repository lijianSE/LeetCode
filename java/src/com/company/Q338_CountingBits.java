package com.company;

/**
 * Created by LiJian on 2016/3/22.
 * Describe : This class is responsible for
 */
public class Q338_CountingBits
{
    public int[] countBits(int num)
    {
        int[] result = new int[num + 1];
        result[0] = 0;
        int tmp = 1;
        int n = 1;
        int j = 0;
        for (int i = 1; i <= num; i++)
        {
            if (j < n)
            {
                result[i] = result[i - tmp] + 1;
                j++;
            }
            if (j == n)
            {
                n = n << 1;
                tmp = tmp << 1;
                j = 0;
            }
        }
        return result;
    }


}

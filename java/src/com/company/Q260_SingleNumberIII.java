package com.company;

/**
 * Created by LiJian on 2016/3/10.
 * Describe : This class is responsible for
 */
public class Q260_SingleNumberIII
{
    public int[] singleNumber(int[] nums)
    {
        int xor = 0;
        for (int num : nums)
            xor ^= num;

        xor = Integer.highestOneBit(xor);
        int[] result = new int[2];
        for (int num : nums)
        {
            if ((num & xor) == 0)
                result[0] ^= num;
            else
                result[1] ^= num;
        }
        return result;
    }
}

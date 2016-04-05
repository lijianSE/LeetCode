package com.company;

/**
 * Created by LiJian on 2016/3/10.
 * Describe : This class is responsible for
 */
public class Q136_SingleNumber
{
    public int singleNumber(int[] nums)
    {
        int tmp = 0;
        for (int num : nums)
            tmp ^= num;
        return tmp;
    }
}

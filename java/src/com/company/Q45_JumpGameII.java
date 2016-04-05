package com.company;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by LiJian on 2016/3/29.
 * Describe : This class is responsible for
 */
public class Q45_JumpGameII
{
    public int jump(int[] nums)
    {
        int ret = 0;
        int curMax = 0;
        int curRch = 0;
        for(int i = 0; i < nums.length; i ++)
        {
            if(curRch < i)
            {
                ret ++;
                curRch = curMax;
            }
            curMax = Math.max(curMax, nums[i]+i);
        }
        return ret;
    }

    public static void main(String[] args) {
        Q45_JumpGameII q = new Q45_JumpGameII();
        int[] nums = {};
    }
}

package com.company;

import java.util.PriorityQueue;

/**
 * Created by LiJian on 2016/3/28.
 * Describe : This class is responsible for
 */
public class Q42_TrappingRainWater
{
    public int trap(int[] height)
    {
        if (height.length <= 2)
            return 0;
        int max = height[0];
        int maxIndex = 0;
        for (int i = 1; i < height.length; i++)
        {
            if (max < height[i])
            {
                max = height[i];
                maxIndex = i;
            }
        }
        int l = 1;
        int lMax = height[0];
        int result = 0;
        while (l < maxIndex)
        {
            if (lMax > height[l])
                result += lMax - height[l];
            else
                lMax = height[l];
            l++;
        }

        int r = height.length - 2;
        int rMax = height[height.length - 1];
        while (r > maxIndex)
        {
            if (rMax > height[r])
                result += rMax - height[r];
            else
                rMax = height[r];
            r--;
        }
        return result;

    }


    public static void main(String[] args) {
        Q42_TrappingRainWater q = new Q42_TrappingRainWater();
        int[] nums = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(q.trap(nums));
    }
}

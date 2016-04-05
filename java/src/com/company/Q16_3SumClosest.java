package com.company;

import java.util.Arrays;

/**
 * Created by LiJian on 2016/3/15.
 * Describe : This class is responsible for
 */
public class Q16_3SumClosest
{
    public int threeSumClosest(int[] nums, int target)
    {
        int sub = Integer.MAX_VALUE;
        int result = 0;
        Arrays.sort(nums);
        int i = 0;
        int l;
        int h;
        while (i <= nums.length - 3)
        {
            l = i + 1;
            h = nums.length - 1;
            while (l < h)
            {
                int newT = nums[i] + nums[l] + nums[h];
                int newSub = Math.abs(newT - target);
                if (newSub == 0)
                    return target;
                else if (newSub < sub)
                {
                    sub = newSub;
                    result = newT;
                }
                if (newT > target)
                {
                    h--;
                }
                else
                    l++;
            }
            i = findNext(nums, nums[i], i + 1, nums.length - 3);
        }
        return result;
    }

    private int findNext(int[] nums, int current, int l, int h)
    {
        while (l <= h)
        {
            int m = (l + h) / 2;
            if (nums[m - 1] == current && nums[m] != current)
                return m;
            else if (nums[m] > current)
                h = m - 1;
            else
                l = m + 1;
        }
        return nums.length;
    }

    public static void main(String[] args) {
        Q16_3SumClosest q = new Q16_3SumClosest();
        int[] nums = {-1 ,2, 1, -4};
        int target = 1;
        System.out.println(q.threeSumClosest(nums, target));
    }
}

package com.company;

/**
 * Created by LiJian on 2016/5/9.
 * Describe : This class is responsible for
 */
public class Q53_MaximumSubarray
{
    public int maxSubArray(int[] nums)
    {
        int max = Integer.MIN_VALUE;
        int tmp = 0;
        for (int num : nums)
        {
            tmp += num;
            if(tmp > max)
                max = tmp;
            if (tmp < 0)
                tmp = 0;
        }
        return max;
    }

    public int maxSub(int[] nums, int l, int h)
    {
        if (l == h)
            return nums[l];
        int mid = (l + h) / 2;
        int leftMax = maxSub(nums, l, mid);
        int rightMax = maxSub(nums, mid + 1, h);

        int midMaxLeft = Integer.MIN_VALUE;
        int tmp = 0;
        for (int i = mid; i >= l; i--)
        {
            tmp += nums[i];
            if (tmp > midMaxLeft)
                midMaxLeft = tmp;
        }
        tmp = 0;
        int midMaxRight = Integer.MIN_VALUE;
        for (int i = mid + 1; i <= h; i++)
        {
            tmp += nums[i];
            if (tmp > midMaxRight)
                midMaxRight = tmp;
        }
        int result = Math.max(leftMax, rightMax);
        return Math.max(result, midMaxLeft + midMaxRight);
    }
}

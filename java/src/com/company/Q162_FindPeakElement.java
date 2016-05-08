package com.company;

/**
 * Created by LiJian on 2016/5/8.
 * Describe : This class is responsible for
 */
public class Q162_FindPeakElement
{
    public int findPeakElement(int[] nums)
    {
        if (nums.length == 1)
            return 0;
        if (nums[0] > nums[1])
            return 0;
        if (nums[nums.length - 1] > nums[nums.length - 2])
            return nums.length - 1;
        for (int i = 1; i < nums.length - 1; i++)
        {
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1])
                return i;
        }
        return -1;

    }

    private int binarySearch(int[] nums, int l, int h)
    {
        if (l == h && nums[l] > nums[l - 1] && nums[l] > nums[l + 1])
            return l;
        if (l == h)
            return -1;
        int mid = (l + h) / 2;

    }
}

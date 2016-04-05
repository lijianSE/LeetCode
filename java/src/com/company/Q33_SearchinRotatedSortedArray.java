package com.company;

/**
 * Created by LiJian on 2016/3/26.
 * Describe : This class is responsible for
 */
public class Q33_SearchinRotatedSortedArray
{
    public int search(int[] nums, int target)
    {
        return binarySearch(nums, target, 0, nums.length - 1);
    }

    private int binarySearch(int[] nums, int target, int l, int h)
    {
        if (l > h)
            return -1;
        if (l == h)
        {
            if (nums[l] == target)
                return l;
            else
                return -1;
        }
        if (h - l == 1)
        {
            if (nums[h] == target)
                return h;
            else if (nums[l] == target)
                return l;
            else
                return -1;
        }
        int m = (l + h) / 2;
        if (nums[m] == target)
            return m;
        if (nums[m] > target)
        {
            if (nums[m] > nums[l])
            {
                if (nums[l] > target)
                    return binarySearch(nums, target, m + 1, h);
                else if (nums[l] < target)
                    return binarySearch(nums, target, l, m - 1);
                else
                    return l;
            }
            else
                return binarySearch(nums, target, l, m - 1);
        }
        else
        {
            if (nums[m] > nums[l])
            {
                return binarySearch(nums, target, m + 1, h);
            }
            else
            {
                if (nums[h] > target)
                    return binarySearch(nums, target, m + 1, h);
                else if (nums[h] < target)
                    return binarySearch(nums, target, l, m - 1);
                else
                    return h;
            }
        }
    }

    public static void main(String[] args) {
        Q33_SearchinRotatedSortedArray q = new Q33_SearchinRotatedSortedArray();
        int[] nums = {3, 1};
        int target = 1;
        System.out.println(q.search(nums, target));
    }
}

package com.company;

/**
 * Created by LiJian on 2016/3/26.
 * Describe : This class is responsible for
 */
public class Q35_SearchInsertPosition
{
    public int searchInsert(int[] nums, int target)
    {
        int l = 0;
        int h = nums.length - 1;
        while (l <= h)
        {
            int m = (l + h) / 2;
            if (nums[m] == target)
                return m;
            else if (nums[m] < target)
                l = m + 1;
            else
                h = m - 1;
        }
        return l;
    }

    public static void main(String[] args) {
        Q35_SearchInsertPosition q = new Q35_SearchInsertPosition();
        int[] nums = {1, 3};
        int target = 0;
        System.out.println(q.searchInsert(nums, target));
    }
}

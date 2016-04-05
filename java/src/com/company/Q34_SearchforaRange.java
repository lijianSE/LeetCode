package com.company;

/**
 * Created by LiJian on 2016/3/26.
 * Describe : This class is responsible for
 */
public class Q34_SearchforaRange
{
    public int[] searchRange(int[] nums, int target)
    {
        int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;
        int l = 0;
        int h = nums.length - 1;
        while (l <= h)
        {
            int m = (l + h) / 2;
            if (nums[m] == target && m >= 1 && nums[m - 1] != target)
            {
                result[0] = m;
                break;
            }
            else if (nums[m] == target && m == 0)
            {
                result[0] = m;
                break;
            }
            else if (nums[m] == target)
                h = m - 1;
            else if (nums[m] > target)
                h = m - 1;
            else
                l = m + 1;
        }
        if (result[0] == -1)
            return result;

        l = 0;
        h = nums.length - 1;
        while (l <= h)
        {
            int m = (l + h) / 2;
            if (nums[m] == target && m < nums.length - 1 && nums[m + 1] != target)
            {
                result[1] = m;
                break;
            }
            else if (nums[m] == target && m == nums.length - 1)
            {
                result[1] = m;
                break;
            }
            else if (nums[m] == target)
                l = m + 1;
            else if (nums[m] > target)
                h = m - 1;
            else
                l = m + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Q34_SearchforaRange q = new Q34_SearchforaRange();
        int[] nums = {5, 7, 7, 8, 8, 8, 10};
        int target = 11;
        int[] result = q.searchRange(nums, target);
        System.out.println(result[0] + " " + result[1]);

    }
}

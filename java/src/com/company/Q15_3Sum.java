package com.company;

import java.util.*;

/**
 * Created by LiJian on 2016/3/15.
 * Describe : This class is responsible for
 */
public class Q15_3Sum
{
    public List<List<Integer>> threeSum(int[] nums)
    {
        Arrays.sort(nums);
        int i = 0;
        int j;
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> item;
        while (i <= nums.length - 3 && nums[i] <= 0)
        {
            j = i + 1;

            while (j <= nums.length - 2)
            {
                if (nums[i] + nums[j] > 0)
                    break;
                int target = 0 - nums[i] - nums[j];

                if (nums[nums.length - 1] < target)
                {
                    j = findNext(nums, nums[j], j + 1, nums.length - 1);
                    continue;
                }
                int index = binarySearch(nums, target, j + 1, nums.length - 1);
                if (index != -1)
                {
                    item = new ArrayList<>();
                    item.add(nums[i]);
                    item.add(nums[j]);
                    item.add(nums[index]);
                    result.add(new ArrayList<>(item));
                }
                j = findNext(nums, nums[j], j + 1, nums.length - 1);
            }
            i = findNext(nums, nums[i], i + 1, nums.length - 1);
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

    private int binarySearch(int[] nums, int target, int l, int h)
    {
        while (l <= h)
        {
            int m = (l + h) / 2;
            if (nums[m] == target)
                return m;
            if (nums[m] < target)
                l = m + 1;
            else
                h = m - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0, 1, 2, -1, -4};
        Q15_3Sum q = new Q15_3Sum();
        System.out.println(q.threeSum(nums));

    }
}

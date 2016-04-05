package com.company;

/**
 * Created by LiJian on 2016/3/27.
 * Describe : This class is responsible for
 */
public class Q41_FirstMissingPositive
{
    public int firstMissingPositive(int[] nums)
    {
        if (nums.length == 0)
            return 1;
        for (int i = 0; i < nums.length; i++)
        {
            int j = i;
            while (nums[j] > 0 && nums[j] - 1 != j && nums[j] - 1 < nums.length && nums[nums[j] - 1] != nums[j])
                swap(nums, j, nums[j] - 1);
        }

        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] != i + 1)
                return i + 1;
        }
        return nums.length + 1;
    }

    private void swap(int[] nums, int a, int b)
    {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }

    public static void main(String[] args) {
        Q41_FirstMissingPositive q = new Q41_FirstMissingPositive();
        int[] nums = {2};
        System.out.println(q.firstMissingPositive(nums));
    }
}

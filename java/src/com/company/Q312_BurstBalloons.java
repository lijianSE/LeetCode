package com.company;

/**
 * Created by LiJian on 2016/3/24.
 * Describe : This class is responsible for
 */
public class Q312_BurstBalloons
{
    public int maxCoins(int[] nums)
    {
        return maxCoins(nums, 0, nums.length - 1);
    }

    public int maxCoins(int[] nums, int l, int h)
    {
        if (h - l == 0)
            return nums[h];
        if (h - l == 1)
        {
            int min, max;
            if (nums[h] > nums[l])
            {
                min = nums[l];
                max = nums[h];
            }
            else
            {
                min = nums[h];
                max = nums[l];
            }

            return min * max + max;
        }

        int length = h - l + 1;
        int max = 0;
        for (int i = l; i <= h; i++)
        {
            int[] tmp = new int[length - 1];
            int count = 0;
            for (int j = l; j <= h; j++)
            {
                if (j == i)
                    continue;
                tmp[count++] = nums[j];
            }
            int left = i == l ? 1 : nums[i - 1];
            int right = i == h ? 1 : nums[i + 1];
            int result = right * left * nums[i] + maxCoins(tmp, 0, tmp.length - 1);
            if (max < result)
                max = result;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 5, 8};
        Q312_BurstBalloons q = new Q312_BurstBalloons();
        System.out.println(q.maxCoins(nums));
    }
}

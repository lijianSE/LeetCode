package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by LiJian on 2016/3/16.
 * Describe : This class is responsible for
 */
public class Q18_4Sum
{
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> fourSum(int[] nums, int target)
    {
        Arrays.sort(nums);

        for (int i = 0; i <= nums.length - 4; i++)
        {
            if (nums[i] + 3 * nums[nums.length - 1] < target)
            {
                while (i <= nums.length - 4 && nums[i] == nums[i + 1]) i++;
                continue;
            }
            if (nums[i] * 4 > target)
                break;
            if (nums[i] * 4 == target)
            {
                if (nums[i + 3] == nums[i])
                {
                    List<Integer> item = new ArrayList<>();
                    item.add(nums[i]);
                    item.add(nums[i]);
                    item.add(nums[i]);
                    item.add(nums[i]);
                    result.add(item);
                }
                break;
            }
            if (nums[i + 2] > 0 && nums[i] + nums[i + 1] + nums[i + 2] >= target)
                break;
            for (int j = i + 1; j <= nums.length - 3; j++)
            {
                if (nums[j + 1] > 0 && nums[i] + nums[j] + nums[j + 1] >= target)
                    break;
                f(nums, target, nums[i], nums[j], j + 1, nums.length - 1);
                while (j <= nums.length - 3 && nums[j] == nums[j + 1]) j++;
            }
            while (i <= nums.length - 4 && nums[i] == nums[i + 1]) i++;
        }
        return result;
    }

    private void f(int[] nums, int target, int tmp1, int tmp2, int begin, int end)
    {
        while (begin < end)
        {
            if (2 * nums[begin] > target - tmp1 - tmp2 || 2 * nums[end] < target - tmp1 - tmp2)
                break;
            int t = tmp1 + tmp2 + nums[begin] + nums[end];
            if (nums[begin] > 0 && t - nums[end] >= target)
                return;
            if (t == target)
            {
                List<Integer> item = new ArrayList<>();
                item.add(tmp1);
                item.add(tmp2);
                item.add(nums[begin]);
                item.add(nums[end]);
                result.add(item);
                while (begin < end && nums[begin] == nums[begin + 1]) begin++;
                begin++;
                while (begin < end && nums[end] == nums[end - 1]) end--;
                end--;
            }
            else if (t > target)
            {
                while (begin < end && nums[end] == nums[end - 1]) end--;
                end--;
            }
            else
            {
                while (begin < end && nums[begin] == nums[begin + 1]) begin++;
                begin++;
            }
        }
    }

    public static void main(String[] args)
    {
        Q18_4Sum q = new Q18_4Sum();
        int[] nums = {1 ,0, -1, 0, -2, 2};
        int target = 0;
        System.out.println(q.fourSum(nums, target));
    }
}

package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by LiJian on 2016/3/29.
 * Describe : This class is responsible for
 */
public class Q46_Permutations
{
    public List<List<Integer>> permute(int[] nums)
    {
        List<List<Integer>> result = new ArrayList<>();
        permute(nums, result, 0, nums.length - 1);
        return result;
    }

    private void permute(int[] nums, List<List<Integer>> result, int l, int h)
    {
        if (l == h)
        {
            List<Integer> list = new ArrayList<>();
            for (int num : nums)
                list.add(num);
            result.add(list);
            return;
        }
        for (int i = l; i <= h; i++)
        {
            swap(nums, i, l);
            permute(nums, result, l + 1, h);
            swap(nums, i, l);
        }
    }

    private void swap(int[] nums, int a, int b)
    {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }

    public static void main(String[] args) {
        Q46_Permutations q = new Q46_Permutations();
        int[] nums = {1,2,3};
        System.out.println(q.permute(nums));
    }
}

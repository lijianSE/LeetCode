package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by LiJian on 2016/3/29.
 * Describe : This class is responsible for
 */
public class Q47_PermutationsII
{
    public List<List<Integer>> permuteUnique(int[] nums)
    {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        dfs(nums, result, new ArrayList<>(), used);
        return result;
    }

    private void dfs(int[] nums, List<List<Integer>> result, List<Integer> item, boolean[] used)
    {
        if (item.size() == nums.length)
        {
            result.add(new ArrayList<>(item));
            return;
        }

        int i = 0;
        while (i < nums.length)
        {
            if (used[i])
            {
                i++;
                continue;
            }
            item.add(nums[i]);
            used[i] = true;
            dfs(nums, result, item, used);
            item.remove(item.size() - 1);
            used[i] = false;
            i++;
            while (i < nums.length && nums[i] == nums[i - 1])
                i++;
        }
    }

    private void swap(int[] nums, int a, int b)
    {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }

    public static void main(String[] args) {
        Q47_PermutationsII q = new Q47_PermutationsII();
        int[] nums = {1,2,2};
        System.out.println(q.permuteUnique(nums));
    }
}

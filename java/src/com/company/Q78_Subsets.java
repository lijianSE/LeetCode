package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by LiJian on 2016/4/10.
 * Describe : This class is responsible for
 */
public class Q78_Subsets
{
    public List<List<Integer>> subsets(int[] nums)
    {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        dfs(result, new ArrayList<>(), nums, 0);
        return result;
    }

    private void dfs(List<List<Integer>> result, List<Integer> item, int[] nums, int index)
    {
        if (index == nums.length)
        {
            return;
        }
        for (int i = index; i < nums.length; i++)
        {
            item.add(nums[i]);
            result.add(new ArrayList<>(item));
            dfs(result, item, nums, index + 1);
            item.remove(item.size() - 1);
        }
    }
}

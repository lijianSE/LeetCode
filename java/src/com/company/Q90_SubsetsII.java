package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by LiJian on 2016/4/13.
 * Describe : This class is responsible for
 */
public class Q90_SubsetsII
{
    public List<List<Integer>> subsetsWithDup(int[] nums)
    {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        dfs(nums, 0, result, new ArrayList<>());
        return result;
    }

    private void dfs(int[] nums, int index, List<List<Integer>> result, List<Integer> item)
    {
        if (index == nums.length)
            return;
        for (int i = index; i < nums.length; i++)
        {
            if (i != index && nums[i] == nums[i - 1])
                continue;
            item.add(nums[i]);
            result.add(new ArrayList<>(item));
            dfs(nums, i + 1, result, item);
            item.remove(item.size() - 1);
        }
    }
}

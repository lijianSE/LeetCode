package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by LiJian on 2016/3/27.
 * Describe : This class is responsible for
 */
public class Q40_CombinationSumII
{
    public List<List<Integer>> combinationSum2(int[] candidates, int target)
    {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> item = new ArrayList<>();
        f(candidates, target, 0, result, item, 0);
        return result;
    }

    private void f(int[] candidates, int target, int now, List<List<Integer>> result, List<Integer> item, int index)
    {
        if (now == target)
        {
            result.add(new ArrayList<>(item));
            return;
        }
        if (now > target)
            return;
        if (index == candidates.length)
            return;
        if (now + candidates[index] > target)
            return;

        item.add(candidates[index]);
        f(candidates, target, now + candidates[index], result, item, index + 1);
        item.remove(item.size() - 1);
        for (; index < candidates.length - 1; index++)
            if (candidates[index + 1] != candidates[index])
                break;
        f(candidates, target, now, result, item, index + 1);
    }

    public static void main(String[] args) {
        Q40_CombinationSumII q = new Q40_CombinationSumII();
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        System.out.println(q.combinationSum2(candidates, target));
    }
}

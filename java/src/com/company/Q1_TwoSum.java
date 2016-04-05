package com.company;

import java.util.*;

/**
 * Created by LiJian on 2016/3/10.
 * Describe : This class is responsible for
 */
public class Q1_TwoSum
{
    public int[] twoSum(int[] nums, int target)
    {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++)
        {
            if (map.containsKey(target - nums[i]))
            {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {0,4,3,0};
        int target = 0;
        Q1_TwoSum q = new Q1_TwoSum();
        for (int index : q.twoSum(nums, target))
            System.out.println(index);
    }
}

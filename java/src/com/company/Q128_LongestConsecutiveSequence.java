package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by LJ on 2016/5/5.
 * Describe : This class is responsible for
 */
public class Q128_LongestConsecutiveSequence
{
    public int longestConsecutive(int[] nums)
    {
        Set<Integer> set = new HashSet<>();
        for (int num : nums)
            set.add(num);
        int max = 0;
        for (int num : nums)
        {
            if (!set.contains(num))
                continue;
            int length = computeLength(set, num);
            if (length > max)
                max = length;
        }
        return max;
    }

    private int computeLength(Set<Integer> set, int num)
    {
        int length = 1;
        set.remove(num);
        int h = num + 1;
        while (set.contains(h))
        {
            set.remove(h);
            h++;
            length++;
        }
        int l = num - 1;
        while (set.contains(l))
        {
            set.remove(l);
            l--;
            length++;
        }
        return length;
    }
}

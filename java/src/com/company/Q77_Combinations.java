package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LiJian on 2016/4/10.
 * Describe : This class is responsible for
 */
public class Q77_Combinations
{
    public static List<List<Integer>> combine(int n, int k)
    {
        List<List<Integer>> combs = new ArrayList<List<Integer>>();
        combine(combs, new ArrayList<>(), 1, n, k);
        return combs;
    }

    private static void combine(List<List<Integer>> combs, List<Integer> comb, int index, int n, int k)
    {
        if (k == 0)
        {
            combs.add(new ArrayList<Integer>(comb));
            return;
        }
        for (int i = index; i <= n; i++)
        {
            comb.add(i);
            combine(combs, comb, index + 1, n, k - 1);
            comb.remove(comb.size() - 1);
        }
    }

    public static void main(String[] args) {
        Q77_Combinations q = new Q77_Combinations();
        int k = 7;
        int n = 10;
        q.combine(10, 7);
    }
}

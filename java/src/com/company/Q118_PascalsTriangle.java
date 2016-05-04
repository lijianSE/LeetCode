package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LJ on 2016/5/4.
 * Describe : This class is responsible for
 */
public class Q118_PascalsTriangle
{
    public List<List<Integer>> generate(int numRows)
    {
        List<List<Integer>> result = new ArrayList<>();
        create(result, numRows);
        return result;
    }

    private void create(List<List<Integer>> result, int num)
    {
        if (num == 0)
            return;
        List<Integer> item = new ArrayList<>();
        if (result.size() == 0)
            item.add(1);
        else
        {
            List<Integer> pre = result.get(result.size() - 1);
            item.add(1);
            for (int i = 0; i < pre.size() - 1; i++)
                item.add(pre.get(i) + pre.get(i + 1));
            item.add(1);
        }
        result.add(item);
        create(result, num - 1);
    }

    public static void main(String[] args)
    {
        Q118_PascalsTriangle q = new Q118_PascalsTriangle();
        int num = 11;
        List<List<Integer>> result = q.generate(num);
        result.forEach(System.out::println);
    }
}

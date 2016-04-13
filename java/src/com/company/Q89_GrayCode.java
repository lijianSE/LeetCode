package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LiJian on 2016/4/13.
 * Describe : This class is responsible for
 */
public class Q89_GrayCode
{
    public List<Integer> grayCode(int n)
    {
        if (n == 0)
        {
            List<Integer> result = new ArrayList<>();
            result.add(0);
            return result;
        }
        if (n == 1)
        {
            List<Integer> result = new ArrayList<>();
            result.add(0);
            result.add(1);
            return result;
        }
        List<Integer> result = grayCode(n - 1);
        for (int i = result.size() - 1; i >= 0; i--)
        {
            int tmp = result.get(i);
            result.add(tmp | (1 << (n - 1)));
        }
        return result;
    }

    public static void main(String[] args) {
        Q89_GrayCode q = new Q89_GrayCode();
        int n = 2;
        List<Integer> result = q.grayCode(n);
        result.forEach(System.out::println);
    }
}

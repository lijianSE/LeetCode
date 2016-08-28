package com.company;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by LiJian on 2016/8/27.
 * Describe : This class is responsible for
 */
public class Q202_HappyNumber
{
    public boolean isHappy(int n)
    {
        Set<Integer> set = new HashSet<>();
        set.add(n);
        while (true)
        {
            int nextN = nextNumber(n);
            if (nextN == 1)
                break;
            if (set.contains(nextN))
                return false;
            set.add(nextN);
            n = nextN;
        }
        return true;
    }

    private int nextNumber(int n)
    {
        String s = String.valueOf(n);
        int result = 0;
        for (char ch : s.toCharArray())
            result += (ch - '0') * (ch - '0');
        return result;
    }
}

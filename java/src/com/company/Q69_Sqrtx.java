package com.company;

/**
 * Created by LJ on 2016/4/7.
 * Describe : This class is responsible for
 */
public class Q69_Sqrtx
{
    public int mySqrt(int x)
    {
        if (x == 0)
            return 0;
        int left = 1, right = Integer.MAX_VALUE;
        while (true) {
            int mid = left + (right - left)/2;
            if (mid > x/mid) {
                right = mid - 1;
            } else {
                if (mid + 1 > x/(mid + 1))
                    return mid;
                left = mid + 1;
            }
        }
    }
}

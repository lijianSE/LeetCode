package com.company;

import java.util.HashMap;

/**
 * Created by LiJian on 2016/5/29.
 * Describe : This class is responsible for
 */
public class Q169_MajorityElement
{
    public int majorityElement(int[] nums)
    {
        if (nums == null || nums.length ==0){
            return 0;
        }
        int count = 1;
        int major = nums[0];
        for (int i = 1; i < nums.length; i++){
            if (nums[i] != major){
                count--;
            } else {
                count++;
            }
            if (count == 0){
                major = nums[i];
                count = 1;
            }
        }
        return major;
    }

    private int quick(int[] nums, int l, int h, int t)
    {
        if (l >= h)
            return nums[l];
        int tmp = nums[l];
        int ll = l;
        int hh = h;
        while (l < h)
        {
            while (l < h && nums[h] >= tmp)
                h--;
            if (l < h)
                nums[l] = nums[h];
            while (l < h && nums[l] <= tmp)
                l++;
            if (l < h)
                nums[h] = nums[l];
        }
        nums[l] = tmp;
        if (l == t)
            return tmp;
        else if (l < t)
            return quick(nums, l + 1, hh, t);
        else
            return quick(nums, ll, l - 1, t);
    }

    public static void main(String[] args)
    {
        int[] nums = {1, 1, 1, 2, 2};
        Q169_MajorityElement q = new Q169_MajorityElement();
        System.out.println(q.majorityElement(nums));
    }
}



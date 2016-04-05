package com.company;

/**
 * Created by LiJian on 2016/3/10.
 * Describe : This class is responsible for
 */
public class Q283_MoveZeroes
{
    public void moveZeroes(int[] nums)
    {
        int index = 0;
        int zeroIndex = 0;
        int notZeroIndex = 0;
        zeroIndex = findZeroIndex(nums, zeroIndex);
        if (zeroIndex == nums.length)
            return;
        notZeroIndex = findNotZeroIndex(nums, zeroIndex);
        if (notZeroIndex == nums.length)
            return;
        swap(nums, zeroIndex, notZeroIndex);
        System.out.println(zeroIndex + " " + notZeroIndex);
        while (index < nums.length)
        {
            zeroIndex = findZeroIndex(nums, zeroIndex);
            if (zeroIndex == nums.length)
                return;
            notZeroIndex = findNotZeroIndex(nums, notZeroIndex);
            if (notZeroIndex == nums.length)
                return;
            swap(nums, zeroIndex, notZeroIndex);
        }
    }

    private int findNotZeroIndex(int[] nums, int begin)
    {
        while (begin < nums.length)
        {
            if (nums[begin] != 0)
                return begin;
            begin++;
        }
        return begin;
    }

    private int findZeroIndex(int[] nums, int begin)
    {
        while (begin < nums.length)
        {
            if (nums[begin] == 0)
                return begin;
            begin++;
        }
        return begin;
    }

    private void swap(int[] nums, int a, int b)
    {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        Q283_MoveZeroes q = new Q283_MoveZeroes();
        q.moveZeroes(nums);
    }
}

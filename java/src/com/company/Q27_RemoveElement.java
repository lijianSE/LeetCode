package com.company;

/**
 * Created by LiJian on 2016/3/18.
 * Describe : This class is responsible for
 */
public class Q27_RemoveElement
{
    public int removeElement(int[] nums, int val)
    {
        int i = findNextIndexFromBegin(nums, val, 0, nums.length);
        if (i == -1)
            return nums.length;
        int j = findNextIndexFromEnd(nums, val, i, nums.length - 1);
        if (j == -1)
            return i;
        swap(nums, i, j);
        while (i < j)
        {
            i = findNextIndexFromBegin(nums, val, i + 1, j);
            if (i == -1)
                return j;
            j = findNextIndexFromEnd(nums, val, i, j - 1);
            if (j == -1)
                return i;
            swap(nums, i, j);
        }
        return i;
    }

    private void swap(int[] nums, int a, int b)
    {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }

    private int findNextIndexFromBegin(int[] nums, int val, int begin, int end)
    {
        for (int i = begin; i < end; i++)
        {
            if (nums[i] == val)
                return i;
        }
        return -1;
    }

    private int findNextIndexFromEnd(int[] nums, int val, int begin, int end)
    {
        for (int i = end; i > begin; i--)
        {
            if (nums[i] != val)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Q27_RemoveElement q = new Q27_RemoveElement();
        int[] nums = {0,4,4,0,4,4,4,0,2};
        System.out.println(q.removeElement(nums, 4));
        for (int num : nums)
            System.out.print(num + " ");
    }
}

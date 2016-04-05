package com.company;

/**
 * Created by LiJian on 2016/3/18.
 * Describe : This class is responsible for
 */
public class Q26_RemoveDuplicatesfromSortedArray
{
    public int removeDuplicates(int[] nums)
    {
        if (nums.length == 0)
            return 0;
        int tmp = nums[0];
        int num = 1;
        for (int i = 1; i < nums.length; i++)
        {
            if (nums[i] == tmp)
                continue;
            tmp = nums[i];
            nums[num] = tmp;
            num++;
        }
        return num;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        Q26_RemoveDuplicatesfromSortedArray q = new Q26_RemoveDuplicatesfromSortedArray();
        System.out.println(q.removeDuplicates(nums));
        for (int num : nums)
            System.out.println(num);
    }
}

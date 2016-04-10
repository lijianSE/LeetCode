package com.company;

/**
 * Created by LiJian on 2016/4/10.
 * Describe : This class is responsible for
 */
public class Q80_RemoveDuplicatesfromSortedArrayII
{
    public int removeDuplicates(int[] nums)
    {
        if (nums.length <= 2)
            return nums.length;
        int num = 1;
        int count = 1;
        int index = 1;
        int tmp = nums[0];
        while (index < nums.length) {
            if (count == 2) {
                while (index < nums.length && nums[index] == tmp)
                    index++;
                if (index == nums.length)
                    break;
                nums[num] = nums[index];
                tmp = nums[index];
                index++;
                num++;
                count = 1;
                continue;
            }
            if (nums[index] == tmp)
                count++;
            else
            {
                count = 1;
                tmp = nums[index];
            }
            nums[num] = nums[index];
            num++;
            index++;
        }
        return num;
    }
}

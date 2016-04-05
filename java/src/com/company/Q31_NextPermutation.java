package com.company;

/**
 * Created by LiJian on 2016/3/24.
 * Describe : This class is responsible for
 */
public class Q31_NextPermutation
{
    public void nextPermutation(int[] nums)
    {
        if (nums.length < 2)
            return;

        int index = nums.length - 1;
        while (index > 0)
        {
            if (nums[index] > nums[index - 1])
                break;
            index--;
        }
        if (index == 0)
        {
            reverseSort(nums, 0, nums.length - 1);
            return;
        }
        index--;
        int swapIndex;
        for (swapIndex = nums.length - 1; swapIndex > index; swapIndex--)
        {
            if (nums[swapIndex] > nums[index])
                break;
        }
        swap(nums, swapIndex, index);
        reverseSort(nums, index + 1, nums.length - 1);
    }

    private void swap(int[] nums, int p, int q)
    {
        int tmp = nums[p];
        nums[p] = nums[q];
        nums[q] = tmp;
    }

    private void reverseSort(int[] nums,int p, int q)
    {
        while (p < q)
        {
            swap(nums, p, q);
            p++;
            q--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {2 ,3 ,1};
        Q31_NextPermutation q = new Q31_NextPermutation();
        q.nextPermutation(nums);
        for (int num : nums)
            System.out.println(num);
    }
}

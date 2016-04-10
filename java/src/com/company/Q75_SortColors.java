package com.company;

/**
 * Created by LiJian on 2016/4/9.
 * Describe : This class is responsible for
 */
public class Q75_SortColors
{
    public void sortColors(int[] nums) {
        int[] map = new int[3];
        for (int num : nums)
            map[num]++;
        int count = 0;
        for (int i = 0; i < map[0]; i++)
            nums[count++] = 0;
        for (int j = 0; j < map[1]; j++)
            nums[count++] = 1;
        for (int j = 0; j < map[2]; j++)
            nums[count++] = 2;
    }
}

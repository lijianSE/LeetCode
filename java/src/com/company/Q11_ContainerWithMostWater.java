package com.company;

/**
 * Created by LiJian on 2016/3/14.
 * Describe : This class is responsible for
 */
public class Q11_ContainerWithMostWater
{
    public int maxArea(int[] height)
    {
        int l = 0;
        int h = height.length - 1;
        int result = 0;
        while (l < h)
        {
            int tmp = computeContainer(height, l, h);
            if (tmp > result)
                result = tmp;
            if (height[l] < height[h])
            {
                int k = l + 1;
                while (k < h && height[k] < height[l])
                    k++;
                l = k;
            }
            else
            {
                int k = h - 1;
                while (k > l && height[k] < height[h])
                    k--;
                h = k;
            }
        }
        return result;
    }


    private int computeContainer(int[] height, int l, int h)
    {
        int water = height[l] < height[h] ? height[l] : height[h];
        int container = water * (h - l);
        return container;
    }

    public static void main(String[] args) {
        Q11_ContainerWithMostWater q = new Q11_ContainerWithMostWater();
        int[] nums = { 1, 2, 4, 3};
        System.out.println(q.maxArea(nums));
    }
}

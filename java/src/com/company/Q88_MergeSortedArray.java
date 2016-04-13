package com.company;

/**
 * Created by LiJian on 2016/4/13.
 * Describe : This class is responsible for
 */
public class Q88_MergeSortedArray
{
    public void merge(int[] nums1, int m, int[] nums2, int n)
    {
        int i = 0;
        int j = 0;
        int[] result = new int[m + n];
        int count = 0;
        while (i < m && j < n)
        {
            if (nums1[i] < nums2[j])
                result[count++] = nums1[i++];
            else
                result[count++] = nums2[j++];
        }
        while (i < m)
            result[count++] = nums1[i++];
        while (j < n)
            result[count++] = nums2[j++];
        for (i = 0; i < m + n; i++)
            nums1[i] = result[i];

    }
}

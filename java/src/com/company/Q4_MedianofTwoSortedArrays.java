package com.company;

/**
 * Created by LiJian on 2016/3/12.
 * Describe : This class is responsible for
 */
public class Q4_MedianofTwoSortedArrays
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        int m = nums1.length;
        int n = nums2.length;
        if ((m + n) % 2 == 0)
        {
            int mid1 = (m + n + 1) / 2;
            int mid2 = (m + n + 2) / 2;
            return (findKth(nums1, 0, nums2, 0, mid1) + findKth(nums1, 0, nums2, 0, mid2)) / 2.0;
        }
        else
            return findKth(nums1, 0, nums2, 0, (m + n + 1) / 2);

    }

    private int min(int a, int b)
    {
        return a > b ? b : a;
    }

    private int findKth(int[] a, int aStart, int[] b, int bStart, int k)
    {
        if (aStart >= a.length)
            return b[bStart + k - 1];
        if (bStart >= b.length)
            return a[aStart + k - 1];
        if (k == 1)
            return min(a[aStart], b[bStart]);

        int aMid = setMid(a, aStart, k);
        int bMid = setMid(b, bStart, k);
        if (aMid < bMid)
            return findKth(a, aStart + k / 2, b, bStart, k - k / 2);
        else
            return findKth(a, aStart, b, bStart + k / 2, k - k / 2);
    }

    private int setMid(int[] nums, int start, int k)
    {
        int index = start + k / 2 - 1;
        return index < nums.length ? nums[index] : Integer.MAX_VALUE;
    }
}

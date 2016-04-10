package com.company;

/**
 * Created by LiJian on 2016/4/9.
 * Describe : This class is responsible for
 */
public class Q74_Searcha2DMatrix
{
    public boolean searchMatrix(int[][] matrix, int target)
    {
        int index = binarySearchCol(matrix, target);
        if (index < 0)
            return false;
        return binarySearch(matrix[index], target) != -1;
    }

    private int binarySearchCol(int[][] matrix, int target)
    {
        int l = 0;
        int h = matrix.length - 1;
        while (l <= h)
        {
            int mid = (l + h) / 2;
            if (matrix[mid][0] == target)
                return mid;
            if (target < matrix[mid][0])
                h = mid - 1;
            else
                l = mid + 1;
        }
        return h;
    }

    private int binarySearch(int[] nums, int target)
    {
        int l = 0;
        int h = nums.length - 1;
        while (l <= h)
        {
            int mid = (l + h) / 2;
            if (nums[mid] == target)
                return mid;
            if (target < nums[mid])
                h = mid - 1;
            else
                l = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,3,5}};
        Q74_Searcha2DMatrix q = new Q74_Searcha2DMatrix();
        System.out.println(q.searchMatrix(matrix, 1));
    }
}

package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LJ on 2016/5/4.
 * Describe : This class is responsible for
 */
public class Q119_PascalsTriangleII
{
    public List<Integer> getRow(int rowIndex)
    {
        List<Integer> result = new ArrayList<>();

        if (rowIndex == 0)
        {
            result.add(1);
            return result;
        }
        int[] arr = new int[rowIndex + 1];
        arr[0] = arr[1] = 1;
        for (int i = 2; i <= rowIndex; i++)
        {
            int tmp = arr[0];
            for (int j = 1; j < i; j++)
            {
                int t = arr[j];
                arr[j] = tmp + arr[j];
                tmp = t;
            }
            arr[i] = 1;
        }
        for (int num : arr)
            result.add(num);
        return result;
    }

    public static void main(String[] args)
    {
        Q119_PascalsTriangleII q = new Q119_PascalsTriangleII();
        System.out.println(q.getRow(3));
    }
}

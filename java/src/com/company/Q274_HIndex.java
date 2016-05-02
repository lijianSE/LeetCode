package com.company;

import java.util.Arrays;

/**
 * Created by LiJian on 2016/4/26.
 * Describe : This class is responsible for
 */
public class Q274_HIndex
{
    public int hIndex(int[] citations) {
        if (citations.length == 0)
            return 0;
        int[] map = new int[citations.length + 1];
        for (int num : citations)
        {
            if (num > citations.length)
                map[citations.length]++;
            else
                map[num]++;
        }
        for (int i = citations.length; i >= 0; i--)
        {
            if (i != citations.length)
            {
                map[i] = map[i] + map[i + 1];
            }
            if (map[i] >= i)
                return i;
        }
        return 0;

    }

    public static void main(String[] args) {
        int[] citations = {1};
        Q274_HIndex q = new Q274_HIndex();
        System.out.println(q.hIndex(citations));
    }
}

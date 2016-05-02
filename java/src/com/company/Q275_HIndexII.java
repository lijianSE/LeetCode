package com.company;

/**
 * Created by LiJian on 2016/4/26.
 * Describe : This class is responsible for
 */
public class Q275_HIndexII
{
    public int hIndex(int[] citations)
    {
        int count = 0;
        int l = 0;
        int h = citations.length - 1;
        while (l <= h)
        {
            int mid = (l + h) / 2;
            int val = citations[mid];
            if (citations.length - mid <= val)
                count = citations.length - mid;
            h = mid - 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] citations = {100};
        Q275_HIndexII q = new Q275_HIndexII();
        System.out.println(q.hIndex(citations));
    }
}

package com.company;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by LiJian on 2016/8/27.
 * Describe : This class is responsible for
 */
public class Q179_LargestNumber
{
    class StringCompare implements Comparator<String>
    {
        @Override
        public int compare(String o1, String o2)
        {
            int i = 0;
            while (i < o1.length() && i < o2.length())
            {
                if (o1.charAt(i) != o2.charAt(i))
                    return o2.charAt(i) - o1.charAt(i);
                i++;
            }
            if (o1.length() == o2.length())
                return 0;
            if (o1.length() < o2.length())
                return compare(o1, o2.substring(o1.length()));
            else
                return compare(o1.substring(o2.length()), o2);
        }
    }
    public String largestNumber(int[] nums)
    {
        String[] str = new String[nums.length];
        for (int i = 0; i < nums.length; i++)
            str[i] = String.valueOf(nums[i]);

        Arrays.sort(str, new StringCompare());
        if (str.length > 0 && str[0].equals("0"))
            return "0";
        StringBuilder sb = new StringBuilder();
        for (String s : str)
            sb.append(s);
        return sb.toString();
    }

    public static void main(String[] args)
    {
        int[] num = {3, 30, 34, 5, 9};
        Q179_LargestNumber q = new Q179_LargestNumber();
        System.out.println(q.largestNumber(num));
    }
}

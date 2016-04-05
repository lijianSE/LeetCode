package com.company;

/**
 * Created by LiJian on 2016/3/13.
 * Describe : This class is responsible for
 */
public class Q6_ZigZagConversion
{
    public String convert(String s, int numRows)
    {
        if (s.length() <= numRows || numRows == 1)
            return s;
        char[] charArr = s.toCharArray();
        char[] result = new char[charArr.length];
        int perZig = numRows * 2 - 2;
        int num = charArr.length % perZig == 0 ? charArr.length / perZig : charArr.length / perZig + 1;
        int count = 0;
        for (int i = 0; i < numRows; i++)
        {
            for (int j = 0; j < num; j++)
            {
                if (j * perZig + i < charArr.length)
                    result[count++] = charArr[j * perZig + i];
                int tmp =  j * perZig + i + (numRows - i - 1) * 2;
                if (i != 0 && i != numRows - 1 && tmp < charArr.length)
                    result[count++] = charArr[tmp];
                if (count == charArr.length)
                    return String.valueOf(result);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        Q6_ZigZagConversion q = new Q6_ZigZagConversion();
        System.out.println(q.convert("ABCDE", 3));
    }
}

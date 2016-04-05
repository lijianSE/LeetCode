package com.company;

/**
 * Created by LiJian on 2016/3/28.
 * Describe : This class is responsible for
 */
public class Q43_MultiplyStrings
{
    public String multiply(String num1, String num2)
    {
        char[] num1Arr = num1.toCharArray();
        char[] num2Arr = num2.toCharArray();
        for (int i = 0; i < num1Arr.length; i++)
            num1Arr[i] -= '0';
        for (int i = 0; i < num2Arr.length; i++)
            num2Arr[i] -= '0';

        char[] result = new char[num1Arr.length + num2Arr.length];
        for (int i = 0; i < num2Arr.length; i++)
        {
            char[] mult = mult(num1Arr, num2Arr[num2Arr.length - 1 - i], i);
            int c = 0;
            for (int j = 0; j < mult.length; j++)
            {
                int tmp = result[result.length - 1 - j] + mult[mult.length - 1 - j] + c;
                result[result.length - 1 - j] = (char)(tmp % 10);
                c = tmp / 10;
            }
        }
        int offset = -1;
        for (int i = 0; i < result.length; i++)
            result[i] += '0';
        for (int i = 0; i < result.length; i++)
        {
            if (result[i] != '0')
            {
                offset = i;
                break;
            }
        }
        if (offset == -1)
            return "0";
        return new String(result, offset, result.length - offset);
    }

    private char[] mult(char[] charArr, char ch, int k)
    {
        char[] result = new char[charArr.length + 1 + k];

        for (int i = 0; i < k; i++)
            result[result.length- 1 - i] = 0;

        int c = 0;
        for (int i = charArr.length - 1; i >= 0; i--)
        {
            int tmp = charArr[i] * ch + c;
            result[result.length - 1 - k - (charArr.length - 1 - i)] = (char)(tmp % 10);
            c = tmp / 10;
        }
        result[0] = (char)c;
        return result;
    }

    public static void main(String[] args) {
        Q43_MultiplyStrings q = new Q43_MultiplyStrings();
        String num1 = "99";
        String num2 = "99";
        System.out.println(q.multiply(num1, num2));
    }
}

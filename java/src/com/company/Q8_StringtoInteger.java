package com.company;

/**
 * Created by LiJian on 2016/3/13.
 * Describe : This class is responsible for
 */
public class Q8_StringtoInteger
{
    public int myAtoi(String str)
    {
        int result = 0;
        boolean in = false;
        char[] charArr = str.toCharArray();
        int index = 0;
        while (index < charArr.length && charArr[index] == ' ')
            index++;
        if (index == charArr.length)
            return 0;

        if (charArr[index] == '-')
        {
            index++;
            in = true;
        }
        else if (charArr[index] == '+')
            index++;
        for (int i = index; i < charArr.length; i++)
        {
            if (charArr[i] < '0' || charArr[i] > '9')
                break;
            int newResult = result * 10 + charArr[i] - '0';
            if (newResult / 10 != result)
                return in ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            result = newResult;
        }
        return in ? result * -1 : result;
    }

    public static void main(String[] args) {
        Q8_StringtoInteger q = new Q8_StringtoInteger();
        String str = "    10522545459";
        System.out.println(q.myAtoi(str));
        System.out.println(Integer.valueOf("10522545459"));
    }
}

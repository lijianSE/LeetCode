package com.company;

/**
 * Created by LiJian on 2016/3/14.
 * Describe : This class is responsible for
 */
public class Q13_RomantoInteger
{
    public int romanToInt(String s)
    {
        char[] charArr = s.toCharArray();
        int[] map = new int[256];
        map['I'] = 1;
        map['V'] = 5;
        map['X'] = 10;
        map['L'] = 50;
        map['C'] = 100;
        map['D'] = 500;
        map['M'] = 1000;
        int i = charArr.length - 1;
        int result = map[charArr[i--]];
        while (i >= 0)
        {
            if (map[charArr[i]] < map[charArr[i + 1]])
                result -= map[charArr[i]];
            else
                result += map[charArr[i]];
            i--;
        }
        return result;
    }

    public static void main(String[] args) {
        Q13_RomantoInteger q = new Q13_RomantoInteger();
        String s = "XCIX";
        System.out.println(q.romanToInt(s));
    }
}

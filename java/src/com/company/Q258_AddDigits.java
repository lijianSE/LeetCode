package com.company;

/**
 * Created by LiJian on 2016/3/9.
 * Describe : This class is responsible for
 */
public class Q258_AddDigits
{
    public int addDigits(int num)
    {
        int tmp = num % 9;
        if (tmp == 0)
            return 9;
        return tmp;
    }

    public static void main(String[] args) {
        Q258_AddDigits a = new Q258_AddDigits();
        System.out.println(a.addDigits(111111111));
    }
}

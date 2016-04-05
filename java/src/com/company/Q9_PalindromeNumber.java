package com.company;

/**
 * Created by LiJian on 2016/3/13.
 * Describe : This class is responsible for
 */
public class Q9_PalindromeNumber
{
    public boolean isPalindrome(int x)
    {
        int tmp = x;
        int inverse = 0;
        while (tmp != 0)
        {
            inverse = inverse * 10 + tmp % 10;
            tmp = tmp / 10;
        }
        return inverse == x;
    }



    public static void main(String[] args) {
        Q9_PalindromeNumber q = new Q9_PalindromeNumber();
        System.out.println(q.isPalindrome(-2147447412));
    }
}

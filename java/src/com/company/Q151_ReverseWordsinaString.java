package com.company;

import java.util.*;

/**
 * Created by LiJian on 2016/5/7.
 * Describe : This class is responsible for
 */
public class Q151_ReverseWordsinaString
{
    public String reverseWords(String s)
    {
        StringBuilder sb = new StringBuilder();
        String[] strs = s.split(" ");
        for (int i = strs.length - 1; i >= 0; i--)
            sb.append(strs[i]).append(" ");
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}

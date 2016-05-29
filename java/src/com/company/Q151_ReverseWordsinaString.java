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
        String[] parts = s.trim().split("\\s+");
        String out = "";
        for (int i = parts.length - 1; i > 0; i--) {
            out += parts[i] + " ";
        }
        return out + parts[0];
    }
}

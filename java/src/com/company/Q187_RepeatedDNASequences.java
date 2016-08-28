package com.company;

import java.util.*;

/**
 * Created by LiJian on 2016/8/27.
 * Describe : This class is responsible for
 */
public class Q187_RepeatedDNASequences
{
    public List<String> findRepeatedDnaSequences(String s)
    {
        Map<String, Integer> map = new HashMap<>();
        List<String> result = new ArrayList<>();
        for (int i = 0; i < s.length() - 9; i++)
        {
            String str = s.substring(i, i + 10);
            Integer num = map.get(str);
            if (num == null)
                map.put(str, 1);
            else if (num == 1)
            {
                result.add(str);
                map.put(str, 2);
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        String s = "AAAAAAAAAAA";
        Q187_RepeatedDNASequences q = new Q187_RepeatedDNASequences();
        System.out.println(q.findRepeatedDnaSequences(s));
    }
}

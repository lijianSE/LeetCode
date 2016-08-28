package com.company;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by LiJian on 2016/8/27.
 * Describe : This class is responsible for
 */
public class Q205_IsomorphicStrings
{
    public boolean isIsomorphic(String s, String t)
    {
        if (s.length() != t.length())
            return false;
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        int index = 0;
        for (int i = 0; i < s.length(); i++)
        {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            Integer iS = sMap.get(sChar);
            Integer iT = tMap.get(tChar);
            if (iS == null && iT == null)
            {
                sMap.put(sChar, index);
                tMap.put(tChar, index);
                index++;
                continue;
            }
            if (iS == null || iT == null)
                return false;
            if (!iS.equals(iT))
                return false;
        }
        return true;
    }
}

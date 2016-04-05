package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by LiJian on 2016/3/21.
 * Describe : This class is responsible for
 */
public class Q30_SubstringwithConcatenationofAllWords
{
    public List<Integer> findSubstring(String s, String[] words)
    {
        List<Integer> result = new ArrayList<>();
        Map<String, Integer> numMap = new HashMap<>();
        for (String word : words)
        {
            add(numMap, word);
        }
        int length = words[0].length();

        for (int i = 0; i < length; i++)
        {
            int left = i;
            Map<String, Integer> newMap = new HashMap<>();
            int count = 0;
            for (int j = i; j <= s.length() - length; j += length)
            {
                String str = s.substring(j, j + length);
                if (numMap.containsKey(str))
                {
                    add(newMap, str);
                    if (newMap.get(str) <= numMap.get(str))
                        count++;
                    else
                    {
                        while (newMap.get(str) > numMap.get(str))
                        {
                            String str1 = s.substring(left, left + length);
                            sub(newMap, str1);
                            if (newMap.get(str1) < numMap.get(str1))
                                count--;
                            left += length;
                        }
                    }
                    if (count == words.length)
                    {
                        result.add(left);
                        sub(newMap, s.substring(left, left + length));
                        count--;
                        left += length;
                    }
                }
                else
                {
                    newMap.clear();
                    count = 0;
                    left = j + length;
                }

            }
        }
        return result;
    }

    private void add(Map<String, Integer> map, String s)
    {
        if (map.containsKey(s))
            map.put(s, map.get(s) + 1);
        else
            map.put(s, 1);
    }

    private void sub(Map<String, Integer> map, String s)
    {
        map.put(s, map.get(s) - 1);
    }

    public static void main(String[] args) {
        String s = "barfoofoobarthefoobarman";
        String[] words = {"foo", "bar", "the"};
        Q30_SubstringwithConcatenationofAllWords q = new Q30_SubstringwithConcatenationofAllWords();
        System.out.println(q.findSubstring(s, words));
    }
}

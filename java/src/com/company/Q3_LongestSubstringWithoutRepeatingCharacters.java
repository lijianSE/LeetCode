package com.company;

/**
 * Created by LiJian on 2016/3/12.
 * Describe : This class is responsible for
 */
public class Q3_LongestSubstringWithoutRepeatingCharacters
{
    class Index
    {
        int index;
        int begin;
        int end;
    }
    int[] map = new int[256];
    //Map<Character, Integer> map = new HashMap<>();
    public int lengthOfLongestSubstring(String s)
    {
        char[] charArr = s.toCharArray();
        for (int i = 0; i < 256; i++)
            map[i] = -1;
        int maxLength = 0;
        Index index = new Index();
        while (true)
        {
            findIndex(charArr, index);
            int length = index.end - index.index;
            if (length > maxLength)
                maxLength = length;
            if (index.end == charArr.length)
                break;
            index.index = index.begin;
            index.begin = index.end;
            if (charArr.length - index.index < maxLength)
                break;
        }
        return maxLength;
    }

    private void findIndex(char[] charArr, Index index)
    {
        int i;
        for (i = index.begin; i < charArr.length; i++)
        {
            int integer = map[charArr[i]];//map.get(charArr[i]);
            if (integer != -1 && integer >= index.index)
            {
                index.end = i;
                index.begin = integer + 1;
                break;
            }
            map[charArr[i]] = i;
        }
        index.end = i;
    }

    public static void main(String[] args) {
        Q3_LongestSubstringWithoutRepeatingCharacters q = new Q3_LongestSubstringWithoutRepeatingCharacters();
        String str = "vqblqcb";
        System.out.println(q.lengthOfLongestSubstring(str));
    }
}

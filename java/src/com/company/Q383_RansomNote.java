package com.company;

/**
 * Created by LiJian on 2016/8/14.
 * Describe : This class is responsible for
 */
public class Q383_RansomNote
{
    public boolean canConstruct(String ransomNote, String magazine)
    {
        char[] mCharArr = magazine.toCharArray();
        char[] ranCharArr = ransomNote.toCharArray();
        int[] charMap = new int[256];
        for (char ch : mCharArr)
            charMap[ch]++;
        for (char ch : ranCharArr)
        {
            if (--charMap[ch] < 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        String ransomNote = "a";
        String magazine = "b";
        Q383_RansomNote q = new Q383_RansomNote();
        System.out.println(q.canConstruct(ransomNote, magazine));
    }
}

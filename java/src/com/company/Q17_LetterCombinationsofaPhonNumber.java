package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LiJian on 2016/3/15.
 * Describe : This class is responsible for
 */
public class Q17_LetterCombinationsofaPhonNumber
{
    String[] nums;
    {
        nums = new String[12];
        nums[0] = " ";
        nums[1] = "2";
        nums[2] = "abc";
        nums[3] = "def";
        nums[4] = "ghi";
        nums[5] = "jkl";
        nums[6] = "mno";
        nums[7] = "pqrs";
        nums[8] = "tuv";
        nums[9] = "wxyz";
    }

    public List<String> letterCombinations(String digits)
    {

        List<String> result = new ArrayList<>();
        if (digits.length() == 0)
            return result;

        char[] item = new char[digits.length()];
        char[] charArr = digits.toCharArray();

        f(result, item, 0, charArr);
        return result;
    }

    private void f(List<String> result, char[] item, int index, char[] charArr)
    {
        if (index == charArr.length)
        {
            result.add(new String(item));
            return;
        }
        String le = nums[charArr[index] - '0'];
        for (char ch : le.toCharArray())
        {
            item[index] = ch;
            f(result, item, index + 1, charArr);
        }
    }

    public static void main(String[] args) {
        Q17_LetterCombinationsofaPhonNumber q = new Q17_LetterCombinationsofaPhonNumber();
        String d = "";
        System.out.println(q.letterCombinations(d));
    }
}

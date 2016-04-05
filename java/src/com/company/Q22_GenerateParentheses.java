package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LiJian on 2016/3/16.
 * Describe : This class is responsible for
 */
public class Q22_GenerateParentheses
{

    private List<String> result = new ArrayList<>();
    public List<String> generateParenthesis(int n)
    {
        int llll = 0;
        int ls = n;
        int rs = n;
        char[] item = new char[n * 2];
        f(llll, ls, rs, 0, item);
        return result;
    }

    private void f(int llll, int ls, int rs, int index, char[] item)
    {
        if (index == item.length)
        {
            result.add(new String(item));
            return;
        }
        if (llll == 0 && ls > 0)
        {
            item[index] = '(';
            f(llll + 1, ls - 1, rs, index + 1, item);
            return;
        }
        if (ls > 0)
        {
            item[index] = '(';
            f(llll + 1, ls - 1, rs, index + 1, item);
        }
        if (llll > 0)
        {
            item[index] = ')';
            f(llll - 1, ls, rs - 1, index + 1, item);
        }
    }

    public static void main(String[] args) {
        Q22_GenerateParentheses q = new Q22_GenerateParentheses();
        int n = 3;
        System.out.println(q.generateParenthesis(n));
    }
}

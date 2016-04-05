package com.company;

import java.util.Stack;

/**
 * Created by LiJian on 2016/3/16.
 * Describe : This class is responsible for
 */
public class Q20_ValidParentheses
{
    public boolean isValid(String s)
    {
        char[] sArr = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char ch : sArr)
        {
            if (isLeft(ch))
                stack.push(ch);
            else
            {
                if (stack.isEmpty())
                    return false;
                char pop = stack.pop();
                if (valid(pop, ch))
                    continue;
                else
                    return false;
            }
        }
        return stack.isEmpty();
    }

    private boolean isLeft(char ch)
    {
        return ch == '(' || ch == '{' || ch == '[';
    }

    private boolean valid(char a, char b)
    {
        if (a == '(' && b == ')')
            return true;
        if (a == '[' && b == ']')
            return true;
        if (a == '{' && b == '}')
            return true;
        return false;
    }

    public static void main(String[] args) {
        Q20_ValidParentheses q = new Q20_ValidParentheses();
        String str = "()[]";
        System.out.println(q.isValid(str));
    }
}

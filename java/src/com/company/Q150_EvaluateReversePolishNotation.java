package com.company;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by LiJian on 2016/5/8.
 * Describe : This class is responsible for
 */
public class Q150_EvaluateReversePolishNotation
{
    public int evalRPN(String[] tokens)
    {
        Deque<Integer> stack = new LinkedList<>();
        for (String s : tokens)
        {
            if (s.equals("+"))
            {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a + b);
            }
            else if (s.equals("-"))
            {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a - b);
            }
            else if (s.equals("*"))
            {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a * b);
            }
            else if (s.equals("/"))
            {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a / b);
            }
            else
                stack.push(Integer.valueOf(s));
        }
        return stack.pop();
    }
}

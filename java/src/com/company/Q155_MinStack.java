package com.company;

import java.util.Stack;

/**
 * Created by LiJian on 2016/5/5.
 * Describe : This class is responsible for
 */
public class Q155_MinStack
{
    /**
     * initialize your data structure here.
     */

    private Stack<Integer> minStack;
    private Stack<Integer> stack;

    public Q155_MinStack()
    {
        minStack = new Stack<>();
        stack = new Stack<>();
    }

    public void push(int x)
    {
        stack.push(x);
        if (minStack.isEmpty())
            minStack.push(x);
        else if (x <= minStack.peek())
            minStack.push(x);
    }

    public void pop()
    {
        int x = stack.pop();
        if (x == minStack.peek())
            minStack.pop();
    }

    public int top()
    {
        return stack.peek();
    }

    public int getMin()
    {
        return minStack.peek();
    }
}

package com.company;

import java.util.Stack;

/**
 * Created by LiJian on 2016/4/12.
 * Describe : This class is responsible for
 */
public class Q84_LargestRectangleinHistogram
{
    public int largestRectangleArea(int[] heights)
    {
        if (heights.length == 0)
            return 0;
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        int max = Integer.MIN_VALUE;
        while (index < heights.length)
        {
            if (stack.isEmpty() || heights[index] >= heights[stack.peek()])
            {
                stack.push(index++);
                continue;
            }
            while (!stack.isEmpty() && heights[index] < heights[stack.peek()])
            {
                int tmpIndex = stack.pop();
                int width = stack.isEmpty() ? index : index - stack.peek() - 1;
                max = Math.max(max, width * heights[tmpIndex]);
            }
        }
        while (!stack.isEmpty())
        {
            int tmpIndex = stack.pop();
            int width = stack.isEmpty() ? heights.length : index - stack.peek() - 1;
            max = Math.max(max, width * heights[tmpIndex]);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] heights = {0, 4,2,0,3,2,5};
        Q84_LargestRectangleinHistogram q = new Q84_LargestRectangleinHistogram();
        System.out.println(q.largestRectangleArea(heights));
    }
}

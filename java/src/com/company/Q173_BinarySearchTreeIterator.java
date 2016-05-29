package com.company;

import java.util.Stack;

/**
 * Created by LiJian on 2016/5/29.
 * Describe : This class is responsible for
 */
public class Q173_BinarySearchTreeIterator
{
    private Stack<TreeNode> stack;
    public Q173_BinarySearchTreeIterator(TreeNode root)
    {
        stack = new Stack<>();
        putAllLeft(root);
    }

    private void putAllLeft(TreeNode node)
    {
        while (node != null)
        {
            stack.push(node);
            node = node.left;
        }
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode node = stack.pop();
        putAllLeft(node.right);
        return node.val;
    }
}

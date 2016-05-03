package com.company;

/**
 * Created by LJ on 2016/5/3.
 * Describe : This class is responsible for
 */
public class Q110_BalancedBinaryTree
{
    public boolean isBalanced(TreeNode root)
    {
        return height(root) != -1;
    }

    private int height(TreeNode node)
    {
        if (node == null)
            return 0;
        int left = height(node.left);
        if (left == -1)
            return -1;
        int right = height(node.right);
        if (right == -1)
            return -1;

        if (Math.abs(left - right) >= 2)
            return -1;
        return Math.max(left, right) + 1;
    }
}

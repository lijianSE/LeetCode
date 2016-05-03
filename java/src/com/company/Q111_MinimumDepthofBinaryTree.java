package com.company;

import sun.nio.cs.ext.MacHebrew;

/**
 * Created by LJ on 2016/5/3.
 * Describe : This class is responsible for
 */
public class Q111_MinimumDepthofBinaryTree
{
    public int minDepth(TreeNode root)
    {
        if (root == null)
            return 0;
        if (root.right == null && root.left == null)
            return 1;
        if (root.right == null || root.left == null)
            return 2;
        return minDepth(root, 1);
    }

    private int minDepth(TreeNode node, int d)
    {
        if (node == null)
            return d - 1;
        if (node.left == null)
            return minDepth(node.right, d + 1);
        if (node.right == null)
            return minDepth(node.left, d + 1);
        return Math.min(minDepth(node.left, d + 1), minDepth(node.right, d + 1));
    }

}

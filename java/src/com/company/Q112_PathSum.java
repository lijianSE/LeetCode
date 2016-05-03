package com.company;/**
 * Created by LJ on 2016/5/3.
 * Describe : This class is responsible for
 */
public class Q112_PathSum 
{
    public boolean hasPathSum(TreeNode root, int sum)
    {
        if (root == null)
            return false;
        return path(root, sum);
    }

    private boolean path(TreeNode node, int sum)
    {
        if (node.left == null && node.right == null)
            return node.val == sum;
        if (node.left == null)
            return path(node.right, sum - node.val);
        if (node.right == null)
            return path(node.left, sum - node.val);
        return path(node.left, sum - node.val) || path(node.right, sum - node.val);
    }

}

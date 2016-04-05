package com.company;

/**
 * Created by LiJian on 2016/3/10.
 * Describe : This class is responsible for
 */
public class Q226_InvertBinaryTree
{
    public TreeNode invertTree(TreeNode root)
    {
        return invert(root);
    }

    private TreeNode invert(TreeNode node)
    {
        if (node == null)
            return null;
        TreeNode left = node.left;
        TreeNode right = node.right;
        node.left = right;
        node.right = left;
        invert(node.left);
        invert(node.right);
        return node;
    }
}

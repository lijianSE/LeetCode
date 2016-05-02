package com.company;

/**
 * Created by LiJian on 2016/5/2.
 * Describe : This class is responsible for
 */
public class Q98_ValidateBinarySearchTree
{
    public boolean isValidBST(TreeNode root)
    {
        return check(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean check(TreeNode node, int left, int right)
    {
        if (node == null)
            return true;
        if (node.val > left && node.val < right)
            return check(node.left, left, node.val) && check(node.right, node.val, right);
        return false;
    }


}

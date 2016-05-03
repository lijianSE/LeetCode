package com.company;/**
 * Created by LJ on 2016/5/3.
 * Describe : This class is responsible for
 */
public class Q114_FlattenBinaryTreetoLinkedList
{
    public void flatten(TreeNode root)
    {
        if (root == null)
            return;
        preorder(root);
    }

    TreeNode tmp;

    private void preorder(TreeNode node)
    {
        if (node.left == null && node.right == null)
        {
            if (tmp == null)
                tmp = node;
            else
            {
                tmp.right = node;
                tmp = node;
            }
            return;
        }
        TreeNode l = node.left;
        TreeNode r = node.right;
        if (tmp == null)
            tmp = node;
        else
        {
            tmp.right = node;
            tmp = node;
        }
        tmp.left = null;
        if (l != null)
            preorder(l);
        if (r != null)
            preorder(r);
    }

}

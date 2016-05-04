package com.company;

/**
 * Created by LJ on 2016/5/4.
 * Describe : This class is responsible for
 */
public class Q117_PopulatingNextRightPointersinEachNodeII
{
    public void connect(TreeLinkNode root)
    {
        if (root == null)
            return;
        TreeLinkNode node = root;
        node.next = null;
        c(node);
    }

    private void c(TreeLinkNode node)
    {
        if (node == null)
            return;
        TreeLinkNode next = null;
        TreeLinkNode pre = null;
        while (node != null)
        {
            if (next == null && node.left != null)
            {
                next = node.left;
                if (node.right == null)
                {
                    pre = node.left;
                }
                else
                {
                    pre = node.right;
                    node.left.next = node.right;
                }
                node = node.next;
                continue;
            }
            if (next == null && node.right != null)
            {
                next = node.right;
                pre = node.right;
                node = node.next;
                continue;
            }
            if (node.left != null)
            {
                pre.next = node.left;
                if (node.right != null)
                {
                    node.left.next = node.right;
                    pre = node.right;
                }
                else
                    pre = node.left;
            }
            else if (node.right != null)
            {
                pre.next = node.right;
                pre = node.right;
            }
            node = node.next;
        }
        c(next);
    }
}

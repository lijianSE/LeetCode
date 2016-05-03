package com.company;

/**
 * Created by LJ on 2016/5/3.
 * Describe : This class is responsible for
 */
public class Q109_ConvertSortedListtoBinarySearchTree
{
    ListNode node;
    public TreeNode sortedListToBST(ListNode head)
    {
        node = head;
        int length = 0;
        while (node != null)
        {
            node = node.next;
            length++;
        }
        node = head;
        return buildTree(0, length - 1);
    }

    private TreeNode buildTree(int l, int h)
    {
        if (l > h)
            return null;
        if (l == h)
            return new TreeNode(node.val);
        int mid = (l + h) / 2;
        TreeNode left = buildTree(l, mid - 1);
        TreeNode root = new TreeNode(node.val);
        root.left = left;
        node = node.next;
        root.right = buildTree(mid + 1, h);
        return root;
    }
}

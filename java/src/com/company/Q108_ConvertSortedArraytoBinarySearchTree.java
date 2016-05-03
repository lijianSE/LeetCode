package com.company;

/**
 * Created by LJ on 2016/5/3.
 * Describe : This class is responsible for
 */
public class Q108_ConvertSortedArraytoBinarySearchTree
{
    public TreeNode sortedArrayToBST(int[] nums)
    {
        return buildTree(nums, 0, nums.length - 1);
    }

    private TreeNode buildTree(int[] nums, int l, int h)
    {
        if (l > h)
            return null;
        if (l == h)
            return new TreeNode(nums[l]);
        int mid = (l + h) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = buildTree(nums, l, mid - 1);
        node.right = buildTree(nums, mid + 1, h);
        return node;
    }
}

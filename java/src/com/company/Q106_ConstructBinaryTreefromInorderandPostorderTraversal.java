package com.company;

import java.util.HashMap;

/**
 * Created by LJ on 2016/5/3.
 * Describe : This class is responsible for
 */
public class Q106_ConstructBinaryTreefromInorderandPostorderTraversal
{
    private HashMap<Integer, Integer> inMap = new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder)
    {
        if (inorder.length == 0)
            return null;
        for (int i = 0; i < inorder.length; i++)
            inMap.put(inorder[i], i);
        return buildTree(inorder, postorder, 0, inorder.length - 1, 0, inorder.length - 1);
    }

    private TreeNode buildTree(int[] inorder, int[] postorder, int ib, int ie, int pb, int pe)
    {
        if (pb > pe)
            return null;
        if (pb == pe)
            return new TreeNode(postorder[pb]);
        int val = postorder[pe];
        TreeNode node = new TreeNode(val);
        int index = inMap.get(val);
        int count = index - ib;
        node.left = buildTree(inorder, postorder, ib, ib + count - 1, pb, pb + count - 1);
        node.right = buildTree(inorder, postorder, ib + count + 1, ie, pb + count, pe - 1);
        return node;
    }
}

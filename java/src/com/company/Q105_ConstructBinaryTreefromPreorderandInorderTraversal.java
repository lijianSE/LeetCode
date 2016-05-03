package com.company;

import java.util.HashMap;

/**
 * Created by LJ on 2016/5/3.
 * Describe : This class is responsible for
 */
public class Q105_ConstructBinaryTreefromPreorderandInorderTraversal
{
    private HashMap<Integer, Integer> inMap = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder)
    {
        if (preorder.length == 0)
            return null;
        for (int i = 0; i < preorder.length; i++)
            inMap.put(inorder[i], i);
        return buildTree(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
    }

    private TreeNode buildTree(int[] preorder, int[] inorder, int pb, int pe, int ib, int ie)
    {
        if (pb > pe)
            return null;
        if (pb == pe)
            return new TreeNode(preorder[pe]);
        int inVal = preorder[pb];
        TreeNode node = new TreeNode(inVal);
        int index = inMap.get(inVal);
        int count = index - ib;
        node.left = buildTree(preorder, inorder, pb + 1, pb + count, ib, ib + count - 1);
        node.right = buildTree(preorder, inorder, pb + count + 1, pe, ib + count + 1, ie);
        return node;

    }

}

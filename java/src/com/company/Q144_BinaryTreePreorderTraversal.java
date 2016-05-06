package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by LJ on 2016/5/6.
 * Describe : This class is responsible for
 */
public class Q144_BinaryTreePreorderTraversal
{
    public List<Integer> preorderTraversal(TreeNode root)
    {
        List<Integer> ret = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node != null) {
                ret.add(node.val);
                stack.push(node.right);
                stack.push(node.left);
            }
        }
        return ret;
    }



}

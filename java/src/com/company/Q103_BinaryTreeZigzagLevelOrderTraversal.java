package com.company;

import java.util.*;

/**
 * Created by LiJian on 2016/5/2.
 * Describe : This class is responsible for
 */
public class Q103_BinaryTreeZigzagLevelOrderTraversal
{
    public List<List<Integer>> zigzagLevelOrder(TreeNode root)
    {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;
        List<Integer> item = new ArrayList<>();
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.add(root);
        while (!stack1.isEmpty()) {
            while (!stack1.isEmpty()) {
                TreeNode node = stack1.pop();
                item.add(node.val);
                if (node.left != null)
                    stack2.push(node.left);
                if (node.right != null)
                    stack2.push(node.right);
            }
            result.add(item);
            item = new ArrayList<>();
            while (!stack2.isEmpty()) {
                TreeNode node = stack2.pop();
                item.add(node.val);

                if (node.right != null)
                    stack1.add(node.right);
                if (node.left != null)
                    stack1.add(node.left);
            }
            if (item.size() != 0) {
                result.add(item);
                item = new ArrayList<>();
            }
        }
        return result;
    }
}

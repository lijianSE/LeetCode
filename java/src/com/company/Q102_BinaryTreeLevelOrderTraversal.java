package com.company;

import java.util.*;

/**
 * Created by LiJian on 2016/5/2.
 * Describe : This class is responsible for
 */
public class Q102_BinaryTreeLevelOrderTraversal
{
    public List<List<Integer>> levelOrder(TreeNode root)
    {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null)
            return result;
        queue.add(root);
        queue.add(null);
        List<Integer> item = new ArrayList<>();
        while (!queue.isEmpty())
        {
            TreeNode node = queue.remove();
            if (node == null)
            {
                result.add(item);
                item = new ArrayList<>();
                if (queue.isEmpty())
                    break;
                queue.add(null);

                continue;
            }
            item.add(node.val);
            if (node.left != null)
                queue.add(node.left);
            if (node.right != null)
                queue.add(node.right);
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        Q102_BinaryTreeLevelOrderTraversal q = new Q102_BinaryTreeLevelOrderTraversal();
        q.levelOrder(node);
    }
}

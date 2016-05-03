package com.company;

import java.util.*;
import java.util.stream.Collector;

/**
 * Created by LJ on 2016/5/3.
 * Describe : This class is responsible for
 */
public class Q107_BinaryTreeLevelOrderTraversalII
{
    public List<List<Integer>> levelOrderBottom(TreeNode root)
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
        Collections.reverse(result);
        return result;
    }
}

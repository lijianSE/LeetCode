package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LiJian on 2016/4/17.
 * Describe : This class is responsible for
 */
public class Q94_BinaryTreeInorderTraversal
{
    public List<Integer> inorderTraversal(TreeNode root)
    {
        List<Integer> result = new ArrayList<>();
        dfs(root, result);
        return result;
    }

    private void dfs(TreeNode node, List<Integer> result)
    {
        if (node == null)
            return;
        dfs(node.left, result);
        result.add(node.val);
        dfs(node.right, result);
    }
}

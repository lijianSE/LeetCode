package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LiJian on 2016/8/27.
 * Describe : This class is responsible for
 */
public class Q199_BinaryTreeRightSideView
{
    public List<Integer> rightSideView(TreeNode root)
    {
        List<Integer> result = new ArrayList<>();
        dfs(root, result, 0);
        return result;
    }

    private void dfs(TreeNode node, List<Integer> result, int d)
    {
        if (node == null)
            return;
        if (d < result.size())
        {
            dfs(node.right, result, d + 1);
            dfs(node.left, result, d + 1);
            return;
        }
        result.add(node.val);
        dfs(node.right, result, d + 1);
        dfs(node.left, result, d + 1);
    }
}

package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by LJ on 2016/5/6.
 * Describe : This class is responsible for
 */
public class Q145_BinaryTreePostorderTraversal
{
    public List<Integer> postorderTraversal(TreeNode root)
    {
        List<Integer> result = new ArrayList<>();
        dfs(result, root);
        return result;
    }

    private void dfs(List<Integer> result, TreeNode node)
    {
        if (node == null)
            return;
        dfs(result, node.left);
        dfs(result, node.right);
        result.add(node.val);
    }
}

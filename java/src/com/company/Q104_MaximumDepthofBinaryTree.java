package com.company;

/**
 * Created by LiJian on 2016/3/10.
 * Describe : This class is responsible for
 */
public class Q104_MaximumDepthofBinaryTree
{
    private int maxDepth = 0;

    public int maxDepth(TreeNode root)
    {
        dfs(root, 1);
        return maxDepth;
    }

    private void dfs(TreeNode node, int depth)
    {
        if (node == null)
            return;
        if (depth > maxDepth)
            maxDepth = depth;
        dfs(node.left, depth + 1);
        dfs(node.right, depth + 1);
        return;
    }
}

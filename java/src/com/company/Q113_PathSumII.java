package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LJ on 2016/5/3.
 * Describe : This class is responsible for
 */
public class Q113_PathSumII
{
    public List<List<Integer>> pathSum(TreeNode root, int sum)
    {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;
        dfs(result, new ArrayList<Integer>(), root, sum);
        return result;
    }

    private void dfs(List<List<Integer>> result, List<Integer> item, TreeNode node, int sum)
    {
        if(node.left == null && node.right == null)
        {
            if (sum == node.val)
            {
                item.add(node.val);
                result.add(new ArrayList<>(item));
                item.remove(item.size() - 1);
            }
            return;
        }
        item.add(node.val);
        if (node.left != null)
            dfs(result, item, node.left, sum - node.val);
        if(node.right != null)
            dfs(result, item, node.right, sum - node.val);
        item.remove(item.size() - 1);
        return;
    }
}

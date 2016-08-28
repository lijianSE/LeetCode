package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LiJian on 2016/4/17.
 * Describe : This class is responsible for
 */
public class Q95_UniqueBinarySearchTreesII
{
    public List<TreeNode> generateTrees(int n)
    {
        if (n == 0)
            return new ArrayList<TreeNode>();
        return generateTrees(1, n);
    }

    public List<TreeNode> generateTrees(int start, int end)
    {
        List<TreeNode> result = new ArrayList<>();
        if (start > end)
        {
            result.add(null);
            return result;
        }
        if (start == end)
        {
            result.add(new TreeNode(start));
            return result;
        }
        for (int i = start; i <= end; i++)
        {
            List<TreeNode> l = generateTrees(start, i - 1);
            List<TreeNode> r = generateTrees(i + 1, end);
            for (TreeNode lNode : l)
                for (TreeNode rNode : r)
                {
                    TreeNode root = new TreeNode(i);
                    root.left = lNode;
                    root.right = rNode;
                    result.add(root);
                }
        }
        return result;
    }
}

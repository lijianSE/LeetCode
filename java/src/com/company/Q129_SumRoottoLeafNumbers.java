package com.company;

/**
 * Created by LJ on 2016/5/5.
 * Describe : This class is responsible for
 */
public class Q129_SumRoottoLeafNumbers
{
    int result = 0;
    public int sumNumbers(TreeNode root)
    {
        if (root == null)
            return 0;
        sum(root, 0);
        return result;
    }

    private void sum(TreeNode node, int sum)
    {
        int tmp = sum * 10 + node.val;
        if (node.left == null && node.right == null)
        {
            result += tmp;
            return;
        }

        if (node.left != null)
            sum(node.left, tmp);
        if (node.right != null)
            sum(node.right, tmp);
    }
}

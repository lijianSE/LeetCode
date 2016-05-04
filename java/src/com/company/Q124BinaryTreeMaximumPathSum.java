package com.company;

/**
 * Created by LJ on 2016/5/4.
 * Describe : This class is responsible for
 */
public class Q124BinaryTreeMaximumPathSum
{
    int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {

        maxPathSumHelper(root);
        return max;

    }


    public int getMax(int a, int b)
    {
        return a>b?a:b;
    }

    public int maxPathSumHelper(TreeNode root)
    {

        if(root == null)
            return 0;

        int leftSum = maxPathSumHelper(root.left);
        int rightSum = maxPathSumHelper(root.right);
        int total = leftSum + rightSum + root.val;

        int temp = getMax(total,getMax(root.val+leftSum, getMax(root.val+rightSum, root.val)));

        if(temp > max)
            max = temp;

        return getMax(root.val+leftSum, getMax(root.val+rightSum, root.val));

    }

    public static void main(String[] args)
    {
        Q124BinaryTreeMaximumPathSum q = new Q124BinaryTreeMaximumPathSum();
        TreeNode t = new TreeNode(-3);
        q.maxPathSum(t);
    }
}

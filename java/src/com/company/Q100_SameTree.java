package com.company;

/**
 * Created by LiJian on 2016/3/10.
 * Describe : This class is responsible for
 */
public class Q100_SameTree
{
    public boolean isSameTree(TreeNode p, TreeNode q)
    {
        if (p == null && q == null)
            return true;
        if (p == null)
            return false;
        if (q == null)
            return false;
        if (p.val != q.val)
            return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

    }
}

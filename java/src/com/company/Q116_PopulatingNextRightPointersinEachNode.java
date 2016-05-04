package com.company;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by LJ on 2016/5/4.
 * Describe : This class is responsible for
 */
public class Q116_PopulatingNextRightPointersinEachNode
{
    public void connect(TreeLinkNode root)
    {
        if (root == null)
            return;
        while(root.left != null){
            TreeLinkNode prev = null;
            TreeLinkNode cur = root;
            while(cur != null){
                if(prev!=null){
                    prev.next = cur.left;
                }
                cur.left.next = cur.right;
                prev = cur.right;
                cur = cur.next;
            }
            root = root.left;
        }
    }
}

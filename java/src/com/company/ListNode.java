package com.company;

/**
 * Created by LiJian on 2016/3/10.
 * Describe : This class is responsible for
 */
public class ListNode
{
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    public void print()
    {
        ListNode node = this;
        while (node != null)
        {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }
}

package com.company;

/**
 * Created by LiJian on 2016/3/16.
 * Describe : This class is responsible for
 */
public class Q24_SwapNodesinPairs
{
    public ListNode swapPairs(ListNode head)
    {
        return swap(head);
    }

    private ListNode swap(ListNode node)
    {
        if (node == null || node.next == null)
            return node;

        ListNode next = node.next;
        node.next = swap(next.next);
        next.next = node;
        return next;
    }
}

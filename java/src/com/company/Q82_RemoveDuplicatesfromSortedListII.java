package com.company;

/**
 * Created by LiJian on 2016/4/10.
 * Describe : This class is responsible for
 */
public class Q82_RemoveDuplicatesfromSortedListII
{
    public ListNode deleteDuplicates(ListNode head)
    {
        if (head == null)
            return head;
        head = null;
        ListNode node = head;
        ListNode next = head.next;
        while (next != null)
        {
            if (node.val == next.val)
            {
                next = next.next;
                continue;
            }
        }
    }
}

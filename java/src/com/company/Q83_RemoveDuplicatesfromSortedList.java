package com.company;


/**
 * Created by LiJian on 2016/4/10.
 * Describe : This class is responsible for
 */
public class Q83_RemoveDuplicatesfromSortedList
{
    public ListNode deleteDuplicates(ListNode head)
    {
        if (head == null)
            return head;
        ListNode node = head;
        ListNode next = head.next;

        while (next != null)
        {
            if (next.val == node.val)
            {
                next = next.next;
                continue;
            }
            node.next = next;
            node = next;
            next = next.next;
        }
        node.next = null;
        return head;
    }
}

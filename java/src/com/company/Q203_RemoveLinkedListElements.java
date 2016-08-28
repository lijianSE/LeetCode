package com.company;

/**
 * Created by LiJian on 2016/8/27.
 * Describe : This class is responsible for
 */
public class Q203_RemoveLinkedListElements
{
    public ListNode removeElements(ListNode head, int val)
    {
        if (head == null)
            return null;

        while (head != null && head.val == val)
            head = head.next;
        ListNode node = head;
        while (node != null)
        {
            if (node.next !=null && node.next.val == val)
                node.next = node.next.next;
            else
                node = node.next;
        }
        return head;
    }
}

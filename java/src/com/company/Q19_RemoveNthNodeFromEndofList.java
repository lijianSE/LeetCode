package com.company;

/**
 * Created by LiJian on 2016/3/16.
 * Describe : This class is responsible for
 */
public class Q19_RemoveNthNodeFromEndofList
{
    public ListNode removeNthFromEnd(ListNode head, int n)
    {
        if (head.next == null)
            return null;
        ListNode node = head;
        for (int i = 0; i < n; i++)
            node = node.next;

        if (node == null)
            return head.next;
        ListNode preNode = head;
        while (node.next != null)
        {
            preNode = preNode.next;
            node = node.next;
        }
        preNode.next = preNode.next.next;
        return head;
    }
}

package com.company;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by LiJian on 2016/4/10.
 * Describe : This class is responsible for
 */
public class Q82_RemoveDuplicatesfromSortedListII
{
    public ListNode deleteDuplicates(ListNode head)
    {
        if (head == null || head.next == null)
            return head;
        ListNode node = head;
        head = null;
        ListNode tmp = null;
        while (node != null)
        {
            if (node.next == null)
                break;
            if (node.val != node.next.val)
            {
                if (head == null)
                {
                    head = node;
                    tmp = head;
                }
                else
                {
                    tmp.next = node;
                    tmp = node;
                }
                node = node.next;
            }
            else
            {
                node = nextNode(node);
            }
        }
        if (head == null)
        {
            head = node;
            return head;
        }
        tmp.next = node;
        return head;
    }

    private ListNode nextNode(ListNode node)
    {
        if (node == null || node.next == null)
            return node;
        int val = node.val;
        while (node != null)
        {
            if (node.val == val)
            {
                node = node.next;
                continue;
            }
            if (node.next == null)
                return node;
            if (node.next.val == node.val)
            {
                val = node.val;
                continue;
            }
            return node;
        }
        return null;
    }

    public static void main(String[] args) {
        Q82_RemoveDuplicatesfromSortedListII q = new Q82_RemoveDuplicatesfromSortedListII();
        ListNode head = new ListNode(1);
        ListNode tmp = new ListNode(1);
        head.next = tmp;
        ListNode next = new ListNode(2);
        tmp.next = next;
        q.deleteDuplicates(head);
    }
}

package com.company;

import java.util.Collections;

/**
 * Created by LJ on 2016/5/6.
 * Describe : This class is responsible for
 */
public class Q147_InsertionSortList
{
    public ListNode insertionSortList(ListNode head)
    {
        if (head == null || head.next == null)
            return head;
        ListNode node = head.next;
        head.next = null;
        while (node != null)
        {
            ListNode tmp = head;
            ListNode cur = node;
            node = node.next;
            if (cur.val < tmp.val)
            {
                cur.next = tmp;
                head = cur;
            }
            else
            {
                while (tmp.next != null && tmp.next.val < cur.val)
                    tmp = tmp.next;
                cur.next = tmp.next;
                tmp.next = cur;
            }
        }
        return head;


    }
}

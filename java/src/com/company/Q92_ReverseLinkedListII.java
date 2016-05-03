package com.company;

import java.util.Stack;

/**
 * Created by LiJian on 2016/4/14.
 * Describe : This class is responsible for
 */
public class Q92_ReverseLinkedListII
{
    public ListNode reverseBetween(ListNode head, int m, int n)
    {
        if (m == n)
            return head;

        ListNode preHead = new ListNode(0);
        preHead.next = head;

        // The (m-1) node is the tail of first tail.
        ListNode firstTail = preHead;
        int k = m - 1;
        while (k-- > 0)
        {
            firstTail = firstTail.next;
        }

        // The m-th node is the traversed tail.
        ListNode secondTail = firstTail.next;

        // Traverse m~n nodes, and get the traversed head.
        ListNode tmpHead = null;
        ListNode tmpNext = null;
        ListNode node = firstTail.next;
        k = n - m + 1;
        while (k-- > 0)
        {
            tmpHead = node;
            node = node.next;

            tmpHead.next = tmpNext;
            tmpNext = tmpHead;
        }

        // Connect three parts.
        firstTail.next = tmpHead;
        secondTail.next = node;

        return preHead.next;
    }


}

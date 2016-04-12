package com.company;

/**
 * Created by LiJian on 2016/4/12.
 * Describe : This class is responsible for
 */
public class Q86_PartitionList
{
    public ListNode partition(ListNode head, int x)
    {
        ListNode smallBegin = null, smallEnd = null;
        ListNode largeBegin = null, largeEnd = null;
        ListNode node = head;
        while (node != null)
        {
            if (node.val < x)
            {
                if (smallBegin == null)
                {
                    smallBegin = node;
                    smallEnd = node;
                }
                else
                {
                    smallEnd.next = node;
                    smallEnd = node;
                }
            }
            else
            {
                if (largeBegin == null)
                {
                    largeBegin = node;
                    largeEnd = node;
                }
                else
                {
                    largeEnd.next = node;
                    largeEnd = node;
                }
            }
            node = node.next;
        }

        if (smallEnd != null)
            smallEnd.next = largeBegin;
        if (largeEnd != null)
            largeEnd.next = null;
        if (smallBegin != null)
            return smallBegin;
        return largeBegin;
    }

    private ListNode initLarge(ListNode head, int x)
    {
        ListNode node = head;
        if (node.val >= x)
            return node;
        while (node.next != null)
        {
            if (node.next.val >= x)
                return node;
            node = node.next;
        }
        return null;
    }

    private ListNode initSmall(ListNode head, int x)
    {
        ListNode node = head;
        if (node.val < x)
            return node;
        while (node.next != null)
        {
            if (node.next.val < x)
                break;
            node = node.next;
        }
        if (node.next == null)
            return null;
        ListNode tmp = node;
        node = node.next;
        tmp.next = node.next;
        node.next = head;
        return node;
    }

    public static void main(String[] args) {
        Q86_PartitionList q = new Q86_PartitionList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(2);
        ListNode h = q.partition(head, 3);
    }
}

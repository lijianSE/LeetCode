package com.company;

/**
 * Created by LiJian on 2016/3/16.
 * Describe : This class is responsible for
 */
public class Q21_MergeTwoSortedLists
{
    public ListNode mergeTwoLists(ListNode l1, ListNode l2)
    {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        ListNode head;
        if (l1.val < l2.val)
        {
            head = l1;
            l1 = l1.next;
        }
        else
        {
            head = l2;
            l2 = l2.next;
        }
        ListNode node = head;
        while (l1 != null && l2 != null)
        {
            if (l1.val < l2.val)
            {
                node.next = l1;
                node = l1;
                l1 = l1.next;
            }
            else
            {
                node.next = l2;
                node = l2;
                l2 = l2.next;
            }
        }
        while (l1 != null)
        {
            node.next = l1;
            node = l1;
            l1 = l1.next;
        }
        while (l2 != null)
        {
            node.next = l2;
            node = l2;
            l2 = l2.next;
        }
        return head;
    }
}

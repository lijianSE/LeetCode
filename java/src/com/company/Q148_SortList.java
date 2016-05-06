package com.company;

/**
 * Created by LJ on 2016/5/6.
 * Describe : This class is responsible for
 */
public class Q148_SortList
{
    public ListNode sortList(ListNode head)
    {
        if (head == null || head.next == null)
            return head;
        return null;
    }

    private ListNode quickSort(ListNode node)
    {
        ListNode tmp = node;
        node = node.next;

    }

}

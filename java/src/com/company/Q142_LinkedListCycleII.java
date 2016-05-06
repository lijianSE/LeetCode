package com.company;

/**
 * Created by LJ on 2016/5/5.
 * Describe : This class is responsible for
 */
public class Q142_LinkedListCycleII
{
    public ListNode detectCycle(ListNode head)
    {
        if (head == null || head.next == null)
            return null;
        ListNode slow = head.next;
        ListNode fast = head.next.next;
        while (slow != fast)
        {
            if (fast == null || fast.next == null)
                return null;
            slow = slow.next;
            fast = fast.next.next;
        }
        fast = head;
        while (fast != slow)
        {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}

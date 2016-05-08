package com.company;

/**
 * Created by LiJian on 2016/5/8.
 * Describe : This class is responsible for
 */
public class Q160_IntersectionofTwoLinkedLists
{
    public ListNode getIntersectionNode(ListNode headA, ListNode headB)
    {
        if (headA == null || headB == null)
            return null;
        ListNode tail = headA;
        while (tail.next != null)
            tail = tail.next;
        tail.next = headA;
        ListNode slow = headB;
        ListNode fast = headB;
        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                break;
        }
        if (fast == null || fast.next == null)
        {
            tail.next = null;
            return null;
        }
        fast = headB;
        while (fast != slow)
        {
            fast = fast.next;
            slow = slow.next;
        }
        tail.next = null;
        return fast;
    }
}

package com.company;

/**
 * Created by LJ on 2016/5/5.
 * Describe : This class is responsible for
 */
public class Q141_LinkedListCycle
{
    public boolean hasCycle(ListNode head)
    {
        if (head == null)
            return false;
        ListNode slowNode = head;
        if (head.next == null || head.next.next == null)
            return false;
        ListNode fastNode = head.next.next;

        while (true)
        {
            if (slowNode == fastNode)
                return true;
            if (fastNode.next == null || fastNode.next.next == null)
                break;
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
        }
        return false;
    }
}

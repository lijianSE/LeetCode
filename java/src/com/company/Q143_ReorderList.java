package com.company;

import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by LJ on 2016/5/6.
 * Describe : This class is responsible for
 */
public class Q143_ReorderList
{
    public void reorderList(ListNode head)
    {
        if (head == null || head.next == null || head.next.next == null)
            return;
        ListNode node = head;
        Stack<ListNode> stack = new Stack<>();
        while (node != null)
        {
            stack.push(node);
            node = node.next;
        }
        int length = stack.size();
        ListNode tmp = head.next;
        node = head;
        node.next = stack.pop();
        node.next.next = tmp;
        node = tmp;

        for (int i = 0; i < length / 2; i++)
        {
            tmp = node.next;
            node.next = stack.pop();
            node.next.next = tmp;
            node = tmp;
        }
        if ((length & 0x01) == 1)
        {
            node.next = stack.pop();
            node.next.next = null;
        }
        else
            node.next = null;
    }
}

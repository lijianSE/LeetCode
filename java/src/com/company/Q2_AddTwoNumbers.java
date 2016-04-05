package com.company;

/**
 * Created by LiJian on 2016/3/10.
 * Describe : This class is responsible for
 */
public class Q2_AddTwoNumbers
{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        return add(l1, l2, 0);
    }

    private ListNode add(ListNode l1, ListNode l2, int c)
    {
        if (l1 == null && l2 == null)
        {
            if (c > 0)
                return new ListNode(c);
            else
                return null;
        }
        if (l1 == null && l2 != null)
        {
            l2.val += c;
            return l2;
        }
        if (l1 != null && l2 == null)
        {
            l1.val += c;
            return l1;
        }
        int val = l1.val + l2.val + c;
        if (val >= 10)
        {
            c = 1;
            val %= 10;
        }
        else
            c = 0;
        ListNode node = new ListNode(val);
        node.next = add(l1.next, l2.next, c);
        return node;
    }
}

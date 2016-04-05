package com.company;

/**
 * Created by LiJian on 2016/3/10.
 * Describe : This class is responsible for
 */
public class Q237_DeleteNodeinaLinkedList
{
    public void deleteNode(ListNode node)
    {
        if (node == null)
            return;
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

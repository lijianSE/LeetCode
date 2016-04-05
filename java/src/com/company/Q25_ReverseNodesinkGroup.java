package com.company;

/**
 * Created by LiJian on 2016/3/18.
 * Describe : This class is responsible for
 */
public class Q25_ReverseNodesinkGroup
{
    public ListNode reverseKGroup(ListNode head, int k)
    {
        ListNode node = head;

        return r(node, k);
    }

    private ListNode r(ListNode node, int k)
    {
        ListNode nextNode = findKthNode(node, k);
        if (nextNode == null)
            return node;
        nextNode = r(nextNode.next, k);
        ListNode tailNode = node;
        ListNode result = reverse(node, k);
        tailNode.next = nextNode;
        return result;
    }

    private ListNode findKthNode(ListNode node, int k)
    {
        for (int i = 0; i < k - 1; i++)
        {
            if (node == null)
                break;
            node = node.next;
        }
        return node;
    }

    private ListNode reverse(ListNode node, int k)
    {
        ListNode tailNode = node;
        ListNode nextNode = node.next;
        for (int i = 0; i < k - 1; i++)
        {
            ListNode tmp = nextNode.next;
            nextNode.next = node;
            node = nextNode;
            nextNode = tmp;
        }
        tailNode.next = nextNode;
        return node;
    }

    public static void main(String[] args) {
        Q25_ReverseNodesinkGroup q = new Q25_ReverseNodesinkGroup();
        ListNode head = new ListNode(1);
        ListNode node = head;

        for (int i = 2; i < 5; i++)
        {
            ListNode newNode = new ListNode(i);
            node.next = newNode;
            node = newNode;
        }
        head = q.reverseKGroup(head, 3);
        head.print();
    }
}

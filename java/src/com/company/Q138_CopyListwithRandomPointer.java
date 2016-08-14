package com.company;


import java.util.*;

/**
 * Created by LiJian on 2016/6/2.
 * Describe : This class is responsible for
 */
public class Q138_CopyListwithRandomPointer
{
    public RandomListNode copyRandomList(RandomListNode head)
    {
        if (head == null)
            return null;
        Map<RandomListNode, Integer> map = new HashMap<>();
        Map<Integer, RandomListNode> copyMap = new HashMap<>();
        RandomListNode copyHead = new RandomListNode(head.label);
        RandomListNode copyNode = copyHead;
        RandomListNode node = head;
        int i = 0;
        while (node.next != null)
        {
            map.put(node, i);
            copyMap.put(i, copyNode);
            i++;
            node = node.next;
            RandomListNode newNode = new RandomListNode(node.label);
            copyNode.next = newNode;

            if ()



            copyNode = newNode;
        }
        map.put(node, i);
        copyMap.put(i, copyNode);
        node = head;
        copyNode = copyHead;
        while (node != null)
        {
            if (node.random != null)
            {
                int index = map.get(node.random);
                RandomListNode r = copyMap.get(index);
                copyNode.random = r;
            }
            copyNode = copyNode.next;
            node = node.next;
        }
        return copyHead;
    }
}

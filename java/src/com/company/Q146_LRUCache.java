package com.company;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * Created by LiJian on 2016/4/11.
 * Describe : This class is responsible for
 */
public class Q146_LRUCache
{
    class Node
    {
        final int key;
        int val;
        Node pre;
        Node next;
        public Node(int key, int val)
        {
            this.key = key;
            this.val = val;
            next = null;
            pre = null;
        }
    }

    private int capacity;
    private Map<Integer, Node> map;
    private Node end;
    private Node head;

    public Q146_LRUCache(int capacity)
    {
        this.capacity = capacity;
        map = new HashMap<>();
        end = null;
        head = null;
    }

    public int get(int key)
    {
        if (map.containsKey(key))
        {
            Node node = map.get(key);
            if (node == end)
                ;
            else if (node == head)
            {
                head = node.next;
                head.pre = null;
                end.next = node;
                node.pre = end;
                node.next = null;
                end = node;
            }
            else
            {
                node.pre.next = node.next;
                node.next.pre = node.pre;
                end.next = node;
                node.pre = end;
                node.next = null;
                end = node;
            }
            return node.val;
        }
        else
            return -1;
    }

    public void set(int key, int value)
    {
        if (capacity == 0)
            return;
        if (head == null)
        {
            Node node = new Node(key, value);
            map.put(key, node);
            head = node;
            end = node;
            return;
        }
        if (map.containsKey(key))
        {
            Node node = map.get(key);
            if (node == end)
                ;
            else if (node == head)
            {
                head = node.next;
                head.pre = null;
                end.next = node;
                node.pre = end;
                node.next = null;
                end = node;

            }
            else
            {
                node.pre.next = node.next;
                node.next.pre = node.pre;
                end.next = node;
                node.pre = end;
                node.next = null;
                end = node;
            }
            node.val = value;
        }
        else
        {
            Node node = new Node(key, value);
            node.pre = end;
            end.next = node;
            end = node;
            map.put(key, node);
            if (map.size() > capacity)
            {
                map.remove(head.key);
                head = head.next;
                head.pre = null;
            }
        }

    }

    public static void main(String[] args) {
        String line = "set(10,13),set(3,17),set(6,11),set(10,5),set(9,10),get(13),set(2,19),get(2),get(3),set(5,25),get(8),set(9,22),set(5,5),set(1,30),get(11),set(9,12),get(7),get(5),get(8),get(9),set(4,30),set(9,3),get(9),get(10),get(10),set(6,14),set(3,1),get(3),set(10,11),get(8),set(2,14),get(1),get(5),get(4),set(11,4),set(12,24),set(5,18),get(13),set(7,23),get(8),get(12),set(3,27),set(2,12),get(5),set(2,9),set(13,4),set(8,18),set(1,7),get(6),set(9,29),set(8,21),get(5),set(6,30),set(1,12),get(10),set(4,15),set(7,22),set(11,26),set(8,17),set(9,29),get(5),set(3,4),set(11,30),get(12),set(4,29),get(3),get(9),get(6),set(3,4),get(1),get(10),set(3,29),set(10,28),set(1,20),set(11,13),get(3),set(3,12),set(3,8),set(10,9),set(3,26),get(8),get(7),get(5),set(13,17),set(2,27),set(11,15),get(12),set(9,19),set(2,15),set(3,16),get(1),set(12,17),set(9,1),set(6,19),get(4),get(5),get(5),set(8,1),set(11,7),set(5,2),set(9,28),get(1),set(2,2),set(7,4),set(4,22),set(7,24),set(9,26),set(13,28),set(11,26)";
        Q146_LRUCache q= new Q146_LRUCache(10);

        //System.out.println(q.head.key + " " + q.head.next.key);
        q.set(10,13);
        q.set(3,17);
        q.set(6,11);
        q.set(10,5);
        q.set(9,10);
        System.out.println(q.get(13));
        q.set(2,19);
        System.out.println(q.get(2));
        System.out.println(q.get(3));
        q.set(5,25);
        System.out.println(q.get(8));
        q.set(9,22);
        q.set(5,5);
        q.set(1,30);
        System.out.println(q.get(11));
        q.set(9,12);
        System.out.println(q.get(7));
        System.out.println(q.get(5));
        System.out.println(q.get(8));
        System.out.println(q.get(9));
        q.set(4,30);
        q.set(9,3);
        System.out.println(q.get(9));
        System.out.println(q.get(10));
        System.out.println(q.get(10));
        q.set(6,14);
        q.set(3,1);
        System.out.println(q.get(3));
        q.set(10,11);
        System.out.println(q.get(8));
        q.set(2,14);
        System.out.println(q.get(1));
        System.out.println(q.get(5));
        System.out.println(q.get(4));
        q.set(11,4);
        q.set(12,24);
        q.set(5,18);
        System.out.println(q.get(13));
        q.set(7,23);
        System.out.println(q.get(8));
        System.out.println(q.get(12));
        q.set(3,27);
        q.set(2,12);
        System.out.println(q.get(5));
        q.set(2,9);
        q.set(13,4);
        q.set(8,18);
        q.set(1,7);
        System.out.println(q.get(6));
        q.set(9,29);
        q.set(8,21);
        System.out.println(q.get(5));
        q.set(6,30);
        q.set(1,12);
        System.out.println(q.get(10));
        q.set(4,15);
        q.set(7,22);
        q.set(11,26);
        q.set(8,17);
        q.set(9,29);
        System.out.println(q.get(5));
        q.set(3,4);
        q.set(11,30);
        System.out.println(q.get(12));
        q.set(4,29);
        System.out.println(q.get(3));
        System.out.println(q.get(9));
        System.out.println(q.get(6));
        q.set(3,4);
        System.out.println(q.get(1));
        System.out.println(q.get(10));
        q.set(3,29);
        q.set(10,28);
        q.set(1,20);
        q.set(11,13);
        System.out.println(q.get(3));
        q.set(3,12);
        q.set(3,8);
        q.set(10,9);
        q.set(3,26);
        System.out.println(q.get(8));
        System.out.println(q.get(7));
        System.out.println(q.get(5));
        q.set(13,17);
        q.set(2,27);
        q.set(11,15);
        System.out.println(q.get(12));
        q.set(9,19);
        q.set(2,15);
        q.set(3,16);
        System.out.println(q.get(1));
        q.set(12,17);
        q.set(9,1);
        q.set(6,19);
        System.out.println(q.get(4));
        System.out.println(q.get(5));
        System.out.println(q.get(5));
        q.set(8,1);
        q.set(11,7);
        q.set(5,2);
        q.set(9,28);
        System.out.println(q.get(1));
        q.set(2,2);
        q.set(7,4);
        q.set(4,22);
        q.set(7,24);
        q.set(9,26);
        q.set(13,28);
        q.set(11,26);

//        int i = 0;
//
//        while (i < line.length())
//        {
//            char ch = line.charAt(i++);
//            String str = "q.";
//            char tmp = ch;
//            str += ch;
//            while (i < line.length() && (ch = line.charAt(i)) != 's' && (ch = line.charAt(i)) != 'g')
//            {
//                str += ch;
//                i++;
//            }
//            if (tmp == 's')
//                System.out.println(str.substring(0, str.length() - 1) + ";");
//            else
//                System.out.println("System.out.println(" + str.substring(0, str.length() - 1) + ");");
//
//        }


    }
}

__author__ = 'LiJian'

from ListNode import ListNode

class Solution(object):
    def rotateRight(self, head, k):
        """
        :type head: ListNode
        :type k: int
        :rtype: ListNode
        """
        count = 0
        node = head
        while (node != None):
            count += 1
            node = node.next
        if count == 0:
            return []
        k = k % count
        if k == 0:
            return head
        num = count - k
        node = head
        for i in range(num - 1):
            node = node.next
        next = node.next
        newHead = next
        node.next = None

        while (next.next != None):
            next = next.next
        next.next = head
        return newHead

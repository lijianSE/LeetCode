__author__ = 'LiJian'

class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        c = 1
        for i in range(digits.__len__() - 1, -1, -1):
            tmp = digits[i] + c
            digits[i] = tmp % 10
            c = tmp / 10
        if c == 1:
            digits[0 : 0] = [c]
        return digits


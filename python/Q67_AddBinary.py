__author__ = 'LJ'


class Solution(object):
    def addBinary(self, a, b):
        """
        :type a: str
        :type b: str
        :rtype: str
        """
        aIndex = a.__len__() - 1
        bIndex = b.__len__() - 1
        result = []
        c = 0
        while aIndex >= 0 and bIndex >= 0:
            aNum = 0 if a[aIndex] == '0' else 1
            bNum = 0 if b[bIndex] == '0' else 1
            tmp = aNum + bNum + c
            c = tmp / 2
            t = tmp % 2
            result[0:0] = ['0'] if t == 0 else ['1']
            aIndex -= 1
            bIndex -= 1

        while aIndex >= 0:
            aNum = 0 if a[aIndex] == '0' else 1
            tmp = aNum + c
            c = tmp / 2
            t = tmp % 2
            result[0:0] = ['0'] if t == 0 else ['1']
            aIndex -= 1

        while bIndex >= 0:
            bNum = 0 if b[bIndex] == '0' else 1
            tmp = bNum + c
            c = tmp / 2
            t = tmp % 2
            result[0:0] = ['0'] if t == 0 else ['1']
            bIndex -= 1
        if c == 1:
            result[0:0] = ['1']
        return ''.join(result)


s = Solution()
a = '111'
b = '11'
print s.addBinary(a, b)
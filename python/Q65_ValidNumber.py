__author__ = 'LJ'

class Solution(object):
    def isNumber(self, s):
        """
        :type s: str
        :rtype: bool
        """
        s = s.strip()
        if s.__len__() == 0:
            return False
        if s[0] == '-':
            sign = -1
            i = 1
        elif s[0] >= '0' and s[0] <= '9':
            sign = 1
            i = 0
        elif s[0] == 'e' and s.__len__() == 1:
            return False
        else:
            i = 0


        dotFlag = True
        eFlag = True
        for i in range(i, s.__len__()):
            if s[i] >= '0' and s[i]<= '9':
                continue
            elif s[i] == '.' and dotFlag:
                dotFlag = False
                continue
            elif s[i] == '.' and not dotFlag:
                return False
            elif s[i] == 'e' and eFlag:
                eFlag = False
            else:
                return False
        return True

sl = Solution()
s = ".1 "
print sl.isNumber(s)



__author__ = 'LJ'

class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        s = s.rstrip()
        length = s.__len__()
        count = 0
        for i in range(length - 1, -1, -1):
            if s[i] == ' ':
                return count
            count += 1
        return length


s = Solution()
b = "   "
print s.lengthOfLastWord(b)
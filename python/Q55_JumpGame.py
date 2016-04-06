__author__ = 'LJ'

class Solution(object):
    def canJump(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        if nums.__len__() == 1:
            return True
        max = 0
        for i in range(nums.__len__() - 1):
            if max < i:
                return False
            tmp = i + nums[i]
            if tmp >= nums.__len__() - 1:
                return True
            elif tmp > max:
                max = tmp
        return False

s = Solution()
nums = [0]
print s.canJump(nums)
__author__ = 'LiJian'

class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if nums.__len__() == 0:
            return 0
        tmp = 0
        max = -2147483648
        for num in nums:
            tmp += num

            if tmp > max:
                max = tmp
            if tmp < 0:
                tmp = 0

        return max

s = Solution()
nums = [-2,-3]
print s.maxSubArray(nums)
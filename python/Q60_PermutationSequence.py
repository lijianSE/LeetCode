__author__ = 'LiJian'

import heapq
class Solution(object):
    def getPermutation(self, n, k):
        """
        :type n: int
        :type k: int
        :rtype: str
        """
        factorial = [0, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880]
        k
        l = []
        map = [0] * n
        for i in range(n - 1, 0, -1):
            count = factorial[i]
            tmp = (k - 1) / count
            kthMin = self.getKthMin(map, tmp)
            map[kthMin] = 1
            l.append(str(kthMin + 1))
            k = k - tmp * count
        l.append(str(self.getKthMin(map, 0) + 1))
        return ''.join(l)


    def getKthMin(self, nums, k):
        count = 0
        for i in range(nums.__len__()):
            if nums[i] == 0 and k == count:
                return i
            elif nums[i] == 0:
                count += 1

s = Solution()
n = 3
k = 6
print s.getPermutation(n, k)
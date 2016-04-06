__author__ = 'LJ'

class Solution(object):
    def generateMatrix(self, n):
        """
        :type n: int
        :rtype: List[List[int]]
        """

        result = [[0] * n for i in range(n)]
        self.f(result, 1, 0, 0, n, n)
        return result


    def f(self, result, num, x0, y0, n, m):
        if n <= 0 or m <= 0:
            return
        for i in range(y0, y0 + n):
            result[x0][i] = num
            num += 1
        for i in range(x0 + 1, x0 + m):
            result[i][y0 + n - 1] = num
            num += 1
        if n == 1 or m == 1:
            return
        for i in range(y0 + n - 1 - 1, y0 - 1, -1):
            result[x0 + m - 1][i] = num
            num += 1
        for i in range(x0 + m - 1 - 1, x0, -1):
            result[i][y0] = num
            num += 1
        self.f(result, num, x0 + 1, y0 + 1, n - 2, m - 2)

s = Solution()
n = 0
result = s.generateMatrix(n)
print result
__author__ = 'LiJian'

class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """

        m = matrix.__len__()
        if m == 0:
            return []
        n = matrix[0].__len__()
        result = []
        self.f(matrix, result, 0, 0, n, m)
        return result


    def f(self, matrix, result, x0, y0, n, m):
        if n <= 0 or m <= 0:
            return
        for i in range(y0, y0 + n):
            result.append(matrix[x0][i])
        for i in range(x0 + 1, x0 + m):
            result.append(matrix[i][y0 + n - 1])
        if n == 1 or m == 1:
            return
        for i in range(y0 + n - 1 - 1, y0 - 1, -1):
            result.append(matrix[x0 + m - 1][i])
        for i in range(x0 + m - 1 - 1, x0 , -1):
            result.append(matrix[i][y0])
        self.f(matrix, result, x0 + 1, y0 + 1, n - 2, m - 2)

s = Solution()
matrix = [
 [1, 2],
 [3,4]
]
print s.spiralOrder(matrix)
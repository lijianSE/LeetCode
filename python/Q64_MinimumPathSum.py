__author__ = 'LiJian'

class Solution(object):
    def minPathSum(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: int
        """

        m = grid.__len__()
        n = grid[0].__len__()
        dp = [[0] * n for i in range(m)]

        dp[0][0] = grid[0][0]
        for i in range(1, m):
            dp[i][0] = dp[i - 1][0] + grid[i][0]
        for i in range(1, n):
            dp[0][i] = dp[0][i - 1] + grid[0][i]

        for i in range (1, m):
            for j in range(1, n):
                dp[i][j] = min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j]

        return dp[m - 1][n - 1]

str = 'hello world'
pattern = 'hello (\w+)'
import re
match = re.match(pattern, str)
print match.group(1)

lll = dict(aa = 'a')
print lll['aa']
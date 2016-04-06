__author__ = 'LiJian'

class Solution(object):
    def uniquePathsWithObstacles(self, obstacleGrid):
        """
        :type obstacleGrid: List[List[int]]
        :rtype: int
        """
        m = obstacleGrid.__len__()
        n = obstacleGrid[0].__len__()
        dp = [[0] * n for i in range(m)]

        for i in range(n):
            if obstacleGrid[0][i] == 1:
                break
            dp[0][i] = 1

        for i in range(m):
            if obstacleGrid[i][0] == 1:
                break
            dp[i][0] = 1
        for i in range(1, m):
            for j in range(1, n):
                if obstacleGrid[i][j] == 1:
                    continue
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1]

        return dp[m - 1][n - 1]
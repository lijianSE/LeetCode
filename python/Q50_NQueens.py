__author__ = 'LJ'
class Solution(object):


    def solveNQueens(self, n):
        """
        :type n: int
        :rtype: List[List[str]]
        """

        result = []
        self.boardList = self.__initBoard(n)
        self.dfs(n, result, [], [0] * n, [], 0)
        return result

    def __initBoard(self, n):
        boardList = []
        for num in range(n):
            s = '.' * num + 'Q' + '.' * (n - num - 1)
            boardList.append(s)
        return boardList

    def __isValid(self, mapRow, mapCol, row, col):
        if mapCol[col] == 1:
            return False
        for num in range(mapRow.__len__()):
            if row - num + mapRow[num] == col or mapRow[num] - col == row - num:
                return False
        return True

    def dfs(self, n, result, item, mapCol, mapRow, row):
        if row == n:
            result.append(item[:])
            return
        for num in range(n):
            if self.__isValid(mapRow, mapCol, row, num):
                mapCol[num] = 1
                mapRow.append(num)
                item.append(self.boardList[num])
                self.dfs(n, result, item, mapCol, mapRow, row + 1)
                mapCol[num] = 0
                mapRow.pop()
                item.pop()



s = Solution()

result = s.solveNQueens(8)
print result.__len__()
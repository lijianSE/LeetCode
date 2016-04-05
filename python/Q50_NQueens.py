__author__ = 'LJ'
class Solution(object):


    def solveNQueens(self, n):
        """
        :type n: int
        :rtype: List[List[str]]
        """

        result = []
        self.boardList = self.__initBoard(n)

    def __initBoard(self, n):
        boardList = []
        for num in range(n):
            s = '.' * num + 'Q' + '.' * (n - num - 1)
            boardList.append(s)
        return boardList

    def dfs(self, n, result, item, map):
        if item.__len__() == n:
            result.append(item[:])
            return
        for num in map:
            if num == 0:
                s = self.boardList[num]
                map[num] = 1
                item.append(s)
                self.dfs(n, result, item, map)
                map[num] = 0
                item.remove(-1)




s = Solution()

list = s.initBoard(8)

print list
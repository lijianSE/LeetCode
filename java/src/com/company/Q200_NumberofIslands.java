package com.company;

/**
 * Created by LiJian on 2016/8/27.
 * Describe : This class is responsible for
 */
public class Q200_NumberofIslands
{
    public int numIslands(char[][] grid)
    {
        if (grid.length == 0)
            return 0;
        int[][] board = new int[grid.length][grid[0].length];
        int index = 1;
        for (int i = 0; i < grid.length; i++)
        {
            for (int j = 0; j < grid[0].length; j++)
            {
                index += dfs(grid, board, i, j, index);
            }
        }
        return index - 1;
    }

    private int dfs(char[][] grid, int[][] board, int m, int n, int index)
    {
        if (m >= grid.length || n >= grid[0].length || m < 0 || n < 0)
            return 0;
        if (board[m][n] != 0)
            return 0;
        if (grid[m][n] == '1')
        {
            board[m][n] = index;
            dfs(grid, board, m - 1, n, index);
            dfs(grid, board, m, n - 1, index);
            dfs(grid, board, m + 1, n, index);
            dfs(grid, board, m, n + 1, index);
            return 1;
        }
        else
        {
            board[m][n] = -1;
            return 0;
        }
    }

    public static void main(String[] args)
    {
        char[][] grid =
                {
                         "111".toCharArray(),
                         "010".toCharArray(),
                         "111".toCharArray()
                };
        Q200_NumberofIslands q = new Q200_NumberofIslands();
        System.out.println(q.numIslands(grid));
    }
}

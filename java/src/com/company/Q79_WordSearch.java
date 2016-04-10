package com.company;

import java.util.Stack;

/**
 * Created by LiJian on 2016/4/10.
 * Describe : This class is responsible for
 */
public class Q79_WordSearch
{
    public boolean exist(char[][] board, String word)
    {
        char[] chArr = word.toCharArray();
        boolean[][] used = new boolean[board.length][board[0].length];

        for (int i = 0; i < board.length; i++)
        {
            for (int j = 0; j < board[0].length; j++)
            {
                boolean e = dfs(board, used, chArr, i, j, 0);
                if (e)
                    return true;
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, boolean[][] used, char[] chaArr, int m, int n, int index)
    {
        if (index == chaArr.length)
            return true;
        if (m < 0 || m >= board.length || n < 0 || n >= board[0].length || index >= chaArr.length || used[m][n] || board[m][n] != chaArr[index])
            return false;

        used[m][n] = true;
        boolean up = dfs(board, used, chaArr, m - 1, n, index + 1);
        if (up)
            return true;
        boolean down = dfs(board, used, chaArr, m + 1, n, index + 1);
        if (down)
            return true;
        boolean left = dfs(board, used, chaArr, m, n - 1, index + 1);
        if (left)
            return true;
        boolean right = dfs(board, used, chaArr, m, n + 1, index + 1);
        if (right)
            return true;

        used[m][n] = false;
        return false;
    }
}

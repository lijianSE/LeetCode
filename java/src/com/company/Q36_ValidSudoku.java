package com.company;

/**
 * Created by LiJian on 2016/3/27.
 * Describe : This class is responsible for
 */
public class Q36_ValidSudoku
{
    public boolean isValidSudoku(char[][] board)
    {
        for (int i = 0; i < board.length; i++)
        {
            boolean validRow = isValid(board,  i, 0, i, board.length - 1);
            boolean validCol = isValid(board, 0, i, board.length - 1, i);
            if (!validRow || !validCol)
                return false;
        }

        for (int i = 0; i < board.length; i += 3)
        {
            for (int j = 0; j < board.length; j += 3)
            {
                boolean valid = isValid(board, i, j, i + 2, j + 2);
                if (!valid)
                    return false;
            }
        }
        return true;
    }

    private boolean isValid(char[][] board, int p, int q, int m, int n)
    {
        char[] map = new char[10];
        for (int i = p; i <= m; i++)
        {
            for (int j = q; j <= n; j++)
            {
                if (board[i][j] == '.')
                    continue;
                if (map[board[i][j] - '0'] != 0)
                    return false;
                map[board[i][j] - '0'] = 1;
            }
        }
        return true;
    }
}

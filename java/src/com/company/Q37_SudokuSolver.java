package com.company;

import java.util.List;

/**
 * Created by LiJian on 2016/3/27.
 * Describe : This class is responsible for
 */
public class Q37_SudokuSolver
{
    public void solveSudoku(char[][] board)
    {
        char[][] mapRow = new char[9][10];
        char[][] mapCol = new char[9][10];
        char[][] mapMid = new char[9][10];
        initMap(board, mapRow, mapCol, mapMid);
        fill(board, mapRow, mapCol, mapMid, 0, 0);
    }

    private void initMap(char[][] board, char[][] mapRow, char[][] mapCol, char[][] mapMid)
    {
        int length = board.length;
        for (int i = 0; i < length; i++)
        {
            for (int j = 0; j < length; j++)
            {
                if (board[i][j] != '.')
                {
                    mapRow[i][board[i][j] - '0'] = 1;
                    mapCol[j][board[i][j] - '0'] = 1;
                    mapMid[i / 3 * 3 + j / 3][board[i][j] - '0'] = 1;
                }
            }
        }
    }

    private boolean fill(char[][] board, char[][] mapRow, char[][] mapCol, char[][] mapMid, final int p, final int q)
    {
        if (p == board.length)
            return true;
        int nextP = q == board.length - 1 ? p + 1 : p;
        int nextQ = q == board.length - 1 ? 0 : q + 1;
        if (board[p][q] != '.')
            return fill(board, mapRow, mapCol, mapMid, nextP, nextQ);
        else
        {
            char[] validNumArr = validNum(board, mapRow, mapCol, mapMid, p, q);
            if (validNumArr.length == 0)
                return false;
            for (char ch : validNumArr)
            {
                board[p][q] = ch;
                int c = ch - '0';
                mapRow[p][c] = 1;
                mapCol[q][c] = 1;
                mapMid[p / 3 * 3 + q / 3][c] = 1;
                boolean isFill = fill(board, mapRow, mapCol, mapMid, nextP, nextQ);
                if (isFill)
                    return true;
                mapRow[p][c] = 0;
                mapCol[q][c] = 0;
                mapMid[p / 3 * 3 + q / 3][c] = 0;
            }
            board[p][q] = '.';
            return false;
        }
    }

    private char[] validNum(char[][] board, char[][] mapRow, char[][] mapCol, char[][] mapMid, final int p, final int q)
    {
        StringBuilder sb = new StringBuilder();
        char[] row = mapRow[p];
        char[] col = mapCol[q];
        char[] mid = mapMid[p / 3 * 3 + q / 3];

        for (int i = 1; i < row.length; i++)
        {
            if (row[i] == 0 && col[i] == 0 && mid[i] == 0) {
                char c = (char)(i + '0');
                sb.append(c);
            }
        }

        return sb.toString().toCharArray();
    }

    public static void main(String[] args) {
        Q37_SudokuSolver q = new Q37_SudokuSolver();
        char[][] board = new char[9][];
        board[0] = "..9748...".toCharArray();
        board[1] = "7........".toCharArray();
        board[2] = ".2.1.9...".toCharArray();
        board[3] = "..7...24.".toCharArray();
        board[4] = ".64.1.59.".toCharArray();
        board[5] = ".98...3..".toCharArray();
        board[6] = "...8.3.2.".toCharArray();
        board[7] = "........6".toCharArray();
        board[8] = "...2759..".toCharArray();
        q.solveSudoku(board);
    }
}

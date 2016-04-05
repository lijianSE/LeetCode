package com.company;

/**
 * Created by LiJian on 2016/3/30.
 * Describe : This class is responsible for
 */
public class Q48_RotateImage
{
    public void rotate(int[][] matrix)
    {
        final int n = matrix.length - 1;
        final double half = n / 2.0;
        for (int i = 0; i < matrix.length / 2; i++)
        {
            for (int j = i; j <= n - i - 1; j++)
            {
                int preI = i;
                int preJ = j;
                int pre = matrix[preI][preJ];
                int nextI = preJ;
                int nextJ = n - preI;
                int tmp = matrix[preI][preJ];
                while (nextI != i || nextJ != j)
                {
                    tmp = matrix[nextI][nextJ];
                    matrix[nextI][nextJ] = pre;
                    pre = tmp;
                    preI = nextI;
                    preJ = nextJ;
                    nextI = preJ;
                    nextJ = n - preI;
                }
                matrix[i][j] = tmp;
            }
        }
    }

    public static void main(String[] args)
    {
//        Q48_RotateImage q = new Q48_RotateImage();
//        int[][] matrix = {{0, 1, 2, 4}, {3, 4, 5, 6}, {6, 7, 8, 9}, {10, 11, 12, 13}};
//        q.rotate(matrix);
//        for (int i = 0; i < matrix.length; i++)
//        {
//            for (int j = 0; j < matrix.length; j++)
//                System.out.print(matrix[i][j] + " ");
//            System.out.println();
//        }
        Object o = new Object();
        synchronized (o)
        {
            try {
                o.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int i = 0;
            while (true)
                System.out.println(i++);
        }
    }
}

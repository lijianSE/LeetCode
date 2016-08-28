package com.company;

import java.util.TreeSet;

/**
 * Created by LiJian on 2016/8/27.
 * Describe : This class is responsible for
 */
public class Q207_CourseSchedule
{
    public boolean canFinish(int numCourses, int[][] prerequisites)
    {
        boolean[][] board = new boolean[numCourses][numCourses];
        for (int i = 0; i < prerequisites.length; i++)
            board[prerequisites[i][0]][prerequisites[i][1]] = true;
        return false;
    }

    private boolean check(boolean[][] board, int index)
    {
        return false;
    }

    public static void main(String[] args)
    {
        String foo1 = args[1];
        String foo2 = args[2];
        String foo3 = args[3];
    }
}

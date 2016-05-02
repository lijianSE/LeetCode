package com.company;



public class Main
{
    public static int solution(int n, int t, int m, int[] nums)
    {
        dfs(1, t, t, m, nums, 0, 0);
        return max;
    }

    private static int max = 0;

    /**
     *
     * @param tIndex 第几个背包
     * @param t      背包容积
     * @param tRemind  当前背包剩余容量
     * @param nums
     * @param count    已放进几个物品
     * @param index    遍历到第几个物品了
     */
    private static void dfs(int tIndex, int t, int tRemind, int m, int[] nums, int count, int index)
    {
        if (index == nums.length || tIndex > m)
        {
            max = Math.max(max, count);
            return;
        }
        if (count + nums.length - index <= max)
            return;
        for (int i = index; i < nums.length; i++)
        {
            if (tRemind < nums[i])
            {
                dfs(tIndex + 1, t, t, m, nums, count, i);
            }
            else
            {
                dfs(tIndex, t, tRemind - nums[i], m, nums, count + 1, i + 1);
                dfs(tIndex + 1, t, t, m, nums, count, i);
            }
        }
    }



    public static void main(String[] args) {
        int n = 5, t = 5, m = 2;
        int[] num = {4,3,4,2,1};
        System.out.println(solution(n, t, m, num));

    }
}

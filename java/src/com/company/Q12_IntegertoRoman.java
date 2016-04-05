package com.company;

/**
 * Created by LiJian on 2016/3/14.
 * Describe : This class is responsible for
 */
public class Q12_IntegertoRoman
{
    private final int I = 1;
    private final int V = 5;
    private final int X = 10;
    private final int L = 50;
    private final int C = 100;
    private final int D = 500;
    private final int M = 1000;
    public String intToRoman(int num)
    {
        StringBuilder sb = new StringBuilder();

        int tmp = num / M;
        for (int i = 0; i < tmp; i++)
            sb.append('M');
        num %= M;

        tmp = num / C;
        build(tmp, 'M', 'D', 'C', sb);
        num %= C;

        tmp = num / X;
        build(tmp, 'C', 'L', 'X', sb);
        num %= X;

        tmp = num;
        build(tmp, 'X', 'V', 'I', sb);
        return sb.toString();

    }

    private void build(int tmp, char X, char V, char I, StringBuilder sb)
    {
        if (tmp == 9)
           sb.append(I).append(X);
        else if (tmp >= 5)
        {
            sb.append(V);
            for (int i = 5; i < tmp; i++)
                sb.append(I);
        }
        else if (tmp == 4)
        {
            sb.append(I).append(V);
        }
        else
        {
            for (int i = 0; i < tmp; i++)
                sb.append(I);
        }
    }

    public static void main(String[] args) {
        Q12_IntegertoRoman q = new Q12_IntegertoRoman();
        int num = 99;
        System.out.println(q.intToRoman(num));
    }
}

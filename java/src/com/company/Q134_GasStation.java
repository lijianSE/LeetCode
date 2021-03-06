package com.company;

/**
 * Created by LiJian on 2016/6/2.
 * Describe : This class is responsible for
 */
public class Q134_GasStation
{
    public int canCompleteCircuit(int[] gas, int[] cost)
    {
        if(gas == null || gas.length == 0) return -1;
        int sum = 0;
        int tempSum = 0;
        int index = 0;
        for(int i = 0; i < gas.length; i++){
            sum += gas[i] - cost[i];
            tempSum += gas[i] - cost[i];
            if(tempSum < 0) {
                tempSum = 0;
                index = i+1;
            }
        }
        return sum < 0 ? -1 : index;
    }
}

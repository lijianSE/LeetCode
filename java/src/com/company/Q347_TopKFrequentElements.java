package com.company;

import java.util.*;

/**
 * Created by LJ on 2016/5/5.
 * Describe : This class is responsible for
 */
public class Q347_TopKFrequentElements
{
    class Num implements Comparable<Num>
    {
        int num;
        int f;

        public Num(int num, int f)
        {
            this.num = num;
            this.f = f;
        }

        @Override
        public int compareTo(Num o)
        {
            return o.f - this.f;
        }
    }

    class Heap
    {
        Num[] arr;
        int size = 0;
        int index = 1;
        public Heap(int k)
        {
            arr = new Num[k + 2];
        }

        public void add(Num num)
        {
            if (size == arr.length - 2)
            {

            }
            else
            {
                arr[index] = num;
                up(index++);
                size++;
            }
        }

        private int findFatherIndex(int index)
        {
            return index / 2;
        }

        private void swap(int a,int b)
        {
            Num tmp = arr[a];
            arr[a] = arr[b];
            arr[b] = tmp;
        }


        private void up(int index)
        {
            int fatherIndex = findFatherIndex(index);
            while (fatherIndex != 0)
            {
                if (arr[fatherIndex].f < arr[index].f)
                {
                    swap(fatherIndex, index);
                    index = fatherIndex;
                    fatherIndex = findFatherIndex(index);
                }
                else
                    return;
            }
        }


    }


    public List<Integer> topKFrequent(int[] nums, int k)
    {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums)
            add(map, num);
        PriorityQueue<Num> pq = new PriorityQueue<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            Num num = new Num(entry.getKey(), entry.getValue());
            pq.add(num);

        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; i++)
        {
            result.add(pq.remove().num);
        }
        return result;
    }

    private void add(Map<Integer, Integer> map, int num)
    {
        if (map.containsKey(num))
            map.put(num, map.get(num) + 1);
        else
            map.put(num, 1);
    }

    public static void main(String[] args)
    {
        Q347_TopKFrequentElements q = new Q347_TopKFrequentElements();
        int[] nums = {1,1,1,2,2,3};
        System.out.println(q.topKFrequent(nums, 2));
    }

}

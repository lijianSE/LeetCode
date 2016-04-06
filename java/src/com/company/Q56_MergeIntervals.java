package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by LJ on 2016/4/6.
 * Describe : This class is responsible for
 */
public class Q56_MergeIntervals
{
    private class IntervalStartBasedComparator implements Comparator<Interval>
    {
        @Override
        public int compare(Interval o1, Interval o2)
        {
            return o1.start - o2.start;
        }
    }
    public List<Interval> merge(List<Interval> intervals)
    {
        if (intervals.size() == 0)
            return new ArrayList<>();
        PriorityQueue<Interval> pq = new PriorityQueue<>(new IntervalStartBasedComparator());
        for (Interval interval : intervals)
            pq.add(interval);

        List<Interval> result = new ArrayList<>();
        Interval overlap = pq.remove();
        while (!pq.isEmpty())
        {
            Interval tmp = pq.remove();
            if (tmp.start >= overlap.start && tmp.end <= overlap.end)
                continue;
            else if (tmp.start > overlap.end)
            {
                result.add(overlap);
                overlap = tmp;
            }
            else
            {
                overlap.end = tmp.end;
            }
        }
        result.add(overlap);
        return result;
    }

    public static void main(String[] args) {
        Q56_MergeIntervals q = new Q56_MergeIntervals();
        List<Interval> list = new ArrayList<>();
        list.add(new Interval(1,3));
        list.add(new Interval(2,6));
        list.add(new Interval(8,10));
        list.add(new Interval(15,18));
        List<Interval> result = q.merge(list);
        for (Interval interval : result)
        {
            System.out.println("[" + interval.start + "," + interval.end + "]");
        }
    }
}

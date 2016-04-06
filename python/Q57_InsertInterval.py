__author__ = 'LJ'

from Interval import Interval

class Solution(object):
    def insert(self, intervals, newInterval):
        """
        :type intervals: List[Interval]
        :type newInterval: Interval
        :rtype: List[Interval]
        """
        if intervals.__len__() == 0:
            return [newInterval]
        result = []
        flag = False
        for i in range(intervals.__len__()):
            if newInterval.start > intervals[i].end:
                result.append(intervals[i])
                continue
            if newInterval.end < intervals[i].start:
                result.append(newInterval)
                result.append(intervals[i])
                flag = True
                break
            newInterval = self.merge(intervals[i], newInterval)
        if flag:
            i += 1
            result.extend(intervals[i : intervals.__len__()])
        else:
            result.append(newInterval)
        return result




    def merge(self, intervalA, intervalB):
        start = min(intervalA.start, intervalB.start)
        end = max(intervalA.end, intervalB.end)
        return Interval(start, end)


s = Solution()
intervals = [Interval(1, 5)]
newInterval = Interval(0, 0)
result = s.insert(intervals, newInterval)

for interval in result:
    print "%d, %d" % (interval.start, interval.end)
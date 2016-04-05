__author__ = 'LJ'

class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """

        result = []
        dic = {}
        for str in strs:
            l = list(str)
            l.sort()
            s = "".join(l)
            if dic.has_key(s) :
                result[dic[s]].append(str)
            else:
                dic[s] = result.__len__()
                result.append([str])

        for item in result:
            item.sort()
        return result


strs = ["tea","and","ate","eat","den"]
s = Solution()
print s.groupAnagrams(strs)

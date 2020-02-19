#https://leetcode.com/problems/zigzag-conversion/
# Problem 6

class Solution:
    def convert(self, s: str, numRows: int) -> str:
        if numRows == 1:
            return s
        zig_zag = ''
        dict_storage = dict()
        level = 0
        stage = numRows
        for i in s:
            if (level == 1 and stage != numRows):
                stage = numRows
                level = 1
            if (level == stage):
                level -= 2
                stage -= 1
                if (level < 0):
                    level = 1
            if (level not in dict_storage):
                dict_storage[level] = i
            else:
                dict_storage[level] += i
            print(level)
            if ((level < stage) and (stage <= numRows)):
                level += 1
        for i in dict_storage:
            zig_zag += dict_storage[i]
        return zig_zag

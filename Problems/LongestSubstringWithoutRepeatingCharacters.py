# https://leetcode.com/problems/longest-substring-without-repeating-characters/submissions/

class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        len_sub = 0
        subst = []
        for i in s:
            if i not in subst:
                subst.append(i)
            else:
                if (len_sub < len(subst)):
                    len_sub = len(subst)
                subst = subst[subst.index(i) + 1 :]
                subst.append(i)

        if len_sub < len(subst):
            len_sub = len(subst)
        return len_sub

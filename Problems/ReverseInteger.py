# https://leetcode.com/problems/reverse-integer/

class Solution:
    def reverse(self, x: int) -> int:
        reverse = 0
        tens = 0.1
        reverse_list = []
        neg = False
        if (x < 0):
            x = abs(x)
            print(x)
            neg = True
        while(x > 0):
            digit = x % 10
            x = x // 10
            reverse_list.append(digit)
        for r in range(len(reverse_list)):
            digit = reverse_list.pop()
            tens = tens * 10
            reverse += digit * tens
        if neg:
            reverse = reverse * -1
        if reverse < (-1 << 31) or reverse > (1 << 31)-1:
            return 0
        return int(reverse)

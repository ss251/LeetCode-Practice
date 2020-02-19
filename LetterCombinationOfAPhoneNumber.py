# https://leetcode.com/problems/letter-combinations-of-a-phone-number/
# Q17

class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        lower_ascii = 94
        comb_dict = dict()
        comb_list = set()
        comb_dict[2] = ['a', 'b', 'c']
        comb_dict[3] = ['d', 'e', 'f']
        comb_dict[4] = ['g', 'h', 'i']
        comb_dict[5] = ['j', 'k', 'l']
        comb_dict[6] = ['m', 'n', 'o']
        comb_dict[7] = ['p', 'q', 'r', 's']
        comb_dict[8] = ['t', 'u', 'v']
        comb_dict[9] = ['w', 'x', 'y', 'z']

        for i in range(len(digits)):
            comb_list = _helper_add(comb_list, comb_dict[int(digits[i])])
        return comb_list

def _helper_add(list1, list2):
    add_list = []
    if len(list1) < 1:
        return list2
    for l1 in list1:
        for l2 in list2:
            add_list.append(l1 + l2)
    return add_list

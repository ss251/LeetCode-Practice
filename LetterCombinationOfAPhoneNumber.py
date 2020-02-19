# https://leetcode.com/problems/letter-combinations-of-a-phone-number/
# Q17

class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        lower_ascii = 94
        comb_dict = dict()
        comb_list = []
        check_rep = set()
        for s in digits:
            dig = int(s)
            if (dig not in check_rep):
                check_rep.add(dig)
                start_ascii = lower_ascii + 3 * (dig - 1)
                for i in range(3):
                    if dig not in comb_dict:
                        comb_dict[dig] = [chr(start_ascii + i)]
                    else:
                        comb_dict[dig].append(chr(start_ascii + i))
        if 7 in comb_dict:
            comb_dict[7].append('s')
        if 8 in comb_dict:
            comb_dict[8] = ['t','u','v']
        if 9 in comb_dict:
            comb_dict[9] = ['w','x','y','z']
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

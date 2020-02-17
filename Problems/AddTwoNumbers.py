# https://leetcode.com/problems/add-two-numbers/submissions/

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        sum_1 = 0
        sum_2 = 0
        tens = 1
        count = 0

        while (l1.next != None):
            if count >= 1:
                tens = tens * 10
            sum_1 += l1.val * tens
            count += 1
            l1 = l1.next
        if count > 0:
            sum_1 += l1.val * tens * 10
        else:
            sum_1 += l1.val
        count = 0
        tens = 1

        while (l2.next != None):
            if count >= 1:
                tens = tens * 10
            sum_1 += l2.val * tens
            count += 1
            l2 = l2.next

        if count > 0:
            sum_2 += l2.val * tens * 10
        else:
            sum_2 += l2.val

        total = sum_1 + sum_2
        print(total)
        
        l = ListNode(total % 10)
        total = total // 10
        temp = l

        while total > 0:
            temp.next = ListNode(total % 10)
            temp = temp.next
            total = total // 10
        return l

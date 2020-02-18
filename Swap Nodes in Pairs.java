// https://leetcode.com/problems/swap-nodes-in-pairs/submissions/
// Swap Nodes in Pairs

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head != null && head.next != null) {
            ListNode temp2 = head.next.next;
            ListNode temp1 = head;

            head = head.next;
            head.next = temp1;
            temp1.next = temp2;

            while (temp2 != null && temp2.next != null) {
                temp1.next = temp2.next;
                temp2.next = temp2.next.next;
                temp1.next.next = temp2;
                temp1 = temp1.next.next;
                temp2 = temp2.next;
            }
        }
        return head;
    }
}

// Middle of the Linked List
// https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/529/week-2/3290/

class Solution {
    public ListNode middleNode(ListNode head) {
        if (head.next == null) {
            return head;
        }
        ListNode double_speed = head.next.next;
        ListNode middle = head.next;
        while (double_speed!=null && double_speed.next!=null) {
            middle = middle.next;
            double_speed = double_speed.next.next;
        }
        return middle;
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode fast = head, slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode last = slow.next, pre = head;
        while (last.next != null) {
            ListNode tmp = last.next;
            last.next = tmp.next;
            tmp.next = slow.next;
            slow.next = tmp;
        }

        while (slow.next != null) {
            slow = slow.next;
            if (pre.val != slow.val) return false;
            pre = pre.next;
        }
        return true;
    }
}
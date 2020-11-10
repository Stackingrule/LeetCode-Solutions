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
        Deque<Integer> stack = new LinkedList<>();
        stack.push(head.val);
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            stack.push(slow.val);
        }

        if (fast.next == null) stack.pop();
        while (slow.next != null) {
            slow = slow.next;
            int tmp = stack.pop();
            if (tmp != slow.val) return false;
        }
        return true;
    }
}
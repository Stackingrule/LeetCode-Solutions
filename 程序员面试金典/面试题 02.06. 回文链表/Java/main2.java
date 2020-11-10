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
    ListNode cur;
    public boolean isPalindrome(ListNode head) {
        cur = head;
        return helper(head);
    }

    private boolean helper(ListNode node) {
        if (node == null) return true;
        boolean res = helper(node.next) && (node.val == cur.val);
        cur = cur.next;
        return res;
    }
}
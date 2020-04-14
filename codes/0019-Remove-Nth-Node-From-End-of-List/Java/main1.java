/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) return null;
        ListNode pre = head, cur = head;
        for (int i = 0; i < n; ++i) {
        	cur = cur.next;
        }
        if (cur == null) return head.next;
        while (cur.next != null) {
        	cur = cur.next;
        	pre = pre.next;
        }
        pre.next = pre.next.next;
        return head;
    }
}
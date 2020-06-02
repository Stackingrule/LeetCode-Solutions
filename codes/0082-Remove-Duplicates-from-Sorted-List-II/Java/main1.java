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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1), pre = dummy;
        dummy.next = head;
        while (pre.next != null) {
        	ListNode cur = pre.next;
        	while (cur.next != null && cur.val == cur.next.val) {
        		cur = cur.next;
        	}
        	if (cur != pre.next) pre.next = cur.next;
        	else pre = pre.next;
        }
        return dummy.next;
    }
}
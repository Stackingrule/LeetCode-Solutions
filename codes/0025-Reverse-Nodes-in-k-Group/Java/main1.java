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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(-1), pre = dummy, cur = pre;
        dummy.next = head;
        int num = 0;
        while (cur.next != null) {
        	cur = cur.next;
        	++num;
        }
        while (num >= k) {
        	cur = pre.next;
        	for (int i = 1; i < k; ++i) {
        		ListNode temp = cur.next;
        		cur.next = temp.next;
        		temp.next = pre.next;
        		pre.next = temp;
        	}
        	pre = cur;
        	num -= k;
        }
        return dummy.next;
    }
}
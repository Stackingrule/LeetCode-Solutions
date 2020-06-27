/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteNode(ListNode head, int val) {
    	ListNode dummy = new ListNode(-1);
    	dummy.next = head;
    	ListNode pre = dummy, cur = head;
    	while (cur != null) {
    		if (cur.val == val) {
    			pre.next = cur.next;
    		}
    		pre = cur;
    		cur = cur.next;
    	}
    	return dummy.next;
    }
}
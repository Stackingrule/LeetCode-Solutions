/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
    	if (head == null) return null;

    	ListNode cur = head;
    	ListNode small_head = new ListNode(-1);
    	ListNode big_head = new ListNode(-1);
    	ListNode small = small_head;
    	ListNode big = big_head;

    	while (cur != null) {
    		if (cur.val >= x) {
    			big.next = cur;
    			big = big.next;
    			cur = cur.next;
    			big.next = null;
    		}
    		else {
    			small.next = cur;
    			small = small.next;
    			cur = cur.next;
    			small.next = null;
    		}
    	}

    	small.next = big_head.next;
    	return small_head.next;
    }
}
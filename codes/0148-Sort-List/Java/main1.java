/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode fast = head, slow = head, pre = head;
        while (fast != null && fast.next != null) {
        	pre = slow;
        	slow = slow.next;
        	fast = fast.next.next;
        }
        pre.next = null;
        return mergeTwoList(sortList(head), sortList(slow));
    }

    private ListNode mergeTwoList(ListNode l1, ListNode l2) {
    	ListNode dummy = new ListNode(-1);
    	ListNode cur = dummy;
    	while ((l1 != null) && (l2 != null)) {
    		if (l1.val < l2.val) {
    			cur.next = l1;
    			l1 = l1.next;
    		}
    		else {
    			cur.next = l2;
    			l2 = l2.next;
    		}
    		cur = cur.next;
    	}
    	if (l1 != null) cur.next = l1;
    	if (l2 != null) cur.next = l2;
    	return dummy.next;
    }
}
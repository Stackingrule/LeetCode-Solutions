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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode newHead = dummy;

        while (newHead.next != null) {
        	if (newHead.next.val == val) {
        		newHead.next = newHead.next.next;
        	}
        	else {
        		newHead = newHead.next;
        	}
        }

        return dummy.next;
    }
}
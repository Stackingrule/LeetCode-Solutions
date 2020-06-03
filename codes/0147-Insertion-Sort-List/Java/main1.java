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
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(-1), cur = dummy;
        
        while (head != null) {
        	ListNode t = head.next;
        	cur = dummy;
        	while (cur.next != null && cur.next.val <= head.val) {
        		cur = cur.next;
        	}
        	head.next = cur.next;
        	cur.next = head;
        	head = t;
        }
        return dummy.next;
    }
}
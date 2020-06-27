/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
    	int len = 0;
    	ListNode cur = head;
    	while (cur != null) {
    		++len;
    		cur = cur.next;
    	}

    	ListNode newHead = head;
    	for (int i = 0; i < len - k; ++i) {
    		newHead = newHead.next;
    	}

    	return newHead;
    }
}
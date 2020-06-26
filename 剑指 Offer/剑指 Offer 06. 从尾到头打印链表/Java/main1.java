/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] reversePrint(ListNode head) {
    	ListNode newHead = head;
    	int len = 0;
    	while (newHead != null) {
    		++len;
    		newHead = newHead.next;
    	}

    	int[] res = new int[len];
    	while (head != null) {
    		res[--len] = head.val;
    		head = head.next;
    	}

    	return res;
    }
}